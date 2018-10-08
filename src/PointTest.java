public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(3, 2);
        System.out.println(point.toString());

        MovablePoint mp = new MovablePoint(2,3,5,6);
        System.out.println(mp.toString());
        MovablePoint mpMoved = mp.move();
        System.out.println(mpMoved.toString());
    }
}
