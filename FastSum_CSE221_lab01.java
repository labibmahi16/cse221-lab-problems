import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

    public class fastsum{
        public static void main(String [] args) throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
            PrintWriter pw = new PrintWriter(System.out);

            String input = br.readLine();
            int T = Integer.parseInt(input);

            for(int t = 0 ; t<T; t++){

                input = br.readLine();

                int n = Integer.parseInt(input);

                long sum = (long) n * (n+1)/2 ; 

                pw.println(sum);

            }

            pw.flush();
            
        }
        
    }
