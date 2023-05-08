package Tourist;
import Location.*;



public class Ralph implements Tourist {

    static int budget = 1000;

    public void visit( ) {
        System.out.print("Enjoy your trip!");
    }

    @Override
    public void visit(Batanes batanes) {
        System.out.println("my budget is" + getBudget());

        if ( budget > batanes.airFare  ){
            System.out.println("Enjoying my vacation in Batanes!" );
            budget -= batanes.airFare;

        }else{
            System.out.println("kaso wala nako pera");
        }

      checkBudget();

    }

    @Override
    public void visit(Boracay boracay) {
        System.out.println("my budget is" + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("For clout chase in Boracay!" );
            budget -= boracay.airFare;

        }else{
            System.out.println("kaso wala nako pera");
        }

      checkBudget();

    }

    @Override
    public void visit(Palawan palawan) {
        System.out.println("my budget is" + getBudget());

        if ( budget > palawan.airFare  ){
            System.out.println("Enjoying my vacation in Palawan!" );
            budget -= palawan.airFare;

        }else{
            System.out.println("Kaso I have no money na!");
        }

      checkBudget();

    }

    @Override
    public void visit(LaUnion laUnion) {
        System.out.println("my budget is" + getBudget());

        if ( budget > laUnion.airFare  ){
            System.out.println("Enjoying my vacation in Batanes!" );
            budget -= laUnion.airFare;

        }else{
            System.out.println("kaso wala nako pera");
        }

      checkBudget();

    }

    @Override
    public void visit(Marinduque marinduque){
        System.out.println("my budget is" + getBudget());

        if ( budget > marinduque.airFare  ){
            System.out.println("I like to go somewhere in torrijos!" );
            budget -= marinduque.airFare;

        }else{
            System.out.println("No excuses");
        }

      checkBudget();

    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }
}