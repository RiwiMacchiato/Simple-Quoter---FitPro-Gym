import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int num;
        System.out.println("Introduce números (0 para terminar):");
        do {
            num = sc.nextInt();
            if (num != 0) {
                suma += num;
                contador++;
            }
        } while (num != 0);
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("Suma total: " + suma);
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se introdujeron números.");
        }
        sc.close();
    }
}
