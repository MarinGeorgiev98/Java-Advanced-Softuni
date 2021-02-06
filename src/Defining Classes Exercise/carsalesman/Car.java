package carsalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car (String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = -1;
        this.color = "n/a";
    }

    public Car (String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car (String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car (String model, Engine engine, int weight, String color) {
        this(model, engine, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.model + ": ");

        String weight = this.weight == -1 ? "n/a" : String.valueOf(this.weight);
        sb.append(System.lineSeparator()) // New line in StringBuilder
                .append(this.engine.toString())
                .append(System.lineSeparator())
                .append("Weight: ")
                .append(weight)
                .append(System.lineSeparator())
                .append("Color: ")
                .append(this.color);
        return sb.toString();
    }
}