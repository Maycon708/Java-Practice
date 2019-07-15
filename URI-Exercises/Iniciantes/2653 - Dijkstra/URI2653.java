import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class URI2653 {

	public static void main(String[] args) throws IOException {
		Set<String> st = new HashSet<>() ;
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String aux;
	    
	    while( (aux = in.readLine()) != null ){
	    	st.add(aux);
	    }
	    System.out.println(st.size());
	}

}
