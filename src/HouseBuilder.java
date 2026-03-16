import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {

    private List<Object> rooms = new ArrayList<>();
    private int stories;

    public HouseBuilder addRoom(Object room) {
        rooms.add(room);
        return this;
    }

    public HouseBuilder setStories(int stories) {
        this.stories = stories;
        return this;
    }

    public House build() {
        return new House(rooms, stories);
    }
}
