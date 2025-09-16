import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      // Juego de adivinar el número
            System.out.println("\n--- Juego de adivinar el número ---");
            int numeroAleatorio = (int)(Math.random() * 100) + 1;
            int intentos = 10;
            boolean acertado = false;
            for (int i = 1; i <= intentos; i++) {
               System.out.print("Intento " + i + " de " + intentos + ". Ingresa un número entre 1 y 100: ");
               int intentoUsuario = sc.nextInt();
               if (intentoUsuario == numeroAleatorio) {
                  System.out.println("¡Felicidades! Has acertado el número en " + i + " intentos.");
                  acertado = true;
                  break;
               } else if (intentoUsuario < numeroAleatorio) {
                  System.out.println("El número a adivinar es mayor.");
               } else {
                  System.out.println("El número a adivinar es menor.");
               }
               System.out.println("Te quedan " + (intentos - i) + " intentos.");
            }
            if (!acertado) {
               System.out.println("¡Has agotado los intentos! El número era: " + numeroAleatorio);
            }
        
   }
}

