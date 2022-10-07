package lab1.task2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Lion Alex = new Lion();
        Slon Melman = new Slon();
        Zebra Marty1 = new Zebra();
        Zebra Marty2 = new Zebra();
        Zebra Marty3 = new Zebra();
        ArrayList<IEater> eaters = new ArrayList<>();
        eaters.add(Alex);
        eaters.add(Marty1);
        eaters.add(Marty2);
        eaters.add(Marty3);
        eaters.add(Melman);
        ZooKipa Shkiper = new ZooKipa();
        for (IEater e: eaters ) {
            Shkiper.toFeedEater(e);
        }
    }
}
