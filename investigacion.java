import java.util.ArrayList;
import java.util.HashMap;

public class investigacion {
    public static void main(String[] args) {
        // 1. Array

        int[] numeros = { 1, 2, 3, 4, 5 }; 

        System.out.println("Array:");
        System.out.println("Primer numero: " + numeros[0]);
        System.out.println("Ultimo numero: " + numeros[numeros.length - 1]);

        numeros[2] = 10;
        System.out.println("Nuevo valor en la posicion 2: " + numeros[2]);
        System.out.println("----------------------------------------------------");

        // 2 ArrayList
        ArrayList<String> mochila = new ArrayList<>();

        mochila.add("Espada");
        mochila.add("Mapa");
        mochila.add("Pocion");

        System.out.println("ArrayList:");
        System.out.println("segundo objeto en la mochila: " + mochila.get(1));

        mochila.remove("Mapa");
        System.out.println("mochila actualizada: " + mochila);
        System.out.println("---------------------------------------------------");

        // 3 HashMap
        HashMap<String, Integer> tesoros = new HashMap<>();

        tesoros.put("Oro", 100);
        tesoros.put("Plata", 50);
        tesoros.put("Diamantes", 5);

        System.out.println("HashMap:");
        System.out.println("cantidad de diamantes: " + tesoros.get("Diamantes"));

        tesoros.put("Oro", 200);
        System.out.println("Nuevo valor de Oro: " + tesoros.get("Oro"));
        System.out.println("-----------------------------");

        // 4. Desafio Final
        // -------------------------------------------------------

        // Array 
        int[] codigos = { 123, 456, 789 };
        System.out.println("Codigos secretos: ");
        for (int c : codigos) {
            System.out.println(c);
        }

        // ArrayList 
        ArrayList<String> exploradores = new ArrayList<>();
        exploradores.add("Adrian");
        exploradores.add("Isabella");
        exploradores.add("Diego");
        System.out.println("Exploradores: " + exploradores);

        // HashMap 
        HashMap<String, Integer> oroEncontrado = new HashMap<>();
        oroEncontrado.put("Adrian", 150);
        oroEncontrado.put("Isabella", 250);
        oroEncontrado.put("Diego", 180);

        //explorador con mas oro
        String explorador = "";
        int maxOro = 0;

        for (String nombre : exploradores) {
            int oro = oroEncontrado.get(nombre);
            if (oro > maxOro) {
                maxOro = oro;
                explorador = nombre;
            }
        }

        System.out.println("El explorador con mas oro es: " + explorador + " con " + maxOro + " monedas.");
    }
}
