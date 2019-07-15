import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class URI1014 {
     
    public static void main(String[] args) throws IOException {
         
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int distance = Integer.parseInt(in.readLine());
        double fuel = Double.parseDouble(in.readLine());
        double consumption = distance/fuel;
        
        System.out.printf("%.3f km/l\n", consumption);
    }
     
}