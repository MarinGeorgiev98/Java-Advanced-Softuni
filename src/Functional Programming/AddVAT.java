import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> prices = new ArrayList<>();
        prices = Arrays.stream(scan.nextLine().split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        UnaryOperator<Double> vat = e -> e * 1.2;
        System.out.println("Prices with VAT:");
        for (Double price : prices) {
            System.out.printf("%.2f%n", vat.apply(price));
        }
    }
}