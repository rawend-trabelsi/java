package tp41;

public class Test {
    public static void main(String[] args) {
        PointCol coloredPoint = new PointCol('A', 3, 7, "Red");
        coloredPoint.afficher();
        coloredPoint.modifierCouleur("Blue");
        coloredPoint.afficher();

        Point basePoint = coloredPoint;
        basePoint.affichier();

        Point point2 = new Point('B', 5, 9);
       point2. affichier();
    }
}