package Entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Musteriler")
public class Musteriler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long musteriId;

    private String ad;
    private String soyad;
    @Column(name = "TC_Kimlik_No")
    private String tcKimlikNo;
    private String telefon;
    private String adres;
    private String eposta;
    @Column(name = "Dogum_Tarihi")
    private Date dogumTarihi;

    @OneToMany(mappedBy = "musteri")
    private Set<Hesaplar> hesaplar;

    public Long getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Long musteriId) {
        this.musteriId = musteriId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public Set<Hesaplar> getHesaplar() {
        return hesaplar;
    }

    public void setHesaplar(Set<Hesaplar> hesaplar) {
        this.hesaplar = hesaplar;
    }
}


