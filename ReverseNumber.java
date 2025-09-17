import java.util.Scanner;

public class ReverseNumber {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Ingrese un numero entero: ");
        while (!sc.hasNextInt()) {
            System.out.print("Valor invalido. Ingrese un numero entero: ");
            sc.next();
        }
        number = sc.nextInt();
        sc.nextLine();
        int originalNumber = Math.abs(number);
        int reversedNumber = 0;
        int temp = originalNumber;

        while (temp > 0) {
            reversedNumber = reversedNumber * 10 + temp % 10;
            temp = temp / 10;
        }

        System.out.println("Numero original: " + originalNumber);
        System.out.println("Numero invertido: " + reversedNumber);

        if (originalNumber == reversedNumber) {
            System.out.println("El numero ES capicua.");
        } else {
            System.out.println("El numero NO es capicua.");
        }

        System.out.println("Oprima 'Enter' para continuar");
        sc.nextLine();
    }
}
