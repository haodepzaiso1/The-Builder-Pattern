public class Architect {
    public static void main(String[] args) {

        Bedroom bedroom = new BedroomBuilder()
                .setBedType("King")
                .setNumberOfBeds(1)
                .setBathroom(true)
                .setArea(30)
                .build();

        Kitchen kitchen = new KitchenBuilder()
                .setArea(20)
                .setIsland(true)
                .build();

        House house = new HouseBuilder()
                .addRoom(bedroom)
                .addRoom(kitchen)
                .setStories(2)
                .build();

        System.out.println(house);
    }
}
