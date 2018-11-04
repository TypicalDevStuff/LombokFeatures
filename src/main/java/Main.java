import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        final Wheel smallWheel = new Wheel();
        smallWheel.setSize(22);
        smallWheel.setType("aluminium");

        final Wheel bigWheel = new Wheel();
        bigWheel.setSize(24);
        bigWheel.setType("carbon");

        final Bicycle bicycle = new Bicycle("Bianchi", new BigDecimal("10000.0"), smallWheel);

        final Rider rider = Rider.builder()
                .firstName("Alejandro")
                .secondName("Valverde")
                .ownedBicycle(bicycle)
                .build();

        rider.changeWheel(bigWheel);
    }
}
