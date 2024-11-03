package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Musteri_Subeleri")
@IdClass(MusteriSubeId.class)
public class MusteriSubeleri {
    @Id
    @Column(name = "MusteriID")
    private Long musteriId;

    @Id
    @Column(name = "SubeID")
    private Long subeId;

    // Getters and Setters
}


