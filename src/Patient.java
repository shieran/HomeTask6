public class Patient {
    static int[] ides = {1,2,3,4,5};
    static String[] firstNames = {"ivan", "dima", "vasia", "igor", "vova"};
    static String[] secondNames = {"ivanov", "petrov", "voronov", "bobrov", "volkov"};
    static String[] lastNames = {"sergeevich", "anatolievich", "aleksandrovich", "petrovich", "olrgovich"};
    static String[] addresses = {"lenina 2", "malinina 4", "esenina 6", "krasnaya 5", "voronyanskogo 14"};
    static int[] numbers = {11111,22222,33333,44444,55555};
    static int[] numsMedCard = {123,234,345,456,567};
    static String[] diagnoses = {"orv", "blizorukost", "otit", "perelom", "sotriasenie"};

    int id;
    String firstName;
    String secondName;
    String lastName;
    String address;
    int number;
    int numMedCard;
    String diagnose;

    static Patient[] patients = new Patient[5];


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", numMedCard=" + numMedCard +
                ", diagnose='" + diagnose + '\'' +
                '}';
    }


    public Patient(int id, String firstName, String secondName, String lastName, String address, int number, int numMedCard, String diagnose) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.address = address;
        this.number = number;
        this.numMedCard = numMedCard;
        this.diagnose = diagnose;
    }

//    public static void main(String[] args) {
//        getMassPatients(patients);
//        getSameDiagnose(patients, "orv");
//        getDiapMedCard(patients, 200, 400);
//    }

    public static Patient[] getMassPatients(Patient[] pat){
        for (int i = 0; i <pat.length ; i++) {
            pat[i]=new Patient(ides[i], firstNames[i], secondNames[i], lastNames[i], addresses[i], numbers[i], numsMedCard[i], diagnoses[i]);
        }
        return pat;
    }

    public static void getSameDiagnose(Patient[] ptn, String diagn){
        System.out.println("список пициентов с диагнозом " + diagn);
        for (Patient x: ptn) {
            if (x.diagnose.equals(diagn)){
                System.out.println(x.toString());
            }
        }
    }

    public static void getDiapMedCard(Patient[] ptn, int nmcMin, int nmcMax){
        System.out.println("список пациентов, номера чьих карт находятся в диапозоне " + nmcMin + " - " + nmcMax);
        for (Patient x:ptn) {
            if (x.numMedCard >= nmcMin && x.numMedCard <= nmcMax){
                System.out.println(x.toString());
            }
        }
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

    public int getNumMedCard() {
        return numMedCard;
    }

    public String getDiagnose() {
        return diagnose;
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

    public void setNumMedCard(int numMedCard) {
        this.numMedCard = numMedCard;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }
}
