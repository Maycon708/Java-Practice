import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class URI1005 {
     
    public static void main(String[] args) throws IOException {
         
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
         
        double A, B, X;
         
        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
         
        X = A * 3.5 + B * 7.5;
         
        System.out.printf("MEDIA = %.5f\n", X/11);
         
    }
     
}