package EpamWork;

import java.util.ArrayList;
import java.util.List;

public class Elka {
    private String name;
    private List<ElkaToy> toys; // = new ArrayList<>();

    public Elka(String name, List<ElkaToy> toys) {
        this.name = name;
        this.toys = toys;
    }

    public Elka(String name) {
        this.name = name;
        this.toys = new ArrayList<>();// либо в конструкторе
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElkaToy> getToys() {
        return toys;
    }

    public void setToys(List<ElkaToy> toys) {
        this.toys = toys;
    }

    public void addToy(ElkaToy toy) {
        toys.add(toy);
    }

    @Override
    public String toString() {
        return "EpamWork.Elka{" +
                "name='" + name + '\'' +
                ", toys=" + toys +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elka elka = (Elka) o;

        if (name != null ? !name.equals(elka.name) : elka.name != null) return false;
        return toys != null ? toys.equals(elka.toys) : elka.toys == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (toys != null ? toys.hashCode() : 0);
        return result;
    }

    public int countToysOfColour(Colour colour) {
        int counter = 0;
        for (ElkaToy toy : toys) {
            if (colour == toy.getColour()) {
                counter++;
            }
        }
        return counter;
    }
}
