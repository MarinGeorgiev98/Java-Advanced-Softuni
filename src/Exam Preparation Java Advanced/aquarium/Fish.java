package aquarium;

public class Fish {
    private String name;
    private String color;
    private int fins;

    public Fish(String name, String color, int fins) {
        this.name = name;
        this.color = color;
        this.fins = fins;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getFins() {
        return this.fins;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fish: ");
        sb.append(this.name);
        sb.append(System.lineSeparator());
        sb.append("Color: ");
        sb.append(this.color);
        sb.append(System.lineSeparator());
        sb.append("Number of fins: ");
        sb.append(this.fins);
        return sb.toString();
        // Or: String result = String.format("Fish ;%s%dColor:...");
        //return result;
    }
}