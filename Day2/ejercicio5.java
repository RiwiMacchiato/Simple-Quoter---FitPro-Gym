import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("Introduce caracteres (espacio para terminar):");
        do {
            String input = sc.nextLine();
            if (input.length() == 0) continue;
            c = input.charAt(0);
            if (c == ' ') break;
            if ("aeiouAEIOU".indexOf(c) != -1) {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        } while (true);
        sc.close();
    }
}
