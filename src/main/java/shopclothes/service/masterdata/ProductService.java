package shopclothes.service.masterdata;

import org.springframework.http.ResponseEntity;
import shopclothes.response.masterdata.product.ProductResponse;

import java.util.List;

public interface ProductService {

    ResponseEntity<List<ProductResponse>> getListProduct();

}
