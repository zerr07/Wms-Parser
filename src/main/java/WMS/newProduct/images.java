package WMS.newProduct;

import java.util.ArrayList;
import java.util.List;

public class images {
    private final List<String> image = new ArrayList<>();
    public images(String image){
        this.image.add("new");
        this.image.add(image);
    }
    public String getImage() {
        return image.get(1);
    }
}
