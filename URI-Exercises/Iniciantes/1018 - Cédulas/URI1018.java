import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1018 {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int total;
		int[] value = {100, 50, 20, 10, 5, 2, 1};
		
		total = Integer.parseInt(in.readLine());
		
		
		System.out.println(total);
		for(int i = 0; i < 7; i++) {
			System.out.printf("%d nota(s) de R$ %d,00\n", total/value[i], value[i]);
			total %= value[i];
		}	
	}
}
