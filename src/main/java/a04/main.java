
package a04;

import java.io.*;
public class main {
    public static void main(String[] args) {
        String ficheroNumeros = "NumerosReales.txt";
        double suma = 0.0;
        int cantidad = 0;
        try{
           BufferedReader in = new BufferedReader (new FileReader("\"C:\\Users\\marco\\OneDrive\\Escritorio\\NumerosReales.txt\""));
           String linea;
           while((linea = in.readLine()) != null){
               if(!linea.isEmpty()){
                   String[] partes = linea.split(" ");
                   
                   for (String parte : partes) {
                        parte = parte.trim();
                        if (!parte.isEmpty()) {
                            double numero = Double.parseDouble(parte);
                            suma += numero;
                            cantidad++;
                        }
                    }
               }
           }
           
           in.close();
           
           if(cantidad > 0){
               double media = suma / cantidad;
               System.out.println("Número Leídos: " + String.valueOf(cantidad));
               System.out.println("Suma Total: " + String.valueOf(suma));
               System.out.println("Media Aritmética: " + String.valueOf(media));
           }else{
               System.out.println("El fichero no contiene números.");
           }
        } catch(IOException e){
            System.out.println("Error al leer el fichero: " + e.getMessage());
        } catch(NumberFormatException e){
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
