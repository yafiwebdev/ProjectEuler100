
import java.util.Random;

//Solution to Project Euler Problem 11
public class Solution{
	static int gridSize = 20;
	static int maxInt = 98;
	static int[][] grid = new int[gridSize][gridSize];
	static int maxProduct = 0;
	static int resultArray[][] = new int[4][2];
	
	public static void main(String[] args) 
    { 
		//fill grid with random numbers
        fillGrid();
		//calculate maximum number
		calculateMaxProductOfFourInARow();
    }
	

	
	private static void calculateMaxProductOfFourInARow(){
		//iterate over grid from tol left to bottom right
		for( int i = 0; i < gridSize; i++){
			for( int j = 0; j < gridSize; j++){
				calculateProductForNeighbor(i,j);
			}
		}
		System.out.println("Max product: " + maxProduct);
		System.out.print("Position: ");
		for(int i = 0; i<4; i++){
			System.out.print(resultArray[i][1] + "," + resultArray[i][0] + " ");
		}
	}
	
	private static void calculateProductForNeighbor(int row, int col){
		//calculate horizontal if there are enough cells in row
		if(row + 4 <= gridSize){
			int productv = 1;
			int[][] array = new int[4][2];
			for(int i = 0; i<4; i++){
				array[i][0] = row+i+1;
				array[i][1] = col+1;
				productv *= grid[row+i][col];
			}
			if(productv > maxProduct){
				resultArray = array;
				maxProduct = productv;
			}
		}
		
		//calculate vertical if there are enough cells in column
		if(col + 4 <= gridSize){
			int producth = 1;
			int[][] array = new int[4][2];
			for(int i = 0; i<4; i++){
				array[i][0] = row+1;
				array[i][1] = col+i+1;
				producth *= grid[row][col+i];
			}
			if(producth > maxProduct){
				resultArray = array;
				maxProduct = producth;
			}
		}
		
		//caluclate vertical if there are enough cells in diagnonal
		if(row + 4 <= gridSize && col + 4 <= gridSize){
			int productd = 1;
			int[][] array = new int[4][2];
			for(int i = 0; i<4; i++){
				array[i][0] = row+i+1;
				array[i][1] = col+i+1;
				productd *= grid[row+i][col+i];
			}
			if(productd > maxProduct){
				resultArray = array;
				maxProduct = productd;
			}
		}
	}
		
	private static void fillGrid(){
		Random rand = new Random();
		//print column numbers
		for( int i = 0; i < gridSize+1; i++){
			if(i <10)
					System.out.print((i) + " |");
				else
					System.out.print((i) + "|");
		}
		System.out.println();
		//print rows and columns
		for( int i = 0; i < gridSize; i++){
			//print row numbers wiht additional space if # < 10
			if(i < 9)
					System.out.print((i+1) + " |");
				else
					System.out.print((i+1) + "|"); 
			for( int j = 0; j < gridSize; j++){
				//calculate random number, fill to grid position and print
				int n = 1 + rand.nextInt(maxInt);
				grid[j][i] = n;
				if(n <10)
					System.out.print(grid[j][i] + " |");
				else
					System.out.print(grid[j][i] + "|");
			}
			System.out.println();
		}
	}
}