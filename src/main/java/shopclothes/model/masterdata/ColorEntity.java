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
@Table(name = "color")
public class ColorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "color_id", nullable = false)
    private Long colorId;

    @Column(name = "color_name", nullable = false, length = CommonConstant.MAX_LENGTH_TEXT)
    private String colorName;

    @Column(name = "create_date", columnDefinition = "date")
    private Date createDate;

    @Column(name = "update_date", columnDefinition = "date")
    private Date updateDate;

    @OneToMany(mappedBy = "colorEntity")
    private List<ProductEntity> productEntityList;

}
