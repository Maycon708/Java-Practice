import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class URI1008 {
     
    public static void main(String[] args) throws IOException {
         
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
         
        int A, B;
        double C;

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        C = Double.parseDouble(in.readLine());

        System.out.printf("NUMBER = %d\n", A);
        System.out.printf("SALARY = U$ %.2f\n", B*C);
         
    }
     
}