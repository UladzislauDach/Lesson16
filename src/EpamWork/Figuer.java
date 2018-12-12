package EpamWork;

public class Figuer extends ElkaToy {
    private final boolean isFigureOfMan;


    public Figuer(String name, Colour colour, boolean isFigureOfMan) {
        super(name, colour, Shape.FIGURE);
        this.isFigureOfMan = isFigureOfMan;

    }

    public boolean isFigureOfMan() {
        return isFigureOfMan;
    }
}

