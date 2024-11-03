package Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "KrediOdeme")
public class KrediOdeme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OdemeID")
    private Long odemeID;

    @ManyToOne
    @JoinColumn(name = "KrediID", nullable = false)
    private Krediler kredi;

    @Column(name = "OdemeTarihi", nullable = false)
    private LocalDate odemeTarihi;

    @Column(name = "Tutar", nullable = false)
    private Double tutar;

    public Long getOdemeID() {
        return odemeID;
    }

    public void setOdemeID(Long odemeID) {
        this.odemeID = odemeID;
    }

    public Krediler getKredi() {
        return kredi;
    }

    public void setKredi(Krediler kredi) {
        this.kredi = kredi;
    }

    public LocalDate getOdemeTarihi() {
        return odemeTarihi;
    }

    public void setOdemeTarihi(LocalDate odemeTarihi) {
        this.odemeTarihi = odemeTarihi;
    }

    public Double getTutar() {
        return tutar;
    }

    public void setTutar(Double tutar) {
        this.tutar = tutar;
    }
}

