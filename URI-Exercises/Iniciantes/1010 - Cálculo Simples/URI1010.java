import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class URI1010 {
     
    public static void main(String[] args) throws IOException {
         
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int qtd_1, qtd_2;
        double val_1, val_2, total;
        String []toParse;

        toParse = in.readLine().split("\\s");
        qtd_1 = Integer.parseInt(toParse[1]);
        val_1 = Double.parseDouble(toParse[2]);
        
        toParse = in.readLine().split("\\s");
        qtd_2 = Integer.parseInt(toParse[1]);
        val_2 = Double.parseDouble(toParse[2]);
         
        total = qtd_1 * val_1 + qtd_2 * val_2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
     
}