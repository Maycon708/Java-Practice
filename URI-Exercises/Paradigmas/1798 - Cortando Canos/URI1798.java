import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1798 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] toParse;
		int [] v = new int[1010], c = new int[1010], dp = new int[2010];
		int n, cap;
		
		toParse = in.readLine().split("\\s");
		n = Integer.parseInt(toParse[0]);
		cap = Integer.parseInt(toParse[1]);
		
		for(int i = 0; i < n; i++){
			toParse = in.readLine().split("\\s");
			c[i] = Integer.parseInt(toParse[0]);
			v[i] = Integer.parseInt(toParse[1]);
		}
		
		for(int j = 0; j <= cap; j++){
			dp[j] = 0;
			for(int i = n-1; i >= 0; i--){
				if(j >= c[i]){
					dp[j] = max(dp[j], dp[j-c[i]]+v[i]);
				}
			}
		}
		System.out.println(dp[cap]);
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
