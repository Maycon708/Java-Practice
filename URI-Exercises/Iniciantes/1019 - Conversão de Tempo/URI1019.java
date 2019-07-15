import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1019 {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(in.readLine());
		int hours = total/3600;
		int min = (total%3600)/60;
		int sec = total%60;
		
		System.out.printf("%d:%d:%d\n", hours, min, sec);
		
	}
}
