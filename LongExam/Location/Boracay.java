package Location;
import Tourist.Tourist;

public class Boracay implements Locations {

    public int airFare = 200;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}