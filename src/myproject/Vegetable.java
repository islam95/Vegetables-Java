package myproject;

/**
 * Vegetable.java
 * Class to represent a vegetable.
 * 
 * @author Islam Dudaev
 * @version v1, 6 November, 2014
 */
public class Vegetable {
    
    private int row, col, numCells;
    private String plant;
    
    /**
     * Default constructor.
     * 
     * @param plant Plant name
     * @param numCells The number of cells for the plant
     */
    public Vegetable(String plant, int numCells){
        this.row = 0;
        this.col = 0;
        this.plant = plant;
        this.numCells = numCells;
        
    }
    
    /**
     * A Constructor with the position of vegetables in a land.
     * 
     * @param row The row number
     * @param col The column  number
     * @param plant Plant name
     * @param numCells The number of cells for the plant
     */
    public Vegetable(int row, int col, String plant, int numCells){
        this.row = row;
        this.col = col;
        this.plant = plant;
        this.numCells = numCells;
        
    }
    
    public int getNumCells(){
        return numCells;
    }
    
    public String getPlant(){
        return plant;
    }
    
}
