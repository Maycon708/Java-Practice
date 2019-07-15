import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1017 {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x, y;
	
		x = Integer.parseInt(in.readLine());
		y = Integer.parseInt(in.readLine());
		
		System.out.printf("%.3f\n", x/12.0*y);
	}

}
