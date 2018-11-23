import java.util.Arrays;

public class Abiturient {
    static int[] ides = {1, 2, 3, 4, 5};
    static String[] firstNames = {"ivan", "dima", "vasia", "igor", "vova"};
    static String[] secondNames = {"ivanov", "petrov", "voronov", "bobrov", "volkov"};
    static String[] lastNames = {"sergeevich", "anatolievich", "aleksandrovich", "petrovich", "olrgovich"};
    static String[] addresses = {"lenina 2", "malinina 4", "esenina 6", "krasnaya 5", "voronyanskogo 14"};
    static int[] numbers = {11111, 22222, 33333, 44444, 55555};
    static int[][] gradesMas = {{10, 3, 6, 10, 8}, {8, 2, 3, 5, 4}, {8, 2, 3, 5, 4}, {5, 8, 7, 5, 7}, {8, 3, 6, 9, 4}};

    int id;
    String firstName;
    String secondName;
    String lastName;
    String address;
    int number;
    int[] grades;

    static Abiturient[] abt = new Abiturient[5];

    public Abiturient(int id, String firstName, String secondName, String lastName, String address, int number, int[] grades) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.address = address;
        this.number = number;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

//    public static void main(String[] args) {
//        getMassAbiturients(abt);
//        dvoechniki(abt, gradesMas, 4);
//        double[] srGrades = sredniyBul(gradesMas);
//        checkSrGrades(abt, srGrades, 6.5);
//        checkNStudMaxSrGrades(abt, srGrades, 4);
//    }

    public static Abiturient[] getMassAbiturients(Abiturient[] abt) {
        for (int i = 0; i < abt.length; i++) {
            abt[i] = new Abiturient(ides[i], firstNames[i], secondNames[i], lastNames[i], addresses[i], numbers[i], gradesMas[i]);
        }
        return abt;
    }

    public static void dvoechniki(Abiturient[] abt, int[][] grd, int min) {
        System.out.println("список абитуриентов с оценками ниже " + min);
        for (int i = 0; i < abt.length; i++) {
            for (int j = 0; j < grd[i].length; j++) {
                if (grd[i][j] < min) {
                    System.out.println(abt[i].toString());
                    break;
                }
            }
        }
    }

    public static double[] sredniyBul(int[][] grd) {
        double sum;
        double[] srGrd = new double[grd.length];
        for (int i = 0; i < grd.length; i++) {
            sum = 0;

            for (int j = 0; j < grd[i].length; j++) {
                sum += grd[i][j];
            }
            srGrd[i] = sum / grd[i].length;
        }
        System.out.println(Arrays.toString(srGrd));
        return srGrd;
    }

    public static void checkSrGrades(Abiturient[] abt, double[] srGrd, double minSrGrd) {
        for (int i = 0; i < srGrd.length; i++) {
            if (srGrd[i] > minSrGrd) {
                System.out.println(abt[i].toString());
            }
        }
    }



    public static void checkNStudMaxSrGrades(Abiturient[] abt, double[] srGrd, int n) {
        int[] indsMax = new int[n];//массив, в который будут помещаться номера индексов
                                   // максимальных значений, которые уже были выведены
        System.out.println(n + " абитуриента(ов), имеющих самый высокий средний балл:");
        for (int i = 0; i < n; i++) {
            int indMax = 0;
            double max = 0;
            for (int j = 0; j < srGrd.length; j++) {
                if (i==0 && srGrd[j] >= max){//на первом шаге индексы сверять нам не с чем
                    max = srGrd[j];
                    indMax = j;
                }else if (srGrd[j] >= max && getVerify(indsMax, j, i))//вызываем метод, который сверяет нынешний индекс
                                                                      // с индексами элементов, которые уже были выведены.
                                                                      //один и тот же элемент не будет выведен больше одного раза
                {
                    max = srGrd[j];
                    indMax = j;
                }
            }
            System.out.println(abt[indMax].toString());
            indsMax[i]=indMax;
        }

        System.out.println("список студентов, имеющих полупроходной балл:");
        double original = srGrd[indsMax[n-1]];//за полупроходной балл будет взято значение srGrd с индексом,
                                             // равным последнему записанному значению в массив indsMax
        for (int i = 0; i < srGrd.length; i++) {
            if (srGrd[i]==original){
                System.out.println(abt[i].toString());
            }
        }
    }
    //метод, который сверяет индексы элементов массива со средними баллами с теми, которые уже были отобраны и выведены
    //возвращает true, если такого индекса еще не было
    public static boolean getVerify(int[] arr, int i, int step){
        for (int j = 0; j <=step; j++) {
            if (arr[j]==i){
                return false;
            }
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}













