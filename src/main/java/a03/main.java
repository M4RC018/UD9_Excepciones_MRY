package a03;

import java.io.*;

public class main {

    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\marco\\Documents\\NetBeansProjects\\UD9_Excepciones\\src\\main\\java\\a01\\main.java"));
            String linea;
            while ((linea = in.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar: " + e.getMessage());
                }
            }
        }

    }
}
