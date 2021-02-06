package pokemontrainer;

import java.util.LinkedHashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();
        while(!line.equals("Tournament")) {
            String[] tokens = line.split(" ");
            line = scan.nextLine();
            String trainerName = tokens[0];
            String name = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(name, element, health);
            trainers.putIfAbsent(trainerName, trainer);
            trainers.get(trainerName).addPokemon(pokemon);
        }

        line = scan.nextLine();
        while (!line.equals("End")) {

            String element = line;

            for (Trainer trainer : trainers.values()) {
                if (trainer.hasElementType(element)) {
                    trainer.incrementBadges(1);
                }
                else {
                    trainer.damagePokemons(10);
                }
            }
            line = scan.nextLine();
        }

        trainers
                .entrySet()
                .stream()
                .sorted((f, s) -> {
                    return s.getValue().getBadges() - f.getValue().getBadges();
                })
                .forEach(e -> {
                    System.out.println(e.getValue());
                });
    }
}