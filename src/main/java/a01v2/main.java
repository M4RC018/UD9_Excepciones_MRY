package a01v2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        try {
            int numero = leerEntero();
            System.out.println("Número final: " + numero);
        } catch (Exception e) {
            System.out.println("Error al leer el número.");
        }
    }

    public static Integer leerEntero() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero por pantalla: ");
        return sc.nextInt();
    }
}
