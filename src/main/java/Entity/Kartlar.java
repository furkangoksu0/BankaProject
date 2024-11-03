package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Kartlar")
public class Kartlar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kartId;

    @ManyToOne
    @JoinColumn(name = "HesapID")
    private Hesaplar hesap;

    @Column(name = "Kart_Turu")
    private String kartTuru; // e.g., Kredi, Banka
    @Column(name = "Kart_Numara")
    private String kartNumara;
    @Column(name = "Son_Kullanma_Tarihi")
    private String sonKullanmaTarihi; // Use a date type if necessary
    private String cvv;

    public Long getKartId() {
        return kartId;
    }

    public void setKartId(Long kartId) {
        this.kartId = kartId;
    }

    public Hesaplar getHesap() {
        return hesap;
    }

    public void setHesap(Hesaplar hesap) {
        this.hesap = hesap;
    }

    public String getKartTuru() {
        return kartTuru;
    }

    public void setKartTuru(String kartTuru) {
        this.kartTuru = kartTuru;
    }

    public String getKartNumara() {
        return kartNumara;
    }

    public void setKartNumara(String kartNumara) {
        this.kartNumara = kartNumara;
    }

    public String getSonKullanmaTarihi() {
        return sonKullanmaTarihi;
    }

    public void setSonKullanmaTarihi(String sonKullanmaTarihi) {
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}


