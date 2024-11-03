package Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "subeler")
public class Subeler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subeId;

    private String subeAdi;
    private String subeKodu;
    private String adres;

    @OneToMany(mappedBy = "sube")
    private List<Islemler> islemler;

    // Getter ve Setter
}



