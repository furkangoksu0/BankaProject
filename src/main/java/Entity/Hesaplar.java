package Entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Hesaplar")
public class Hesaplar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hesapId;

    @ManyToOne
    @JoinColumn(name = "MusteriID")
    private Musteriler musteri;

    @Column(name = "Hesap_Turu")
    private String hesapTuru; // e.g., Vadesiz, Vadeli
    private double bakiye;
    @Column(name = "Acilis_Tarihi")
    private Date acilisTarihi;

    @OneToMany(mappedBy = "hesap")
    private Set<Islemler> islemler;

    public Long getHesapId() {
        return hesapId;
    }

    public void setHesapId(Long hesapId) {
        this.hesapId = hesapId;
    }

    public Musteriler getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteriler musteri) {
        this.musteri = musteri;
    }

    public String getHesapTuru() {
        return hesapTuru;
    }

    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public Date getAcilisTarihi() {
        return acilisTarihi;
    }

    public void setAcilisTarihi(Date acilisTarihi) {
        this.acilisTarihi = acilisTarihi;
    }

    public Set<Islemler> getIslemler() {
        return islemler;
    }

    public void setIslemler(Set<Islemler> islemler) {
        this.islemler = islemler;
    }
}




