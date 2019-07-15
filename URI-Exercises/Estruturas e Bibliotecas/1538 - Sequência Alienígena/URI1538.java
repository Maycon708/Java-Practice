import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1538 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] aux = { "A", "B", "C", "D" };
		StringBuilder answer;
		
		while(true){
			answer = new StringBuilder();
			long n = Long.parseLong(in.readLine());
			if(n == 0) break;
			n *= n;
			while(n != 0){
				answer.append(aux[(int) (n%4)]);
				n /= 4;
			}
			System.out.println(answer.reverse());
		}
	}
}
