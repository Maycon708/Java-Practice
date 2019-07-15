import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class URI1012 {
     
    public static void main(String[] args) throws IOException {
         
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        String[] toParse = in.readLine().split("\\s");
        double A = Double.parseDouble(toParse[0]);
        double B = Double.parseDouble(toParse[1]);
        double C = Double.parseDouble(toParse[2]);
        final double PI = 3.14159;
        
        double triangle = A*C/2;
        double circle = C*C*PI;
        double trapezium = (A+B)*C/2;
        double square = B*B;
        double rectangle = A*B;

        System.out.printf("TRIANGULO: %.3f\n", 	triangle);
        System.out.printf("CIRCULO: %.3f\n", 	circle);
        System.out.printf("TRAPEZIO: %.3f\n", 	trapezium);
        System.out.printf("QUADRADO: %.3f\n", 	square);
        System.out.printf("RETANGULO: %.3f\n", 	rectangle);
        
    }
     
}