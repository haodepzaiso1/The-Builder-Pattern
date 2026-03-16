public class Bedroom {
    private String bedType;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasBathroom;
    private int area;
    private String wallColor;
    private boolean hasDesk;
    private boolean hasWardrobe;

    public Bedroom(String bedType, int numberOfBeds, boolean hasBalcony,
                   boolean hasBathroom, int area, String wallColor,
                   boolean hasDesk, boolean hasWardrobe) {
        this.bedType = bedType;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasBathroom = hasBathroom;
        this.area = area;
        this.wallColor = wallColor;
        this.hasDesk = hasDesk;
        this.hasWardrobe = hasWardrobe;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "bedType='" + bedType + '\'' +
                ", numberOfBeds=" + numberOfBeds +
                ", hasBalcony=" + hasBalcony +
                ", hasBathroom=" + hasBathroom +
                ", area=" + area +
                ", wallColor='" + wallColor + '\'' +
                ", hasDesk=" + hasDesk +
                ", hasWardrobe=" + hasWardrobe +
                '}';
    }
}
