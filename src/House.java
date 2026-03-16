import java.util.List;

public class House {

    private List<Object> rooms;
    private int stories;

    public House(List<Object> rooms, int stories) {
        this.rooms = rooms;
        this.stories = stories;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", stories=" + stories +
                '}';
    }
}
