package shopclothes.dao.masterdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shopclothes.model.masterdata.SizeEntity;

@Repository
public interface SizeRepository extends JpaRepository<SizeEntity, Long> {
}
