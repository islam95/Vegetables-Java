package myproject;

import java.util.*;
/**
 * Land.java
 * Class to create a land with vegetables.
 * 
 * @author Islam Dudaev
 * @version v1.2, 12 November, 2014
 */
public class Land {
    
    private final int SIZE = 8; 
    private final String[][] land; // allotment
    private final ArrayList<Vegetable> vegs; //list of vegetables
    
    // for later
    //public String[] plants = {"T", "C", "P", "R", "empty"};
    
    public Land(){
        land = new String[SIZE][SIZE]; // creating a land of 64 cells
        vegs = new ArrayList<Vegetable>(); // array list of all vegs
        clearCells(); // cleaning the land (default)
    }
    
    /**
     * Method to clear a land for new game. Finished.
     */
    private void clearCells(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                land[i][j] = "0";
            }
        }
    }
    
    /**
     * Printing out the land. Finished.
     */
    public void printLand(){
        int row, col;
        System.out.print("  ");
       for(col = 1; col <= SIZE; col++){
           System.out.print(col + " ");
       }
       
       for(row = 1; row <= SIZE; row++){
           System.out.print("\n" + row + " ");
            for(col = 1; col <= SIZE; col++){
                System.out.print(land[row-1][col-1] + " ");
            }
        }
    }
    
    /**
     * Method to plant vegetables.
     * 
     * @param symbol The plant first letter.
     * @param numCells the number of cells in vegetable.
     */
    public void plantVegs(String symbol, int numCells){
        
        Scanner scan = new Scanner(System.in);
        int row, col;
        
        switch (symbol){
        
            case "T":
                
                System.out.println("\nTurnip has " + numCells + " cells.");
                for(int count = 0; count < numCells;){
        
                    System.out.println("\n" + (numCells - count) + " cells to go.");
                    System.out.print("Enter its row: ");
                    row = scan.nextInt();
                    System.out.print("Enter its column: ");
                    col = scan.nextInt();
                    System.out.println();
            
                    count = createPlant(symbol, row, col, numCells, count);
                }
                break;
            
            case "C":
                
                System.out.println("\nCarrot has " + numCells + " cells.");
                for(int count = 0; count < numCells;){
        
                    System.out.println("\n" + (numCells - count) + " cells to go.");
                    System.out.print("Enter its row: ");
                    row = scan.nextInt();
                    System.out.print("Enter its column: ");
                    col = scan.nextInt();
                    System.out.println();
            
                    count = createPlant(symbol, row, col, numCells, count);
                }
                break;
            
            case "P":
                
                System.out.println("\nPotato has " + numCells + " cells.");
                for(int count = 0; count < numCells;){
        
                    System.out.println("\n" + (numCells - count) + " cells to go.");
                    System.out.print("Enter its row: ");
                    row = scan.nextInt();
                    System.out.print("Enter its column: ");
                    col = scan.nextInt();
                    System.out.println();
            
                    count = createPlant(symbol, row, col, numCells, count);
                }
                break;
                
            case "R":
                
                System.out.println("\nRadish has " + numCells + " cells.");
                for(int count = 0; count < numCells;){
        
                    System.out.println("\n" + (numCells - count) + " cells to go.");
                    System.out.print("Enter its row: ");
                    row = scan.nextInt();
                    System.out.print("Enter its column: ");
                    col = scan.nextInt();
                    System.out.println();
            
                    count = createPlant(symbol, row, col, numCells, count);
                }
                break;
                
            default: 
                
                System.out.println("Not a valid vegetable.");
                break;
        } 
    }
    
    /**
     * Method to create a plant.
     * 
     * @param symbol a plant name
     * @param row row number
     * @param col column number
     * @param numCells number of cells in a plant
     * @param count to count vegetables 
     * @return count 
     */
   private int createPlant(String symbol, int row, int col, int numCells, int count){
   
       Vegetable veg = new Vegetable(row, col, symbol, numCells);
       vegs.add(veg);
       
       land[row-1][col-1] = symbol;
       printLand();
       
       count++;
       return count;
   }
  
   
//   // for later.
//   public void allVegs(){
//        for (Vegetable v : vegs) {
//            System.out.println(v);
//        }
//   }
   
    
}
