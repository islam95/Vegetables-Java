package myproject;


/**
 * Run.java Main class to run the project.
 *
 * @author Islam Dudaev
 * @version 1.2v, 12 November, 2014
 */
public class Run {

    public static void main(String[] args) {

        Land land = new Land();
        land.printLand();

        System.out.println("\nPlease plant one Turnip.");
        land.plantVegs("T", 4);
        
        for(int i = 1; i <= 2; i++){
            System.out.println("\nPlease plant Carrot " + i + ".");
            land.plantVegs("C", 3);
        }
        
        for(int i = 1; i <= 3; i++){
            System.out.println("\nPlease plant Potato " + i + ".");
            land.plantVegs("P", 2);
        }
        
        for(int i = 1; i <= 4; i++){
            System.out.println("\nPlease plant Radish " + i + ".");
            land.plantVegs("R", 1);
        }
        
    }

}
