import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1021 {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] value = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1 };
		
		String[] toParse = in.readLine().split("\\."); 

		int real = Integer.parseInt(toParse[0]);
		int cents = Integer.parseInt(toParse[1]);
		int	total = real*100+cents;
		
		System.out.println("NOTAS:");
		for(int i = 0; i < 6; i++) {
			System.out.printf("%d nota(s) de R$ %.2f\n", total/value[i], value[i]/100.0);
			total %= value[i];
		}	

		System.out.println("MOEDAS:");
		for(int i = 6; i < 12; i++) {
			System.out.printf("%d moeda(s) de R$ %.2f\n", total/value[i], value[i]/100.0);
			total %= value[i];
		}	
	}
}
