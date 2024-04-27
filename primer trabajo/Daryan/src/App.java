import java.util.Scanner;
//Daryan José Espinoza Pastrán, carnet 2024-1370U.
//Un sistema que lancé 3# diferentes, sumen los # menores y que resten los mayores, y cual es el # mayor.

public class App {

    public static int num1;
    public static int num2;
    public static int num3;

    public static void main(String[] args) throws Exception {

        //Primero que den los 3 # diferentes entre ellos mismo.

        Scanner leer = new Scanner(System.in);

        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }

        } while (num1 == num2 || num1 == num3 || num2 == num3);

        //Los # más pequeños.
        int peque = Math.min(num1, Math.min(num2, num3));
        int peque_2 = Math.max(Math.min(num1, num2), Math.min(num2, num3));

        // Los # más grandes
        int grande = Math.max(num1, Math.max(num2, num3));
        int grande_2 = Math.min(Math.max(num1, num2), Math.max(num2, grande));

        //La suma de los más pequeños.
        int sumpeque = peque + peque_2;
        
        //La resta de los más grandes.
        int restagrande = grande - grande_2;

        //Resultados
        System.out.println("La suma de los más pequeños es: " +sumpeque);
        System.out.println("La resta de los más grandes es: " +restagrande);

        //Cuál es el más grandes?
        int mostbig = Math.max(Math.max(num1, num2), num3);
        System.out.println("El # más grande es: " + mostbig);

    }
}
