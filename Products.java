import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Products {

  private  ArrayList<String> products = new ArrayList<>();
    private double[] prices = new double[0];
    private HashMap<String, Integer> stock = new HashMap<>();
    private double buyTotal;

   /*  public void addProduct() {
        products.add("arroz");

        products.add("arepa");
        products.add("panela");
        products.add("galleta");

        prices = new double[]{2000, 2500, 3000, 400};

        stock.put("arroz", 2000);
        stock.put("arepa", 2500);
        stock.put("panela", 3000);
        stock.put("galleta", 400);

    }*/

    private void expandPrices(double newPrice) {
        double[] newArray = new double[prices.length + 1];
        for (int i = 0; i < prices.length; i++) {
            newArray[i] = prices[i];
        }
        newArray[prices.length] = newPrice;
        prices = newArray;

    }

    private int indexOfNombre(String products) {
        return products.indexOf(products);
    }

    public void run() {
        while (true) {
            String[] opciones = {
                    "Agregar producto",
                    "Listar inventario",
                    "Comprar producto",
                    "Mostrar estadistica(Caro/Barato)",
                    "Buscar producto por nombre",
                    "Salir"
            };
            int opcion = JOptionPane.showOptionDialog(null, "Menu principal", "PRODUCTS",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]
            );

            if (opcion == 0) aggProducts();
            else if (opcion == 1) ListInventory();
            else if (opcion == 2) buyProduct();
            else if (opcion == 3) showStatistics();
            else if (opcion == 4) showProduct();
            else break;
        }
    }

    private void showStatistics() {
        if (products.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay productos para calcular estadísticas.");
            return;
        }

        double min = prices[0], max = prices[0];
        String prodMin = products.get(0), prodMax = products.get(0);

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                prodMin = products.get(i);
            }
            if (prices[i] > max) {
                max = prices[i];
                prodMax = products.get(i);
            }
        }

        JOptionPane.showMessageDialog(null,
                "Producto más barato: " + prodMin + " ($" + min + ")\n" +
                        "Producto más caro: " + prodMax + " ($" + max + ")");
    }


    private void showProduct() {
        String search = JOptionPane.showInputDialog("Ingrese nombre o parte del nombre:");
        if (search == null || search.trim().isEmpty()) return;

        StringBuilder sb = new StringBuilder("Resultados de búsqueda:\n");
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i);
            if (name.toLowerCase().contains(search.toLowerCase())) {
                sb.append(name).append(" - Precio: $")
                        .append(prices[i])
                        .append(" - Stock: ").append(stock.get(name))
                        .append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void aggProducts() {
        String name = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "nombre no valido");
            return;
        }

        if (products.contains(name)) {
            JOptionPane.showMessageDialog(null, "producto ya existente");
            return;
        }

        try {
            double price = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
            int ammount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del stock"));

            //agg products

            products.add(name);
            expandPrices(price);
            stock.put(name, ammount);

            JOptionPane.showMessageDialog(null, "Producto agregado correctamente ");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: ingrese numeros validos ");
        }

    }


    private void ListInventory() {
        if (products.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El inventario esta vacio");
        }


        StringBuilder sb = new StringBuilder("Inventario actual:\n");
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i);
            double price = prices[i];
            int amount = stock.get(name);
            sb.append(name)
                    .append(" - Precio: $").append(price)
                    .append(" - Stock: ").append(amount).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private void buyProduct() {
        if (products.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay productos para comprar");
        return;
        }

        String name= JOptionPane.showInputDialog("Ingrese el nombre del producto a comprar: ");
        if (name == null || !products.contains(name)) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado. ");
            return;
        }

        int idx= indexOfNombre(name);
        int stockActually= stock.get(name);

        try {
            int ammount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a comprar"));

            if (ammount <= 0) {
                JOptionPane.showMessageDialog(null, "Cantidad invalida");
                return;

            }

            if (ammount > stockActually) {
                JOptionPane.showMessageDialog(null, "No ay suficiente stock");
                return;
            }

            double priceTotal = prices[idx] * ammount;

            buyTotal += priceTotal;

           stock.put(name, stockActually - ammount);

           JOptionPane.showMessageDialog(null,
                "Compra realizada: "+ ammount + " de " + name +
                        " \nTotal: $ " + priceTotal);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese el numero valido");
        }



    }





}

