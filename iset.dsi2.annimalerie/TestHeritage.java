package isetdsiannimalerie;

public class TestHeritage {

    public static void main(String[] args) {
        Animal T[] = new Animal[3];
        T[0] = new Animal("rouge", 155);
        T[1] = new Chat("vert", 155, false);
        T[2] = new Chien("noir", 155, "caniche");

        System.out.println("*******************tab************************");
        for (int i = 0; i < T.length; i++) {
            System.out.println("Animal " + (i + 1) + ": " + T[i].toString());

            if (T[i] instanceof Animal) {
                T[i].manger();
                T[i].boire();
            }

            if (T[i] instanceof Chat) {
                System.out.println("*******************Chat************************");
                T[i].manger();
                T[i].boire();
                T[i].manger();
            }

            if (T[i] instanceof Chien) {
                System.out.println("*******************Chien************************");
                T[i].manger();
                T[i].boire();
                T[i].manger();
            } else {
                System.out.println("L'espèce de cet animal est inconnue");
            }
        }
    }
}
