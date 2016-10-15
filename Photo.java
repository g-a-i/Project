package OOP.project.project_v2;

/**
 * Created by Sergey Lang on 15.10.2016.
 */
public class Photo {
    private String name;
    private long id;
    private int price;
    private enum topic {Architecture, Portrait, Nature, Travelling, Reportage, Wedding, Sport, Techno, Models, Humor}
    private enum quality {low, medium, high}

    public Photo(String name, long id, int price, topic topic, quality quality) {
        this.name = name;
        this.id = id;
        this.price = price;
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

    @Override
    public String toString() {
        return "Photo{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
