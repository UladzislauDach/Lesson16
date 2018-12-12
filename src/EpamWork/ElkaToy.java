package EpamWork;

abstract class ElkaToy implements Comparable<ElkaToy> {

    private String name;
    private Colour colour;
    private Shape shape;

    public ElkaToy(String name, Colour colour, Shape shape) {
        this.name = name;
        this.colour = colour;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "EpamWork.ElkaToy{" +
                "name='" + name + '\'' +
                ", colour=" + colour +
                ", shape=" + shape +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElkaToy elkaToy = (ElkaToy) o;

        if (name != null ? !name.equals(elkaToy.name) : elkaToy.name != null) return false;
        if (colour != elkaToy.colour) return false;
        return shape == elkaToy.shape;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (shape != null ? shape.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(ElkaToy toy) {
        return this.name.compareTo(toy.name);
    }
}
