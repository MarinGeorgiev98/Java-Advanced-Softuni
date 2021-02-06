package aquarium;

import java.util.*;

public class Aquarium {
    HashSet<Fish> fishinPool;
    String name;
    int capacity;
    int size;

    public Aquarium (String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishinPool = new HashSet<>();
    }

    public int getFishinPool() {
        return fishinPool.size();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(Fish fish) {
        if (this.fishinPool.size() < this.getCapacity()) {
            for (Fish fish1 : this.fishinPool) {
                if (fish.getName().equals(fish1.getName())) {
                    return;
                }
            }
        }
        fishinPool.add(fish);
    }

    public boolean remove (String name) {
        for (Fish fish : this.fishinPool) {
            if (fish.getName().equals(name)) {
                this.fishinPool.remove(fish);
                return true;
            }
        }
        return false;
    }

    public Fish findFish (String name) {
        for (Fish fish : this.fishinPool) {
            if (fish.getName().equals(name)) {
                return fish;
            }
        }
        return null;
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aquarium Info: ");
        sb.append(System.lineSeparator());
        sb.append("Aquarium: ");
        sb.append(this.name);
        sb.append(" ^ Size: ");
        sb.append(this.size);
        sb.append(System.lineSeparator());
        for (Fish fish : fishinPool) {
            sb.append("Fish: ");
            sb.append(fish.getName());
            sb.append(System.lineSeparator());
            sb.append("Color: ");
            sb.append(fish.getColor());
            sb.append(System.lineSeparator());
            sb.append("Number of fins: ");
            sb.append(fish.getFins());
            sb.append(System.lineSeparator());
            //Or sb.append(String.forma("Aquairum: %s...");
        }
        return sb.toString();
    }
}