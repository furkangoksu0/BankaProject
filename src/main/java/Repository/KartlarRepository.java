package Repository;

import Entity.Kartlar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KartlarRepository extends JpaRepository<Kartlar, Long> {
}

