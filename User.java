package OOP.project.project_v2;

import java.util.List;

/**
 * Created by Sergey Lang on 15.10.2016.
 */
public class User {
    private String name;
    private String email;
    private long birthDate;
    private List<Photo> photoCollection = new ArrayList<>();

    public User(String name, String email, long birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public List<Photo> getPhotoCollection() {
        return photoCollection;
    }

    public void setPhotoCollection(List<Photo> photoCollection) {
        this.photoCollection = photoCollection;
        for (Photo photo : photoCollection) {
            photo.setUser(this);
        }

    }
    
    public void addPhoto(Photo photo) {
        photoCollection.add(photo);
        photo.setUser(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", photoCollection=" + photoCollection +
                '}';
    }
}

