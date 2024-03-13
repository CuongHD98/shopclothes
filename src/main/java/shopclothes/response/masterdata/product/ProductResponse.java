package shopclothes.response.masterdata.product;

import lombok.Data;
import org.apache.logging.log4j.util.Strings;
import shopclothes.model.masterdata.ProductEntity;

import java.io.Serializable;

@Data
public class ProductResponse implements Serializable {
    private long productId;
    private String productName;
    private double price;
    private long quantity;
    private String description;

    public static ProductResponse toDomain(ProductEntity entity) {
        ProductResponse response = new ProductResponse();
        response.setProductId(entity.getProductId());
        response.setProductName(entity.getProductName());
        response.setPrice(entity.getPrice());
        response.setQuantity(entity.getQuantity());
        response.setDescription(Strings.isEmpty(entity.getDescription()) ? Strings.EMPTY : entity.getDescription());

        return response;
    }


}
