package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "talepler")
public class Talepler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long talepId;

    @ManyToOne
    @JoinColumn(name = "musteriId", nullable = false)
    private Musteriler musteri;

    private String talepTuru;

    @Temporal(TemporalType.DATE)
    private Date talepTarihi;

    public Long getTalepId() {
        return talepId;
    }

    public void setTalepId(Long talepId) {
        this.talepId = talepId;
    }

    public Musteriler getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteriler musteri) {
        this.musteri = musteri;
    }

    public String getTalepTuru() {
        return talepTuru;
    }

    public void setTalepTuru(String talepTuru) {
        this.talepTuru = talepTuru;
    }

    public Date getTalepTarihi() {
        return talepTarihi;
    }

    public void setTalepTarihi(Date talepTarihi) {
        this.talepTarihi = talepTarihi;
    }
}

