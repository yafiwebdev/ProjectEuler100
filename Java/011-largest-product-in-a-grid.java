
import java.util.Random;

//Solution to Project Euler Problem 11
public class Solution{
	static int gridSize = 20;
	static int maxInt = 98;
	static int[][] grid = new int[gridSize][gridSize];
	static int maxSum = 0;
	static int resultArray[][] = new int[4][2];
	
	public static void main(String[] args) 
    { 
		//fill grid with random numbers
        fillGrid();
		//calculate maximum number
		calculateMaxSumOfFourInARow();
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
	
	private static void calculateMaxSumOfFourInARow(){
		//iterate over grid from tol left to bottom right
		for( int i = 0; i < gridSize; i++){
			for( int j = 0; j < gridSize; j++){
				calculateSumForNeighbor(i,j);
			}
		}
		System.out.println("Max sum: " + maxSum);
		System.out.print("Position: ");
		for(int i = 0; i<4; i++){
			System.out.print(resultArray[i][1] + "," + resultArray[i][0] + " ");
		}
	}
	
	private static void calculateSumForNeighbor(int row, int col){
		//calculate horizontal if there are enough cells in row
		if(row + 4 <= gridSize){
			int sumv = 0;
			int[][] array = new int[4][2];
			for(int i = 0; i<4; i++){
				array[i][0] = row+i+1;
				array[i][1] = col+1;
				sumv += grid[row+i][col];
			}
			if(sumv > maxSum){
				resultArray = array;
				maxSum = sumv;
			}
		}
		
		//calculate vertical if there are enough cells in column
		if(col + 4 <= gridSize){
			int sumh = 0;
			int[][] array = new int[4][2];
			for(int i = 0; i<4; i++){
				array[i][0] = row+1;
				array[i][1] = col+i+1;
				sumh += grid[row][col+i];
			}
			if(sumh > maxSum){
				resultArray = array;
				maxSum = sumh;
			}
		}
		
		//caluclate vertical if there are enough cells in diagnonal
		if(row + 4 <= gridSize && col + 4 <= gridSize){
			int sumd = 0;
			int[][] array = new int[4][2];
			for(int i = 0; i<4; i++){
				array[i][0] = row+i+1;
				array[i][1] = col+i+1;
				sumd += grid[row+i][col+i];
			}
			if(sumd > maxSum){
				resultArray = array;
				maxSum = sumd;
			}
		}
		
	}
}