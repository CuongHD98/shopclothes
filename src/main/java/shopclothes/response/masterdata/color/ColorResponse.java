package shopclothes.response.masterdata.color;

import lombok.Data;
import shopclothes.model.masterdata.ColorEntity;

@Data
public class ColorResponse {
    private long colorId;
    private String colorName;

    public static ColorResponse toDomain(ColorEntity entity) {
        ColorResponse response = new ColorResponse();
        response.setColorId(entity.getColorId());
        response.setColorName(entity.getColorName());

        return response;
    }
}
