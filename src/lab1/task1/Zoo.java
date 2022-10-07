package lab1.task1;

public class Zoo {
    public static void main(String[] args) {
        Lion Alex = new Lion();
        Zebra Marty = new Zebra();
        Slon Melman = new Slon();
        ZooKipa Shkiper = new ZooKipa();
        Shkiper.toFeedLion(Alex);
        Shkiper.toFeedZebra(Marty);
        Shkiper.toFeedSlon(Melman);
    }
}
