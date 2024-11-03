package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Odeme_Planlari")
public class OdemePlanlari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;

    @ManyToOne
    @JoinColumn(name = "KrediID")
    private Krediler kredi;

    @Column(name = "Taksit_Miktari")
    private double taksitMiktari;
    @Column(name = "Taksit_Tarihi")
    private String taksitTarihi; // Use a date type if necessary

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Krediler getKredi() {
        return kredi;
    }

    public void setKredi(Krediler kredi) {
        this.kredi = kredi;
    }

    public double getTaksitMiktari() {
        return taksitMiktari;
    }

    public void setTaksitMiktari(double taksitMiktari) {
        this.taksitMiktari = taksitMiktari;
    }

    public String getTaksitTarihi() {
        return taksitTarihi;
    }

    public void setTaksitTarihi(String taksitTarihi) {
        this.taksitTarihi = taksitTarihi;
    }
}


