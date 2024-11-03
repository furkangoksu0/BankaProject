package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Havale")
public class Havale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long havaleId;

    @ManyToOne
    @JoinColumn(name = "GonderenHesapID")
    private Hesaplar gonderenHesap;

    @ManyToOne
    @JoinColumn(name = "AliciHesapID")
    private Hesaplar aliciHesap;

    private double tutar;
    private Date tarih;
    private String aciklama;

    public Long getHavaleId() {
        return havaleId;
    }

    public void setHavaleId(Long havaleId) {
        this.havaleId = havaleId;
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


