package shopclothes.response.masterdata.category;

import lombok.Data;
import shopclothes.model.masterdata.CategoryEntity;

@Data
public class CategoryResponse {
    private long categoryId;
    private String categoryName;

    public static CategoryResponse toDomain(CategoryEntity entity) {
        CategoryResponse response = new CategoryResponse();
        response.setCategoryId(entity.getCategoryId());
        response.setCategoryName(entity.getCategoryName());

        return response;
    }
}
