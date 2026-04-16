
package a07;
import java.io.*;
public class main {
    public static void main(String[] args) {
        BufferedWriter out = null;
        BufferedReader in = null;
        try{
            out = new BufferedWriter(new FileWriter("Salida_Quijote.txt", true));
            in = new BufferedReader(new FileReader("C:\\Users\\marco\\Documents\\NetBeansProjects\\UD9_Excepciones\\src\\main\\java\\a07\\Quijote.txt"));
            
            String linea1 = in.readLine();
            String linea2 = in.readLine();
            
            for(int i = 0; i < linea1.length(); i++){
                out.write(linea1.charAt(i));
            }
            out.newLine();
            
            out.write(linea2);
            
            in.close();
            out.flush();
            out.close();
        } catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
}
