package a01;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int numero = leerEntero();
        System.out.println("Número leído: " + numero);
    }

    public static int leerEntero() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int numero = sc.nextInt();
                return numero;
            } catch (Exception e) {
                System.out.println("Error: No has escrito un número.");
                sc.nextLine(); // 🔥 limpiar entrada incorrecta
            }
        }
    }
}