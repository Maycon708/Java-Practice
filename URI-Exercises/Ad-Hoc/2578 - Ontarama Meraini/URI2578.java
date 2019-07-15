import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI2578 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String m, t;
		m = in.readLine();
		t = in.readLine();

		int[] cnt1 = new int[26];
		int[] cnt2 = new int[26];
		long total = 0, ans = 0, last = 0;
		int first = 0;
		
		for(int i = 0; i < 26; i++){
			cnt1[i] = cnt2[i] = 0;
		}
		
		for(int i = 0; i < t.length(); i++){
			int x = t.charAt(i)-'a';
			cnt2[x]++;
		}
		
		for(int i = 0; i < m.length(); i++){
			int x = m.charAt(i)-'a';
			if( cnt2[x] == 0 ){
				for(int j = 0; j < 26; j++) cnt1[j] = 0;
				total = 0;
				first = i+1;
				continue;
			}
			while( cnt1[x]+1 > cnt2[x] ){
				int y = m.charAt(first)-'a';
				cnt1[y]--;
				first++;
				total--;
			}
			cnt1[x]++;
			total++;
			if( total == t.length() ){
				ans+= (first-last+1)*(m.length()-i);
				last = first+1;
			}
		}
		
		System.out.println(ans);
		
	}
}
