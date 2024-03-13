package shopclothes.model.masterdata;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import shopclothes.constant.common.CommonConstant;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "size")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id", nullable = false)
    private Long sizeId;

    @Column(name = "size_num", nullable = false, length = CommonConstant.MAX_LENGTH_SMALL_NUMERIC)
    private Integer sizeNum;

    @Column(name = "create_date", columnDefinition = "date")
    private Date createDate;

    @Column(name = "update_date", columnDefinition = "date")
    private Date updateDate;

    @OneToMany(mappedBy = "sizeEntity")
    private List<ProductEntity> productEntityList;

}
