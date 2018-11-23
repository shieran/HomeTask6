public class Fraction {
    private int chisl;
    private int znam;

    public Fraction(int chisl, int znam) {
        this.chisl = chisl;
        this.znam = znam;
    }

    public Fraction(){}

    @Override
    public String toString() {
        return "Fraction{" +
                "chisl=" + chisl +
                ", znam=" + znam +
                '}';
    }

    public static void fracSum(Fraction...frac){
        int chislSum=0;
        int obZnam=1;
        for (int i = 0; i < frac.length; i++) {
            obZnam*=frac[i].znam;
        }
        for (int i = 0; i < frac.length; i++) {
            chislSum+=(frac[i].chisl * obZnam / frac[i].znam);
        }
        System.out.println("результат сложения дробей: " + chislSum + "/" + obZnam);
    }

    public static Fraction fracSumWithoutSout(Fraction...frac){
        int chislSum=0;
        int obZnam=1;
        for (int i = 0; i < frac.length; i++) {
            obZnam*=frac[i].znam;
        }
        for (int i = 0; i < frac.length; i++) {
            chislSum+=(frac[i].chisl * obZnam / frac[i].znam);
        }
        return new Fraction(chislSum, obZnam);
    }

    public static void fracRazn(Fraction...frac){
        int chislSum=0;
        int obZnam=1;
        for (int i = 0; i < frac.length; i++) {
            obZnam*=frac[i].znam;
        }
        for (int i = 0; i < frac.length; i++) {
            if (i != 0) {
                chislSum -= (frac[i].chisl * obZnam / frac[i].znam);
            }else{
                chislSum+=(frac[i].chisl * obZnam / frac[i].znam);
            }
        }
        System.out.println("результат вычитания дробей: " + chislSum + "/" + obZnam);
    }

    public static void fracUmn(Fraction...frac){
        int chisl=1;
        int znam=1;
        for (int i = 0; i < frac.length ; i++) {
            chisl*=frac[i].chisl;
            znam*=frac[i].znam;
        }
        System.out.println("результат умножения дробей: " + chisl + "/" + znam);

    }

    public static void fracDel(Fraction...frac){
        int chisl=1;
        int znam=1;
        for (int i = 0; i < frac.length ; i++) {
            if (i==0){
                chisl*=frac[i].chisl;
                znam*=frac[i].znam;
            }else {
                chisl*=frac[i].znam;
                znam*=frac[i].chisl;
            }
        }
        System.out.println("результат деления дробей: " + chisl + "/" + znam);

    }

    public static void fracChange(Fraction[] fractions){
        System.out.println("Измененный массив");
        for (int i = 0; i < fractions.length-1 ; i++) {
            if(i%2==0){
                fractions[i]=fracSumWithoutSout(fractions[i], fractions[i+1]);
            }
        }
        for (Fraction f:fractions) {
            System.out.println(f.toString());
        }
    }



//    public static void main(String[] args) {
//        Fraction frac1 = new Fraction(3, 5);
//        Fraction frac2 = new Fraction(5, 3);
//        Fraction frac3 = new Fraction(2,7);
//        Fraction frac4 = new Fraction(6,2);
//        Fraction frac5 = new Fraction(8,5);
//        Fraction frac6 = new Fraction(9,4);
//        fracSum(frac1, frac2, frac3);
//        fracRazn(frac1, frac2, frac3);
//        fracUmn(frac1, frac2, frac3);
//        fracDel(frac1, frac2, frac3);
//
//        Fraction[] fractions = {frac1, frac2, frac3, frac4, frac5, frac6};
//
//        fracChange(fractions);
//
//
//
//    }
}
