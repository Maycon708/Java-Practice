import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI2026 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] toParse;
		int [] v = new int[110], c = new int[110];
		int [][] dp = new int[110][1010];
		int n, cap, t;
		
		t = Integer.parseInt(in.readLine());
		
		for(int test = 1; test <= t; test++){
			
			n = Integer.parseInt(in.readLine());
			cap = Integer.parseInt(in.readLine());
			
			for(int i = 0; i < n; i++){
				toParse = in.readLine().split("\\s");
				v[i] = Integer.parseInt(toParse[0]);
				c[i] = Integer.parseInt(toParse[1]);
			}
			
				
			for(int j = 0; j <= cap; j++){
				dp[n][j] = 0;
				for(int i = n-1; i >= 0; i--){
					dp[i][j] = dp[i+1][j];
					if(j >= c[i]){
						dp[i][j] = max(dp[i][j], dp[i+1][j-c[i]]+v[i]);
					}
				}
			}
			System.out.println("Galho " + test + ":");
			System.out.println("Numero total de enfeites: " + dp[0][cap] + "\n");
		}
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
