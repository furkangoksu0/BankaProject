package Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Kredi")
public class Kredi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KrediID")
    private Long krediID;

    @ManyToOne
    @JoinColumn(name = "MusteriID", nullable = false)
    private Musteriler musteri;

    @Column(name = "Miktar", nullable = false)
    private Double miktar;

    @Column(name = "KrediTuru", length = 50, nullable = false)
    private String krediTuru;

    @OneToMany(mappedBy = "kredi", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<KrediOdeme> odemeler;

    // Getter ve Setter
}

