package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EFT")
public class EFT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eftId;

    @ManyToOne
    @JoinColumn(name = "GonderenHesapID")
    private Hesaplar gonderenHesap;

    @ManyToOne
    @JoinColumn(name = "AliciHesapID")
    private Hesaplar aliciHesap;

    private double tutar;
    private Date tarih;
    private String aciklama;

    public Long getEftId() {
        return eftId;
    }

    public void setEftId(Long eftId) {
        this.eftId = eftId;
    }

    public Hesaplar getGonderenHesap() {
        return gonderenHesap;
    }

    public void setGonderenHesap(Hesaplar gonderenHesap) {
        this.gonderenHesap = gonderenHesap;
    }

    public Hesaplar getAliciHesap() {
        return aliciHesap;
    }

    public void setAliciHesap(Hesaplar aliciHesap) {
        this.aliciHesap = aliciHesap;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}


