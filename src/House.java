public class House {
    static int[] ides = {1, 2, 3, 4, 5};
    static int[] numbers = {3, 24, 32, 44, 67};
    static int[] squares = {56, 77, 34, 83, 123};
    static int[] floors = {1, 2, 3, 4, 6};
    static int[] chambers = {2, 3, 1, 3, 4};
    static String[]  streets = {"lenina", "moskovskaia", "podeditelei", "krasnaya", "yakubova"};
    static String[] types = {"zhiloe", "zhiloe","zhiloe", "zhiloe", "zhiloe"};
    static int[] lifetimes = {10, 5, 4, 6, 18};

    int id;
    int number;
    int square;
    int froor;
    int chamber;
    String street;
    String type;
    int lifetime;

    static House[] house = new House [5];

    public House(int id, int number, int square, int froor, int chamber, String street, String type, int lifetime) {
        this.id = id;
        this.number = number;
        this.square = square;
        this.froor = froor;
        this.chamber = chamber;
        this.street = street;
        this.type = type;
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", number=" + number +
                ", square=" + square +
                ", froor=" + froor +
                ", chamber=" + chamber +
                ", street='" + street + '\'' +
                ", type='" + type + '\'' +
                ", lifetime=" + lifetime +
                '}';
    }


//    public static void main(String[] args) {
//        getMass(house);
//        sameChambers(house, 3);
//        sameChamAndFloor(house, 3, 2, 5);
//        overSquare(house, 50);
//    }

    public static House[] getMass(House[] hs){
        for (int i = 0; i < hs.length; i++) {
            hs[i]= new House(ides[i], numbers[i], squares[i], floors[i], chambers[i], streets[i], types[i], lifetimes[i]);
        }
        return hs;
    }

    public static void sameChambers(House[] hs, int numChambers){
        System.out.println("список квартир имеющих " + numChambers + " комнат(ы)");
        for (House x: hs) {
            if (x.chamber==numChambers){
                System.out.println(x.toString());
            }
        }
    }

    public static void sameChamAndFloor(House[] hs, int numCh, int numFlMin, int numFlMax){
        System.out.println("список квартир имеющих " + numCh + " комнат(ы) и расположенных на этажах в промежутке " + numFlMin + "-" + numFlMax);
        for (House x: hs) {
            if (x.chamber==numCh && x.froor>=numFlMin && x.froor<=numFlMax){
                System.out.println(x.toString());
            }
        }
    }

    public static void overSquare(House[] hs, int sqr){
        System.out.println("список квартир, площадь которых больше " + sqr);
        for (House x: hs) {
            if (x.square>sqr){
                System.out.println(x.toString());
            }
        }
    }


    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getSquare() {
        return square;
    }

    public int getFroor() {
        return froor;
    }

    public int getChamber() {
        return chamber;
    }

    public String getStreet() {
        return street;
    }

    public String getType() {
        return type;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setFroor(int froor) {
        this.froor = froor;
    }

    public void setChamber(int chamber) {
        this.chamber = chamber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
}
