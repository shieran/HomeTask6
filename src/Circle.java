public class Circle {
    private int radius;
    private int x;
    private int y;
    private static double square;
    private static double round;


    public Circle() {}

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setXsetY(int changeX, int changeY) {
        this.x += changeX;
        this.y += changeY;
    }

    public void setRadius(int changeRadius){
        this.radius += changeRadius;
    }



    public static void showPar(Circle crc){
        System.out.println(crc.toString());
    }

    public static double getSquare(int r){
        square=3.14*r*r;
        return square;
    }

    public static double getRound(int r){
        round=3.14*r*2;
        return round;
    }



//    public static void main(String[] args) {
//        Circle crc = new Circle(10,15,25);
//        showPar(crc);
//        crc.setRadius(13);
//        crc.setXsetY(14,18);
//        showPar(crc);
//        System.out.println(getSquare(crc.getRadius()));
//        System.out.println(getRound(crc.getRadius()));
//    }
}
