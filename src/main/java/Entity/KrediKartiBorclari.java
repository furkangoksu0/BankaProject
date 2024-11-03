package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Kredi_Karti_Borclari")
public class KrediKartiBorclari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borcId;

    @ManyToOne
    @JoinColumn(name = "KartID")
    private Kartlar kart;

    @Column(name = "Borc_Miktari")
    private double borcMiktari;
    @Column(name = "Minimum_Odeme")
    private double minimumOdeme;
    @Column(name = "Son_Odeme_Tarihi")
    private String sonOdemeTarihi; // Use a date type if necessary

    public Long getBorcId() {
        return borcId;
    }

    public void setBorcId(Long borcId) {
        this.borcId = borcId;
    }

    public Kartlar getKart() {
        return kart;
    }

    public void setKart(Kartlar kart) {
        this.kart = kart;
    }

    public double getBorcMiktari() {
        return borcMiktari;
    }

    public void setBorcMiktari(double borcMiktari) {
        this.borcMiktari = borcMiktari;
    }

    public double getMinimumOdeme() {
        return minimumOdeme;
    }

    public void setMinimumOdeme(double minimumOdeme) {
        this.minimumOdeme = minimumOdeme;
    }

    public String getSonOdemeTarihi() {
        return sonOdemeTarihi;
    }

    public void setSonOdemeTarihi(String sonOdemeTarihi) {
        this.sonOdemeTarihi = sonOdemeTarihi;
    }
}

