import Location.*;
import Tourist.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        Locations boracay = new Boracay();
        Locations batanes = new Batanes();
        Locations launion = new LaUnion();
        Locations palawan = new Palawan();
        Locations mduque = new Marinduque();

        Tourist person = new Ralph();

        boracay.accept(person);
        batanes.accept(person);
        launion.accept(person);
        palawan.accept(person);
        mduque.accept(person);
        



        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

    }
}