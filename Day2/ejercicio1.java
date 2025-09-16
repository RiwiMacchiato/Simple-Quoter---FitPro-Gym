import java.util.Scanner;

public class ejercicio1 {

     public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
          // Factorial exercise # 1
         System.out.print("\nIngrese un número para calcular su factorial: ");
         int n = sc.nextInt();
         long factorial = 1;
         for (int i = 1; i <= n; i++) {
            factorial *= i;
         }
         System.out.println(n + "! = " + factorial);

     }
}
