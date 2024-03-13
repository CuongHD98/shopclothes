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
@Table(name = "category")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categories_id", nullable = false)
    private Long categoryId;

    @Column(name = "categories_name", length = CommonConstant.MAX_LENGTH_TEXT)
    private String categoryName;

    @Column(name = "create_date", columnDefinition = "date")
    private Date createDate;

    @Column(name = "update_date", columnDefinition = "date")
    private Date updateDate;

    @OneToMany(mappedBy = "categoryEntity")
    private List<ProductEntity> productEntityList;

}
