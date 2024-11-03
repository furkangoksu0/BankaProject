package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Yatirim_Hesaplari")
public class YatirimHesaplari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long yatirimId;

    @ManyToOne
    @JoinColumn(name = "MusteriID")
    private Musteriler musteri;

    private double tutar;

    @Column(name = "Yatirim_Turu")
    private String yatirimTuru; // e.g., Fon, Hisse Senedi
    @Column(name = "Baslangic_Tarihi")
    private Date baslangicTarihi;
    @Column(name = "Bitis_Tarihi")
    private Date bitisTarihi;

    public Long getYatirimId() {
        return yatirimId;
    }

    public void setYatirimId(Long yatirimId) {
        this.yatirimId = yatirimId;
    }

    public Musteriler getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteriler musteri) {
        this.musteri = musteri;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public String getYatirimTuru() {
        return yatirimTuru;
    }

    public void setYatirimTuru(String yatirimTuru) {
        this.yatirimTuru = yatirimTuru;
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
}


