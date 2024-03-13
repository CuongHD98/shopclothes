package shopclothes.model.masterdata;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import shopclothes.constant.common.CommonConstant;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "product_name", nullable = false, length = CommonConstant.MAX_LENGTH_TEXT)
    private String productName;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "quantity", nullable = false)
    private Long quantity;

    @Column(name = "description", length = CommonConstant.MAX_LENGTH_TEXT_AREA)
    private String description;

    @Column(name = "create_date", columnDefinition = "date")
    private Date createDate;

    @Column(name = "update_date", columnDefinition = "date")
    private Date updateDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private ColorEntity colorEntity;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private SizeEntity sizeEntity;

}
