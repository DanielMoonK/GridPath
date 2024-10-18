public class GridPath
{
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;

    public GridPath(int[][] values){
        grid = values;
    }

    public String toString(){
        String s = "";
        for (int row=0; row < grid.length; row++){
            for (int col=0; col < grid.length; col++){
                s += grid[row][col] + " ";
            }
            s += "\n";
        }
        return s;
    }

    /**
    * Returns the Location representing a neighbor of the grid element at row and col,
    * as described in part (a)
    * Preconditions: row is a valid row index and col is a valid column index in grid.
    * row and col do not specify the element in the last row and last column of grid.
    */
    public Location getNextLoc(int row, int col)
    {
        Location nextLoc = new Location(0 ,0);
        if (row == 4 && col != 4){
            nextLoc.newLoc(4, col + 1);
            return nextLoc;
        }
    }

    /**
    * Computes and returns the sum of all values on a path through grid, as described in
    * part (b)
    * Preconditions: row is a valid row index and col is a valid column index in grid.
    * row and col do not specify the element in the last row and last column of grid.
    */
    // public int sumPath(int row, int col)
    // {

    // }
}