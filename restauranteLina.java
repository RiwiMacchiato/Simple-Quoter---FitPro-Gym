import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class restauranteLina {
    public static void main(String[] args) {
        Scanner inputRestaurante = new Scanner(System.in);

        ArrayList<HashMap<String, Object>> menu = new ArrayList<>();
        ArrayList<HashMap<String, Object>> clientes = new ArrayList<>();
        ArrayList<HashMap<String, Object>> ventas = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- Restaurante Lina Cocina ---");
            System.out.println("1. Registrar plato en el menu");
            System.out.println("2. Ver menu");
            System.out.println("3. Registrar cliente");
            System.out.println("4. Tomar pedido");
            System.out.println("5. Mostrar cuentas de clientes");
            System.out.println("6. Mostrar registro de ventas");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = inputRestaurante.nextInt();
            inputRestaurante.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID del plato: ");
                    int idPlato = inputRestaurante.nextInt();
                    inputRestaurante.nextLine();

                    boolean existePlato = false;
                    for (HashMap<String, Object> plato : menu) {
                        if ((int) plato.get("id") == idPlato) {
                            existePlato = true;
                            break;
                        }
                    }

                    if (existePlato) {
                        System.out.println("Ese ID de plato ya está registrado.");
                    } else {
                        System.out.print("Nombre del plato: ");
                        String nombrePlato = inputRestaurante.nextLine();
                        System.out.print("Precio del plato: ");
                        int precioPlato = inputRestaurante.nextInt();
                        inputRestaurante.nextLine();

                        HashMap<String, Object> plato = new HashMap<>();
                        plato.put("id", idPlato);
                        plato.put("nombre", nombrePlato);
                        plato.put("precio", precioPlato);
                        menu.add(plato);

                        System.out.println("✅ Plato registrado con éxito.");
                    }
                    break;

                case 2:
                    System.out.println("Menú actual:");
                    for (HashMap<String, Object> p : menu) {
                        System.out.println("ID: " + p.get("id") + " | " + p.get("nombre") + " - $" + p.get("precio"));
                    }
                    break;

                case 3:
                    System.out.print("ID del cliente: ");
                    int idCliente = inputRestaurante.nextInt();
                    inputRestaurante.nextLine();

                    boolean existeCliente = false;
                    for (HashMap<String, Object> c : clientes) {
                        if ((int) c.get("id") == idCliente) {
                            existeCliente = true;
                            break;
                        }
                    }

                    if (existeCliente) {
                        System.out.println("El ID del cliente ya esta registrado.");
                    } else {
                        System.out.print("Nombre del cliente: ");
                        String nombreCliente = inputRestaurante.nextLine();

                        HashMap<String, Object> cliente = new HashMap<>();
                        cliente.put("id", idCliente);
                        cliente.put("nombre", nombreCliente);
                        clientes.add(cliente);

                        System.out.println("✅ Cliente registrado con exito.");
                    }
                    break;

                case 4:
                    System.out.print("ID del cliente: ");
                    int idPedidoCliente = inputRestaurante.nextInt();
                    inputRestaurante.nextLine();

                    HashMap<String, Object> clienteEncontrado = null;
                    for (HashMap<String, Object> cliente : clientes) {
                        if ((int) cliente.get("id") == idPedidoCliente) {
                            clienteEncontrado = cliente;
                            break;
                        }
                    }

                    if (clienteEncontrado == null) {
                        System.out.println("Cliente no registrado.");
                        break;
                    }

                    System.out.println("Elige un plato del menu por ID:");
                    for (HashMap<String, Object> p : menu) {
                        System.out.println("ID: " + p.get("id") + " | " + p.get("nombre") + " - $" + p.get("precio"));
                    }

                    int idPedidoPlato = inputRestaurante.nextInt();
                    inputRestaurante.nextLine();

                    HashMap<String, Object> platoEncontrado = null;
                    for (HashMap<String, Object> p : menu) {
                        if ((int) p.get("id") == idPedidoPlato) {
                            platoEncontrado = p;
                            break;
                        }
                    }

                    if (platoEncontrado == null) {
                        System.out.println("Plato no encontrado.");
                        break;
                    }

                    HashMap<String, Object> venta = new HashMap<>();
                    venta.put("idVenta", ventas.size() + 1);
                    venta.put("cliente", clienteEncontrado);
                    venta.put("plato", platoEncontrado);

                    ventas.add(venta);
                    System.out.println("✅ Pedido registrado con exito.");
                    break;

                case 5:
                    System.out.print("Ingrese el ID del cliente: ");
                    int idConsulta = inputRestaurante.nextInt();
                    inputRestaurante.nextLine();

                    HashMap<String, Object> clienteConsulta = null;
                    for (HashMap<String, Object> c : clientes) {
                        if ((int) c.get("id") == idConsulta) {
                            clienteConsulta = c;
                            break;
                        }
                    }

                    if (clienteConsulta == null) {
                        System.out.println("Cliente no encontrado.");
                        break;
                    }

                    int total = 0;
                    System.out.println("Cuenta de " + clienteConsulta.get("nombre") + ":");

                    for (HashMap<String, Object> v : ventas) {
                        HashMap<String, Object> clienteVenta = (HashMap<String, Object>) v.get("cliente");
                        if ((int) clienteVenta.get("id") == idConsulta) {
                            HashMap<String, Object> platoVenta = (HashMap<String, Object>) v.get("plato");

                            String nombrePlato = (String) platoVenta.get("nombre");
                            int precioPlato = (int) platoVenta.get("precio");

                            System.out.println("- " + nombrePlato + " $" + precioPlato);
                            total += precioPlato;
                        }
                    }

                    System.out.println("Total a pagar: $" + total);
                    break;

                case 6:
                    System.out.println("Registro de ventas:");
                    for (HashMap<String, Object> v : ventas) {
                        HashMap<String, Object> clienteV = (HashMap<String, Object>) v.get("cliente");
                        HashMap<String, Object> platoV = (HashMap<String, Object>) v.get("plato");
                        System.out.println("ID Venta: " + v.get("idVenta")
                                + " | Cliente: " + clienteV.get("nombre")
                                + " | Plato: " + platoV.get("nombre")
                                + " ($" + platoV.get("precio") + ")");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción invalida.");
            }
        } while (opcion != 0);

        inputRestaurante.close();
    }
}
