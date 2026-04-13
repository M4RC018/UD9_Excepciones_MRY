package a02;

import java.io.*;
public class main {
     public static void main(String[] args) {
         FileReader in = null;
         try{
             in = new FileReader("C:\\Users\\marco\\Documents\\NetBeansProjects\\UD9_Excepciones\\src\\main\\java\\a01\\main.java");
             int n;
             while ((n = in.read()) != -1) {
                 char c = (char) n;
                 System.out.print(c);
         }
         }catch(IOException e){
             System.out.print("Error: " + e.getMessage());
         }
         finally{
             if(in != null){
                 try{
                 in.close();
                 }catch(IOException e){
                     System.out.println("Error al cerrar: " + e.getMessage());
                 }
             }
         }
     }
}
