package shopclothes.response.masterdata.size;

import lombok.Data;
import shopclothes.model.masterdata.SizeEntity;

@Data
public class SizeResponse {
    private long sizeId;
    private int sizeNum;

    public static SizeResponse toDomain(SizeEntity entity) {
        SizeResponse response = new SizeResponse();
        response.setSizeId(entity.getSizeId());
        response.setSizeNum(entity.getSizeNum());

        return response;
    }
}
