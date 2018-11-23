public class Student {
    private int id;
    private String secondName;
    private String firstName;
    private String lastName;
    private int year;
    private String address;
    private int number;
    private String faculty;
    private int kurs;
    private int groupe;


    public Student (String firstName, String secondName, String lastName, int year, String address, int number, String faculty, int kurs, int groupe, int id){
        this.firstName=firstName;
        this.secondName=secondName;
        this.lastName=lastName;
        this.year=year;
        this.address=address;
        this.number=number;
        this.id=id;
        this.faculty=faculty;
        this.groupe=groupe;
        this.kurs=kurs;

    }


//    public static void main(String[] args) {
//        Student st1 = new Student("Ivan", "Ivanov", "Ivanovich", 1991, "Lenina 5", 2000000, "energofac", 1, 306319, 1 );
//        Student st2 = new Student("Petr", "Petrov", "Petrovich", 1992, "Meleza 2", 2001010, "inyaz", 2, 305312, 2);
//        Student st3 = new Student("Andrey", "Andreev", "Andreevich", 1993, "Kulman 4", 2002020, "bizness", 4, 302321, 3);
//        Student[] studmass = {st1, st2, st3};
//
//        getFacultyStud("energofac", studmass );
//
//        String[] fclt = {"energofac", "inyaz", "bizness"};
//        int[] krs = {1,2,3,4,5};
//        getFacultyKurs(fclt, krs, studmass);
//
//        getDateStud(1992, studmass);
//
//        getGroupeStud(306319, studmass);
//
//
//    }

    public static void getFacultyStud(String fclt, Student[] stdm){
        System.out.println("Список студентов факультета Энергофак: ");
        for (Student x: stdm) {
            if (x.faculty.equals(fclt)){
                System.out.println(x.secondName + " " + x.firstName + " " + x.lastName);
            }
        }
    }

    public static void getFacultyKurs(String[] fclt, int[] krs, Student[] stdm){
        for (String s: fclt) {
            System.out.println("список студентов факультета "+ s);
            for (Student x: stdm) {
                if (s.equals(x.faculty)){
                    System.out.println(x.secondName + " " + x.firstName + " " + x.lastName);
                }
            }
        }

        for (int k: krs) {
            System.out.println("список студентов курса "+ k);
            for (Student x: stdm) {
                if (k==x.kurs){
                    System.out.println(x.secondName + " " + x.firstName + " " + x.lastName);
                }
            }
        }
    }


    public static void getDateStud(int date, Student[] stdm){
        System.out.println("студенты, родившиеся после " + date + " года: ");
        for (Student x: stdm) {
            if (x.year>date){
                System.out.println(x.secondName + " " + x.firstName + " " + x.lastName);
            }
        }
    }

    public static void getGroupeStud(int grp, Student[] stdm){
        System.out.println("список группы " + grp);
        for (Student x: stdm) {
            if (x.groupe==grp){
                System.out.println(x.secondName + " " + x.firstName + " " + x.lastName);
            }
        }
    }


    public int getId() {
        return id;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getKurs() {
        return kurs;
    }

    public int getGroupe() {
        return groupe;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year='" + year + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", faculty='" + faculty + '\'' +
                ", kurs=" + kurs +
                ", groupe=" + groupe +
                '}';
    }
}
