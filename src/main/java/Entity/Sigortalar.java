package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Sigortalar")
public class Sigortalar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sigortaId;

    @ManyToOne
    @JoinColumn(name = "MusteriID")
    private Musteriler musteri;

    @Column(name = "Sigorta_Turu")
    private String sigortaTuru; // e.g., Hayat, Sağlık, Araç
    @Column(name = "Baslangic_Tarihi")
    private Date baslangicTarihi;
    @Column(name = "Bitis_Tarihi")
    private Date bitisTarihi;
    @Column(name = "Prim_Miktari")
    private double primMiktari;

    public Long getSigortaId() {
        return sigortaId;
    }

    public void setSigortaId(Long sigortaId) {
        this.sigortaId = sigortaId;
    }

    public Musteriler getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteriler musteri) {
        this.musteri = musteri;
    }

    public String getSigortaTuru() {
        return sigortaTuru;
    }

    public void setSigortaTuru(String sigortaTuru) {
        this.sigortaTuru = sigortaTuru;
    }

    public Date getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(Date baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public Date getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(Date bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public double getPrimMiktari() {
        return primMiktari;
    }

    public void setPrimMiktari(double primMiktari) {
        this.primMiktari = primMiktari;
    }
}

