package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Islemler")
public class Islemler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long islemId;

    @ManyToOne
    @JoinColumn(name = "HesapID")
    private Hesaplar hesap;

    @ManyToOne
    @JoinColumn(name = "SubeID")
    private Subeler sube;

    private double tutar;
    private Date tarih;

    @Column(name = "Islem_Turu")
    private String islemTuru; // e.g., Para Çekme, Para Yatırma, Havale, EFT

    public Long getIslemId() {
        return islemId;
    }

    public void setIslemId(Long islemId) {
        this.islemId = islemId;
    }

    public Hesaplar getHesap() {
        return hesap;
    }

    public void setHesap(Hesaplar hesap) {
        this.hesap = hesap;
    }

    public Subeler getSube() {
        return sube;
    }

    public void setSube(Subeler sube) {
        this.sube = sube;
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

    public String getIslemTuru() {
        return islemTuru;
    }

    public void setIslemTuru(String islemTuru) {
        this.islemTuru = islemTuru;
    }
}


