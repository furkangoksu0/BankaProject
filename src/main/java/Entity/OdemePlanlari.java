package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "odemeplanlari")
public class OdemePlanlari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;

    @ManyToOne
    @JoinColumn(name = "krediId", nullable = false)
    private Krediler kredi;

    private Double taksitMiktari;

    @Temporal(TemporalType.DATE)
    private Date taksitTarihi;

    // Getter ve Setter
}

