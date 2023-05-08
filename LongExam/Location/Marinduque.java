package Location;
import Tourist.Tourist;

public class Marinduque implements Locations {

    public int airFare = 200;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}