import java.util.*;
import java.util.stream.Collectors;

public class SummerCocktails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> ingredients = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> freshnessLevel = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int mimosaCount = 0;
        int daiquiryCount = 0;
        int sunshineCount = 0;
        int mojitoCount = 0;
        int ingredientsSum = 0;
        while (!ingredients.isEmpty() && !freshnessLevel.isEmpty()) {
            if (ingredients.get(0) == 0) {
                ingredients.remove(0);
                continue;
            }
            int result = ingredients.get(0) *
                    freshnessLevel.get(freshnessLevel.size() - 1);
            if (result == 150) {
                mimosaCount++;
                freshnessLevel.remove(freshnessLevel.size() - 1);
                ingredients.remove(0);
            } else if (result == 250) {
                daiquiryCount++;
                freshnessLevel.remove(freshnessLevel.size() - 1);
                ingredients.remove(0);
            } else if (result == 300) {
                sunshineCount++;
                freshnessLevel.remove(freshnessLevel.size() - 1);
                ingredients.remove(0);
            } else if (result == 400) {
                mojitoCount++;
                freshnessLevel.remove(freshnessLevel.size() - 1);
                ingredients.remove(0);
            }
            else {
                freshnessLevel.remove(freshnessLevel.size() - 1);
                ingredients.add(ingredients.remove(0) + 5);
            }
        }
        if (!ingredients.isEmpty()) {
            for (Integer ingredient : ingredients) {
                ingredientsSum += ingredient;
            }
        }
        if (mimosaCount > 0 && daiquiryCount > 0
                && sunshineCount > 0 && mojitoCount > 0) {
            System.out.println("It's party time! The cocktails are ready!");
            System.out.printf(" # Daiquiri --> %d%n", daiquiryCount);
            System.out.printf(" # Mimosa --> %d%n", mimosaCount);
            System.out.printf(" # Sunshine --> %d%n", sunshineCount);
            System.out.printf(" # Mojito --> %d%n", mojitoCount);
        }
        else {
            System.out.println("What a pity! You didn't manage" +
                    " to prepare all cocktails");
            if (ingredientsSum > 0) {
                System.out.printf("Ingredients left: %d%n", ingredientsSum);
            }
            if (daiquiryCount > 0) {
                System.out.printf(" # Daiquiri --> %d%n", daiquiryCount);
            }
            if (mimosaCount > 0) {
                System.out.printf(" # Mimosa --> %d%n", mimosaCount);
            }
            if (mojitoCount > 0) {
                System.out.printf(" # Mojito --> %d%n", mojitoCount);
            }
            if (sunshineCount > 0) {
                System.out.printf(" # Sunshine --> %d%n", sunshineCount);
            }
        }
    }
}