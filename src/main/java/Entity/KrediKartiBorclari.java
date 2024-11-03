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

    // Getters and Setters
}

