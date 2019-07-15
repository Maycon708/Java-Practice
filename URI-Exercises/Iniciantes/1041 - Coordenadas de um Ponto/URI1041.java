import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URI1041 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] toParse;
		double x, y;
	
		toParse = in.readLine().split("\\s");
		x = Double.parseDouble(toParse[0]);
		y = Double.parseDouble(toParse[1]);
		
		if( x > 0 ){
		    if( y > 0 ){
		        System.out.println("Q1");
		    }
		    else if( y < 0 ){
		        System.out.println("Q4");
		    }
		    else{
		        System.out.println("Eixo X");
		    }
		}
		else if( x < 0 ){
		    if( y > 0 ){
		        System.out.println("Q2");
		    }
		    else if( y < 0 ){
		        System.out.println("Q3");
		    }
		    else{
		        System.out.println("Eixo X");
		    }
		}
		else{
		    if( y != 0 ){
		        System.out.println("Eixo Y");
		    }
		    else{
		        System.out.println("Origem");
		    }
		}
	}

}
