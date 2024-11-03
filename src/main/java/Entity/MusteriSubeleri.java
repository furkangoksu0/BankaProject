package Entity;

import CompositeKey.MusteriSubeleriId;
import jakarta.persistence.*;

@Entity
@Table(name = "Musteri_Subeleri")
@IdClass(MusteriSubeleriId.class)
public class MusteriSubeleri {
    @Id
    @Column(name = "MusteriID")
    private Long musteriId;

    @Id
    @Column(name = "SubeID")
    private Long subeId;

    public Long getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Long musteriId) {
        this.musteriId = musteriId;
    }

    public Long getSubeId() {
        return subeId;
    }

    public void setSubeId(Long subeId) {
        this.subeId = subeId;
    }
}


