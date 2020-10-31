class Solution
{
  public static long  latticePaths(int x,int y)
  {
      long[][] memo = new long[x+1][y+1];
      for (int i = 0; i <= x; i++) {
          memo[i][0] = 1;
          memo[0][i] = 1;
      }
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
