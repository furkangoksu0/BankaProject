package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Nakit_Avans")
public class NakitAvans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long avansId;

    @ManyToOne
    @JoinColumn(name = "KartID")
    private Kartlar kart;

    private double tutar;
    private Date tarih;

    @Column(name = "Faiz_Orani")
    private double faizOrani;

    public Long getAvansId() {
        return avansId;
    }

    public void setAvansId(Long avansId) {
        this.avansId = avansId;
    }

    public Kartlar getKart() {
        return kart;
    }

    public void setKart(Kartlar kart) {
        this.kart = kart;
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

    public double getFaizOrani() {
        return faizOrani;
    }

    public void setFaizOrani(double faizOrani) {
        this.faizOrani = faizOrani;
    }
}

