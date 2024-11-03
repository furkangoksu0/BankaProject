package CompositeKey;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MusteriSubeleriId implements Serializable {
    private Long musteriId;
    private Long subeId;


    public MusteriSubeleriId() {}

    public MusteriSubeleriId(Long musteriId, Long subeId) {
        this.musteriId = musteriId;
        this.subeId = subeId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusteriSubeleriId)) return false;
        MusteriSubeleriId that = (MusteriSubeleriId) o;
        return Objects.equals(musteriId, that.musteriId) &&
                Objects.equals(subeId, that.subeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(musteriId, subeId);
    }
}

