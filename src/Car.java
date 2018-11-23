public class Car {
    static int[] ides = {1, 2, 3, 4, 5};
    static String[] brands = {"mazda", "bmw", "opel", "kia", "vw"};
    static String[] models = {"323", "7", "astra", "sportage", "golf"};
    static int[] years = {1995, 2010, 2005, 2012, 2012};
    static String[] colors = {"blue", "black", "green", "red", "white"};
    static int[] prices = {2000, 10000, 4500, 6000, 6500};
    static String[] numbers = {"1234 OH-5", "0007 GF-7", "2342 OF-7", "5432 YY-2", "4563 IR-4"};

    int id;
    String brand;
    String model;
    int year;
    String color;
    int price;
    String number;

    static Car[] car = new Car[5];

    public Car(int id, String brand, String model, int year, String color, int price, String number) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                '}';
    }

//    public static void main(String[] args) {
//        getMass(car);
//        carsSameModel(car, "bmw");
//        carsSameModelAndPeriod(car, "astra", 5);
//        carsSameYearAndPrice(car, 2012, 6100);
//    }

    public static Car[] getMass(Car[] car){
        for (int i = 0; i < car.length ; i++) {
            car[i] = new Car(ides[i], brands[i], models[i], years[i], colors[i], prices[i], numbers[i]);
        }
        return car;
    }

    public  static  void  carsSameModel(Car[] car, String brnd){
        System.out.println("автомобили марки " + brnd);
        for (Car x: car) {
            if (x.brand.equals(brnd)){
                System.out.println(x.toString());
            }
        }
    }

    public static void carsSameModelAndPeriod(Car[] car, String mdl, int prd){
        System.out.println("авто модели " + mdl + " и сроком эксплуатации больше " + prd + " лет");
        for (Car x: car) {
            if (x.model.equals(mdl) && ((2018 - x.year) > prd)){
                System.out.println(x.toString());
            }
        }
    }

    public static void carsSameYearAndPrice(Car[] car, int yr, int prc){
        System.out.println("авто " + yr + " года выпуска, цена которых больше " + prc);
        for (Car x: car) {
            if (x.year == yr && x.price > prc){
                System.out.println(x.toString());
            }
        }
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
