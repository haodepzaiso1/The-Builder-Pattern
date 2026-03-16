public class BedroomBuilder {

    private String bedType;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasBathroom;
    private int area;
    private String wallColor;
    private boolean hasDesk;
    private boolean hasWardrobe;

    public BedroomBuilder setBedType(String bedType) {
        this.bedType = bedType;
        return this;
    }

    public BedroomBuilder setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        return this;
    }

    public BedroomBuilder setBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
        return this;
    }

    public BedroomBuilder setBathroom(boolean hasBathroom) {
        this.hasBathroom = hasBathroom;
        return this;
    }

    public BedroomBuilder setArea(int area) {
        this.area = area;
        return this;
    }

    public BedroomBuilder setWallColor(String wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public BedroomBuilder setDesk(boolean hasDesk) {
        this.hasDesk = hasDesk;
        return this;
    }

    public BedroomBuilder setWardrobe(boolean hasWardrobe) {
        this.hasWardrobe = hasWardrobe;
        return this;
    }

    public Bedroom build() {
        return new Bedroom(bedType, numberOfBeds, hasBalcony,
                hasBathroom, area, wallColor, hasDesk, hasWardrobe);
    }
}
