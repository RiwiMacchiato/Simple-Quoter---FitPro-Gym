import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class research {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n" + "=".repeat(60));
            System.out.println("    MISION DE INVESTIGACION: EXPLORADORES DE DATOS EN JAVA");
            System.out.println("=".repeat(60));

            System.out.println("\n" + "=".repeat(50));
            System.out.println("         COFRE 1: ARRAY - EL COFRE ORDENADO");
            System.out.println("=".repeat(50));

            // 1. Array - Declare and access elements
            System.out.println("Ingrese 5 numeros favoritos para el array:");
            int[] numerosFavoritos = new int[5];
            for (int i = 0; i < 5; i++) {
                do {
                    System.out.println("Numero " + (i + 1) + ": ");
                    if (sc.hasNextInt()) {
                        numerosFavoritos[i] = sc.nextInt();
                        break;
                    } else {
                        System.out.println("Entrada invalida, ingrese un numero entero");
                        sc.next();
                    }
                } while (true);
            }
            System.out.println("Cofre Array creado con 5 numeros favoritos:");
            System.out.println("Contenido completo: [");
            for (int i = 0; i < numerosFavoritos.length; i++) {
                System.out.println(numerosFavoritos[i]);
                if (i < numerosFavoritos.length - 1)
                    System.out.println(", ");
            }
            System.out.println("]");

            // Access first and last elements
            System.out.println("\nAccediendo a tesoros especificos:");
            System.out.println("Primer tesoro (indice 0): " + numerosFavoritos[0]);
            System.out.println("Ultimo tesoro (indice " + (numerosFavoritos.length - 1) + "): "
                    + numerosFavoritos[numerosFavoritos.length - 1]);

            // Modify element at position 2
            System.out.println("\nModificando el tesoro en la posicion 2...");
            System.out.println("Valor anterior en posicion 2: " + numerosFavoritos[2]);
            numerosFavoritos[2] = 777;
            System.out.println("Nuevo valor en posicion 2: " + numerosFavoritos[2]);

            System.out.println("\n" + "=".repeat(50));
            System.out.println("         COFRE 2: ARRAYLIST - LA MOCHILA MAGICA");
            System.out.println("=".repeat(50));

            // 2. ArrayList - Create and manipulate dynamic list
            ArrayList<String> mochila = new ArrayList<>();
            System.out.println("Ingrese 3 objetos para llevar en su aventura:");
            sc.nextLine();
            for (int i = 0; i < 3; i++) {
                String objeto;
                do {
                    System.out.println("Objeto " + (i + 1) + ": ");
                    objeto = sc.nextLine().trim();
                    if (objeto.isEmpty()) {
                        System.out.println("No puede estar vacio, ingrese un objeto");
                    }
                } while (objeto.isEmpty());
                mochila.add(objeto);
            }

            System.out.println("Mochila magica creada con objetos de aventura:");
            System.out.println("Contenido: " + mochila);

            // Access element by index
            System.out.println("\nAccediendo al segundo objeto:");
            System.out.println("Objeto en posicion 1: " + mochila.get(1));

            // Remove element by position
            int posicionARemover;
            do {
                System.out.println("\nQue posicion desea remover? (1-" + mochila.size() + "):");
                if (sc.hasNextInt()) {
                    posicionARemover = sc.nextInt();
                    if (posicionARemover >= 1 && posicionARemover <= mochila.size()) {
                        break;
                    } else {
                        System.out.println(
                                "Posicion invalida. Debe estar entre 1 y " + mochila.size());
                    }
                } else {
                    System.out.println("Entrada invalida, ingrese un numero entero");
                    sc.next();
                }
            } while (true);

            String objetoRemovido = mochila.remove(posicionARemover - 1);
            System.out.println("Objeto removido: " + objetoRemovido);
            System.out.println("Mochila actualizada: " + mochila);
            System.out.println("Tamano actual de la mochila: " + mochila.size());

            System.out.println("\n" + "=".repeat(50));
            System.out.println("         COFRE 3: HASHMAP - EL MAPA DEL TESORO");
            System.out.println("=".repeat(50));

            // 3. HashMap - Store key-value pairs
            HashMap<String, Integer> tesoros = new HashMap<>();
            System.out.println("Ingrese la cantidad de cada tesoro encontrado:");

            int oro, plata, diamantes;

            do {
                System.out.println("Oro: ");
                if (sc.hasNextInt()) {
                    oro = sc.nextInt();
                    if (oro >= 0) {
                        break;
                    } else {
                        System.out.println("La cantidad de oro no puede ser negativa");
                    }
                } else {
                    System.out.println("Entrada invalida, ingrese un numero entero");
                    sc.next();
                }
            } while (true);
            tesoros.put("Oro", oro);

            do {
                System.out.println("Plata: ");
                if (sc.hasNextInt()) {
                    plata = sc.nextInt();
                    if (plata >= 0) {
                        break;
                    } else {
                        System.out.println("La cantidad de plata no puede ser negativa");
                    }
                } else {
                    System.out.println("Entrada invalida, ingrese un numero entero");
                    sc.next();
                }
            } while (true);
            tesoros.put("Plata", plata);

            do {
                System.out.println("Diamantes: ");
                if (sc.hasNextInt()) {
                    diamantes = sc.nextInt();
                    if (diamantes >= 0) {
                        break;
                    } else {
                        System.out.println("La cantidad de diamantes no puede ser negativa");
                    }
                } else {
                    System.out.println("Entrada invalida, ingrese un numero entero");
                    sc.next();
                }
            } while (true);
            tesoros.put("Diamantes", diamantes);

            System.out.println("Mapa del tesoro creado:");
            System.out.println("Tesoros encontrados: " + tesoros);

            // Access value by key
            System.out.println("\nBuscando diamantes en el mapa...");
            System.out.println("Diamantes encontrados: " + tesoros.get("Diamantes"));

            // Update existing value
            System.out.println("\nActualizando cantidad de Oro...");
            System.out.println("Oro anterior: " + tesoros.get("Oro"));
            tesoros.put("Oro", 200);
            System.out.println("Oro actualizado: " + tesoros.get("Oro"));

            // 4. Final Challenge - Combining all structures
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         DESAFIO FINAL - COMBINANDO TODOS LOS COFRES");
            System.out.println("=".repeat(50));

            // Array for secret codes
            System.out.println("Ingrese 3 codigos secretos:");
            int[] codigosSecretos = new int[3];
            for (int i = 0; i < 3; i++) {
                do {
                    System.out.println("Codigo " + (i + 1) + ": ");
                    if (sc.hasNextInt()) {
                        codigosSecretos[i] = sc.nextInt();
                        break;
                    } else {
                        System.out.println("Entrada invalida, ingrese un numero entero");
                        sc.next();
                    }
                } while (true);
            }
            System.out.println("Codigos secretos encontrados:");
            System.out.println("Codigos: [");
            for (int i = 0; i < codigosSecretos.length; i++) {
                System.out.println(codigosSecretos[i]);
                if (i < codigosSecretos.length - 1)
                    System.out.println(", ");
            }
            System.out.println("]");

            // ArrayList for explorer names
            ArrayList<String> exploradores = new ArrayList<>();
            System.out.println("\nIngrese los nombres de 3 exploradores:");
            sc.nextLine();
            for (int i = 0; i < 3; i++) {
                String explorador;
                do {
                    System.out.println("Explorador " + (i + 1) + ": ");
                    explorador = sc.nextLine().trim();
                    if (explorador.isEmpty()) {
                        System.out.println("No puede estar vacio, ingrese un nombre");
                    }
                } while (explorador.isEmpty());
                exploradores.add(explorador);
            }
            System.out.println("Exploradores en la mision: " + exploradores);

            // HashMap for explorer gold amounts
            HashMap<String, Integer> oroExploradores = new HashMap<>();
            System.out.println("\nIngrese la cantidad de oro encontrado por cada explorador:");
            for (String explorador : exploradores) {
                int oroEncontrado;
                do {
                    System.out.println(explorador + ": ");
                    if (sc.hasNextInt()) {
                        oroEncontrado = sc.nextInt();
                        if (oroEncontrado >= 0) {
                            break;
                        } else {
                            System.out.println("La cantidad de oro no puede ser negativa");
                        }
                    } else {
                        System.out.println("Entrada invalida, ingrese un numero entero");
                        sc.next();
                    }
                } while (true);
                oroExploradores.put(explorador, oroEncontrado);
            }
            System.out.println("\nOro encontrado por cada explorador: " + oroExploradores);

            // Find explorer with most gold
            String exploradorConMasOro = "";
            int maxOro = 0;

            for (String explorador : exploradores) {
                int oroExplorador = oroExploradores.get(explorador);
                if (oroExplorador > maxOro) {
                    maxOro = oroExplorador;
                    exploradorConMasOro = explorador;
                }
            }

            System.out.println("\n*** RESULTADO DE LA MISION ***");
            System.out.println("El explorador con mas oro es: " + exploradorConMasOro);
            System.out.println("Cantidad de oro: " + maxOro + " monedas!");

            System.out.println("\n" + "=".repeat(60));
            System.out.println("    MISION COMPLETADA - HAS DOMINADO LOS TRES COFRES!");
            System.out.println("=".repeat(60));

            String confirm;
            do {
                System.out.println("\nDesea repetir la mision de investigacion? (si/no): ");
                confirm = sc.nextLine().trim();
                if (!confirm.equals("si") && !confirm.equals("no")) {
                    System.out.println("Ingrese una opcion valida");
                }
            } while (!confirm.equals("si") && !confirm.equals("no"));

            if (confirm.equals("no")) {
                System.out.println("\nGracias por explorar los cofres de datos de Java!");
                System.out.println("Que la programacion te acompane, explorador!");
                sc.close();
                break;
            }
        }
    }
}
