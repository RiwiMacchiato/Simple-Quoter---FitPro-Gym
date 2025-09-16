
import java.util.*;

public class bucles {
   public static void main(String[] args) {
      // Arrays
      int[] numeros = {1, 2, 3, 4, 5};
      System.out.println("Array multiplicado por 2:");
      for (int i = 0; i < numeros.length; i++) {
         System.out.println(numeros[i] * 2);
      }

      Scanner sc = new Scanner(System.in);
      int[] numerosUsuario = new int[6];
      System.out.println("Ingresa 6 números:");
      for (int i = 0; i < numerosUsuario.length; i++) {
         System.out.print("Número " + (i+1) + ": ");
         numerosUsuario[i] = sc.nextInt();
      }
      System.out.println("Números ingresados:");
      for (int num : numerosUsuario) {
         System.out.println(num);
      }

      // ArrayList
      ArrayList<String> compañeros = new ArrayList<>();
      compañeros.add("Ana");
      compañeros.add("Luis");
      compañeros.add("Maria");
      compañeros.add("Juan");
      System.out.println("Compañeros:");
      System.out.println(compañeros);
      for (String nombre : compañeros) {
         System.out.println("Hola, " + nombre);
      }

      // HashMap
      HashMap<Integer, String> documentos = new HashMap<>();
      documentos.put(123456, "Ana");
      documentos.put(234567, "Luis");
      documentos.put(345678, "Maria");
      documentos.put(456789, "Juan");
      System.out.println("Documentos:");
      for (Map.Entry<Integer, String> entry : documentos.entrySet()) {
         System.out.println("Documento: " + entry.getKey() + " → Nombre: " + entry.getValue());
      }

    
    }
    
}
  

 