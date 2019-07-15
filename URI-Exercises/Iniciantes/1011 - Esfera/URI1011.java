import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class URI1011 {
     
    public static void main(String[] args) throws IOException {
         
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        double pi = 3.14159;
        double radius = Double.parseDouble(in.readLine());
        double volume = 4 * Math.pow(radius, 3) * pi/3;
        		
        System.out.printf("VOLUME = %.3f\n", volume);
    }
     
}