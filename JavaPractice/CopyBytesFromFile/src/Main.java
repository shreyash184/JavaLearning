import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{

            int c;

            while((c = in.read()) != -1){
                out.write(c);
            }
        } finally {
            if(in != null)
        }
    }
}