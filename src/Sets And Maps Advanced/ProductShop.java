import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Double>> productShop = new TreeMap<>();
        String input = scan.nextLine();

        while(!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            Double price = Double.parseDouble(tokens[2]);
            productShop.putIfAbsent(shop, new LinkedHashMap<>());
            LinkedHashMap<String, Double> products = productShop.get(shop);
            products.put(product, price);
            productShop.put(shop, products);
            input = scan.nextLine();
        }

        for (String s : productShop.keySet()) {
            System.out.printf("%s->%n", s);
            for (String product : productShop.get(s).keySet()) {
                System.out.printf("Product: %s, Price: %.1f%n",
                        product, productShop.get(s).get(product));
            }
        }
    }
}