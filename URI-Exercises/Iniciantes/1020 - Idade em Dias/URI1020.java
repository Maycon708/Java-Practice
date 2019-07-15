import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1020 {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(in.readLine());
		int years = total/365;
		int months = (total%365)/30;
		int days = (total%365)%30;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);
		
	}
}
