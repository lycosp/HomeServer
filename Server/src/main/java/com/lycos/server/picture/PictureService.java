package com.lycos.server.picture;

import java.util.ArrayList;
import java.util.List;

public class PictureService {

    private List<Picture> pictures = new ArrayList<>();

    public PictureService() {
        pictures.add(new Picture(1, "Monkey", "10KB", "jpg"));
        pictures.add(new Picture(2, "Horse", "15KB", "png"));
        pictures.add(new Picture(3, "Funny", "13MB", "gif"));
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public Picture getPicture(int id) {
        for (Picture picture : pictures) {
            if (picture.getId() == id)
                return picture;
        }
        return new Picture();
    }
}
