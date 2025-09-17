import java.util.Scanner;

public class WordFrequency {
    public void run() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=== FRECUENCIA DE PALABRAS ===");
        System.out.println("Ingrese palabras (escriba '0' para terminar):");
        
        String input = "";
        String word;
        
        do {
            System.out.print("Palabra: ");
            word = sc.nextLine();
            if (!word.equals("0")) {
                input += word + " ";
            }
        } while (!word.equals("0"));
        
        String[] words = input.toLowerCase().trim().split(" ");
        
        System.out.println("\nFrecuencia de palabras:");
        
        for (String currentWord : words) {
            if (!currentWord.isEmpty()) {
                boolean alreadyShown = false;
                
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals(currentWord)) {
                        if (words[i] != currentWord) {
                            alreadyShown = true;
                            break;
                        } else {
                            break;
                        }
                    }
                }
                
                if (!alreadyShown) {
                    int count = 0;
                    for (String w : words) {
                        if (w.equals(currentWord)) {
                            count++;
                        }
                    }
                    System.out.println(currentWord + " = " + count);
                }
            }
        }
        
        System.out.println("\nPresione 'Enter' para continuar");
        sc.nextLine();
    }
}