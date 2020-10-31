// Function objective: Calculate the number of possible routes of an x,y grid from top left corner to bottom right corner
// parameters: x = number of rows, y = number of columns
class Solution
{
  public static long  latticePaths(int x,int y)
  {
      // Initializes a memo to store answers to sub-problems in a dynamic paradigm
      long[][] memo = new long[x+1][y+1];

      // Initializes base cases for memo
      for (int i = 0; i <= x; i++) {
          memo[i][0] = 1;
          memo[0][i] = 1;
      }
      // For all coordinates (x,y), there exists coordinates (x-1,y) and (x,y-1) where the number of routes
      // towards (x-1,y) and (x,y-1) is a sub-route of (x,y)
      // f(x,y) = f(x-1,y) + f(x,y-1)
      for (int i = 1; i <= x; i++){
          for (int j = 1; j <= y; j++){
              memo[i][j] = memo[i-1][j] + memo[i][j-1];
          }
      }
      return memo[x][y];

  }
	public static void main(String[] args) 
  {
      System.out.println(latticePaths(20,20));
  }
}
