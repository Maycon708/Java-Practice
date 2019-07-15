import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class URI1013 {
     
    public static void main(String[] args) throws IOException {
         
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        String[] toParse = in.readLine().split("\\s");
        int A = Integer.parseInt(toParse[0]);
        int B = Integer.parseInt(toParse[1]);
        int C = Integer.parseInt(toParse[2]);
        
        int maiorAB = (A+B+Math.abs(A-B))/2;
        int maiorABC = (maiorAB+C+Math.abs(maiorAB-C))/2;
        
        System.out.printf("%d eh o maior\n", maiorABC);
    }
     
}