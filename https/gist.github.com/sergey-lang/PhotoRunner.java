package OOP.project.project_v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey Lang on 15.10.2016.
 */
public class PhotoRunner {
    public static void main(String[] args) {
        Photo photo1 = new Photo("Photo1", 1243, 50, Photo.Topic.Architecture, Photo.Quality.high);
        Photo photo2 = new Photo("Photo2", 1253, 70, Photo.Topic.Techno, Photo.Quality.medium);

        List<Photo> photos = new ArrayList<>();

        photos.add(photo1);
        photos.add(photo2);
        User user = new User("John", "johnsmith@gmail.com", 123456879);
        user.setPhotoCollection(photos);

        System.out.println("UserName is: " + photo1.getUser().getName());
    }
}
