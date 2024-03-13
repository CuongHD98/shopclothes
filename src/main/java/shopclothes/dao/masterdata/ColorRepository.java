package shopclothes.dao.masterdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shopclothes.model.masterdata.ColorEntity;

@Repository
public interface ColorRepository extends JpaRepository<ColorEntity, Long> {
}
