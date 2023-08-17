public class Main {
    public static void main(String[] args) {
        Point point = new Point(6.1f, 8.7f);
        System.out.println(point);
        point.setXY(2.1f, 4.5f);
        float[] arr =  point.getXY();
        for (float item : arr) {
            System.out.print(item + "\n");
        }

        MovablePoint movablePoint = new MovablePoint(1.1f, 2.2f,3.3f,4.4f);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}