package Tourist;

import Location.Batanes;
import Location.Boracay;
import Location.Locations;
import Location.LaUnion;
import Location.Marinduque;
import Location.Palawan;

public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Batanes batanes);
    void visit(LaUnion laUnion);
    void visit(Palawan palawan);
    void visit(Marinduque marinduque);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}