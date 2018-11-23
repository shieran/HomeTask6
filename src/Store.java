public class Store {
    private int number;
    private double coast;
    private double summCoast;
    private String name;


    Store(){}

    public Store(int number, double coast, String name) {
        this.name=name;
        this.number = number;
        this.coast = coast;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public double getCoast() {
        return coast;
    }

    public String getName() {
        return name;
    }

    public double getCoastProduct(int number, double coast){
        this.summCoast=number*coast;
        return summCoast;
    }

    public static void compare(Store st1, Store st2){
        if (st1.getCoast() < st2.getCoast()){
            System.out.println("цена " + st1.getName()+ " выще чем у " + st2.getName());
        }else if (st1.getCoast() == st2.getCoast()){
            System.out.println("цены " + st1.getName() + " и " + st2.getName() + " равны");
        }else{
            System.out.println("цена " + st2.getName()+ " выще чем у " + st1.getName());
        }
    }

    public static int allNumberProducts(Store ...st){
        return st.length;
    }

//    public static void main(String[] args) {
//        Store ball = new Store(26, 51.23, "ball");
//        Store pen = new Store(44, 123.3123, "pen");
//        compare(ball, pen);
//        System.out.println("общее количесто товаров на складе " + allNumberProducts(ball, pen));
//    }


}
