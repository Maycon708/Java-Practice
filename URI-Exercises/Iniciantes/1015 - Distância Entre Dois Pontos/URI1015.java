import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class URI1015 {
     
    public static void main(String[] args) throws IOException {
         
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        double x1, y1, x2, y2, distance;
        String[] toParse = in.readLine().split("\\s");
        x1 = Double.parseDouble(toParse[0]);
        y1 = Double.parseDouble(toParse[1]);
        
        toParse = in.readLine().split("\\s");
        x2 = Double.parseDouble(toParse[0]);
        y2 = Double.parseDouble(toParse[1]);
        
        distance = Math.hypot(x1-x2, y1-y2);
        
        System.out.printf("%.4f\n", distance);
    }
     
}