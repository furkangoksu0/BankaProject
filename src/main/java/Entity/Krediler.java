package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Krediler")
public class Krediler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long krediId;

    @ManyToOne
    @JoinColumn(name = "MusteriID")
    private Musteriler musteri;

    @Column(name = "Kredi_Miktari")
    private double krediMiktari;
    @Column(name = "Faiz_Orani")
    private double faizOrani;
    private int vade; // Vade
    @Column(name = "Odeme_Miktari")
    private double odemeMiktari;
    @Column(name = "Kalan_Borc")
    private double kalanBorc;

    public Long getKrediId() {
        return krediId;
    }

    public void setKrediId(Long krediId) {
        this.krediId = krediId;
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

    public double getOdemeMiktari() {
        return odemeMiktari;
    }

    public void setOdemeMiktari(double odemeMiktari) {
        this.odemeMiktari = odemeMiktari;
    }

    public double getKalanBorc() {
        return kalanBorc;
    }

    public void setKalanBorc(double kalanBorc) {
        this.kalanBorc = kalanBorc;
    }
}



