public class KitchenBuilder {

    private int area;
    private boolean hasIsland;

    public KitchenBuilder setArea(int area) {
        this.area = area;
        return this;
    }

    public KitchenBuilder setIsland(boolean hasIsland) {
        this.hasIsland = hasIsland;
        return this;
    }

    public Kitchen build() {
        return new Kitchen(area, hasIsland);
    }
}
