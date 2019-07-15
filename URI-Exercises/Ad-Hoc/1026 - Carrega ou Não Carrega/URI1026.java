import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1026 {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String aux;
		
		while( (aux = in.readLine()) != null ){
			String array[] = new String[2];
			array = aux.split("\\s");
			long a = Long.parseLong(array[0]);
			long b = Long.parseLong(array[1]);
		    System.out.println(a^b);
		}
	}
}
