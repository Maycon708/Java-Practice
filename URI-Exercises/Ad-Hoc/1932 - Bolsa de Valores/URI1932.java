import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1932 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] toParse;
		int n, c;
		int[] v = new int[200100];
		int[][] dp = new int[200100][2];
		
		toParse = in.readLine().split("\\s");
		n = Integer.parseInt(toParse[0]);
		c = Integer.parseInt(toParse[1]);

		toParse = in.readLine().split("\\s");
		for(int i = 0; i < toParse.length; i++){
			v[i] = Integer.parseInt(toParse[i]);
		}
		dp[n][0] = 0;
		dp[n][1] = 0;
		
		for(int i = n-1; i >= 0; i--){
			dp[i][0] = max(dp[i+1][0], dp[i+1][1] - c - v[i]);
			dp[i][1] = max(dp[i+1][0] + v[i], dp[i+1][1]);
		}
		
		System.out.println(dp[0][0]);		
	}
	
	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
