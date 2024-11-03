package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Kredi_Basvurulari")
public class KrediBasvurulari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long basvuruId;

    @ManyToOne
    @JoinColumn(name = "MusteriID")
    private Musteriler musteri;

    @Column(name = "Kredi_Miktari")
    private double krediMiktari;
    @Column(name = "Faiz_Orani")
    private double faizOrani;
    private int vade; // Vade
    @Column(name = "Basvuru_Tarihi")
    private Date basvuruTarihi;

    public Long getBasvuruId() {
        return basvuruId;
    }

    public void setBasvuruId(Long basvuruId) {
        this.basvuruId = basvuruId;
    }

    public Musteriler getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteriler musteri) {
        this.musteri = musteri;
    }

    public double getKrediMiktari() {
        return krediMiktari;
    }

    public void setKrediMiktari(double krediMiktari) {
        this.krediMiktari = krediMiktari;
    }

    public double getFaizOrani() {
        return faizOrani;
    }

    public void setFaizOrani(double faizOrani) {
        this.faizOrani = faizOrani;
    }

    public int getVade() {
        return vade;
    }

    public void setVade(int vade) {
        this.vade = vade;
    }

    public Date getBasvuruTarihi() {
        return basvuruTarihi;
    }

    public void setBasvuruTarihi(Date basvuruTarihi) {
        this.basvuruTarihi = basvuruTarihi;
    }
}


