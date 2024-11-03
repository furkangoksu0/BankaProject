package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "efttransferleri")
public class EftTransferleri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eftId;

    @ManyToOne
    @JoinColumn(name = "gonderenHesapId", nullable = false)
    private Hesaplar gonderenHesap;

    @ManyToOne
    @JoinColumn(name = "aliciHesapId", nullable = false)
    private Hesaplar aliciHesap;

    private Double tutar;

    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;

    private String aciklama;

    // Getter ve Setter
}

