public class Kitchen {
    private int area;
    private boolean hasIsland;

    public Kitchen(int area, boolean hasIsland) {
        this.area = area;
        this.hasIsland = hasIsland;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "area=" + area +
                ", hasIsland=" + hasIsland +
                '}';
    }
}
