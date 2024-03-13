package shopclothes.service.masterdata.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import shopclothes.dao.masterdata.ProductRepository;
import shopclothes.response.masterdata.product.ProductResponse;
import shopclothes.service.masterdata.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<List<ProductResponse>> getListProduct() {
        List<ProductResponse> responseList = productRepository.findAll()
                .stream().map(ProductResponse::toDomain).collect(Collectors.toList());
        ResponseEntity<List<ProductResponse>> response = new ResponseEntity<>(responseList, HttpStatus.OK);

        return response;
    }
}
