package EpamWork;

import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ElkaToy toy = new Round("кружок", Colour.RED);
        Figuer dedMoroz = new Figuer("дед мороз", Colour.RED, true);
        Star star1 = new Star("звезда", Colour.WHITE);
        ElkaToy star2 = new Star("звезда 2", Colour.BLACK);
        Elka elka = new Elka("елка");
        elka.addToy(toy);
        elka.addToy(dedMoroz);
        elka.addToy(star1);
        elka.addToy(star2);

        System.out.println(elka.countToysOfColour(Colour.RED));
        System.out.println(elka.countToysOfColour(Colour.BLACK));

        System.out.println(elka.getToys());
        Collections.sort(elka.getToys());
        System.out.println(elka.getToys());

        Comparator<ElkaToy> coloursComparator = new Comparator<ElkaToy>() {
            @Override
            public int compare(ElkaToy o1, ElkaToy o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 != null && o2 == null) {
                    return 1;
                }
                if (o1 == null && o2 != null) {
                    return -1;
                }
                return o1.getColour().compareTo(o2.getColour());

            }
        };

        Collections.sort(elka.getToys(), coloursComparator);


    }
}
