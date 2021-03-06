package OOP.project.project_v2;

import java.util.List;

/**
 * Created by Sergey Lang on 15.10.2016.
 */
public class Photo {
    private String name;
    private long id;
    private int price;
    private Topic topic;
    private Quality quality;
    private User user;

    enum Topic {Architecture, Portrait, Nature, Travelling, Reportage, Wedding, Sport, Techno, Models, Humor}

    enum Quality {low, medium, high}

    public Photo(String name, long id, int price, Topic topic, Quality quality) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.topic = topic;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public User getUser() {
        return user;
    }

    protected void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", topic=" + topic +
                ", quality=" + quality +
                '}';
    }
}
