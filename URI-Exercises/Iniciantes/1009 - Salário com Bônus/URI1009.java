import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class URI1009 {
     
    public static void main(String[] args) throws IOException {
         
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        double salary, sells, total;

        in.readLine();
        salary = Double.parseDouble(in.readLine());
        sells = Double.parseDouble(in.readLine());
        total = salary + sells * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", total);
         
    }
     
}