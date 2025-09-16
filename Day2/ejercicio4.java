import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas introducir?: ");
        int cantidad = sc.nextInt();
        int mayores = 0, menores = 0, iguales = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int num = sc.nextInt();
            if (num > 0) {
                mayores++;
            } else if (num < 0) {
                menores++;
            } else {
                iguales++;
            }
        }
        System.out.println("Mayores que 0: " + mayores);
        System.out.println("Menores que 0: " + menores);
        System.out.println("Iguales a 0: " + iguales);
        sc.close();
    }

}
