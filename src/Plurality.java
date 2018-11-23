import java.util.Arrays;
import java.util.Scanner;

public class Plurality {

    private int n;
    private char[] chars;


    public Plurality(){}


    public Plurality(int n, char[] chars) {
        this.n = n;
        this.chars = getChars(chars, n);
    }

    public static char[] getChars(char[] ch, int length){
        char[] chars = new char[length];
        for (int i = 0; i < length ; i++) {
            chars[i]=ch[i];
        }
        return chars;
    }



    @Override
    public String toString() {
        return "Plurality{" +
                "n=" + n +
                ", chars=" + Arrays.toString(chars) +
                '}';
    }



    public static char[] getMas(int n, Scanner scanner){
        String str;
        do {
            System.out.println("введите строку символов с количеством символов больше " + n);
            str = scanner.next();
        }while (str.length()<n);
        char[] ch = new char[n];
        for (int i = 0; i < n ; i++) {
            ch[i]=str.charAt(i);
        }
        return ch;
    }

//===========================================================================================

    public static void symbolProp(char ch, Plurality plurality){
        for (int i = 0; i < plurality.chars.length; i++) {
            if(ch==plurality.chars[i]){
                System.out.println("символ "+ch+" принадлежит множеству " + plurality.toString());
                return;
            }
        }
        System.out.println("символ "+ch+" не принадлежит множеству " + plurality.toString());
    }

//===========================================================================================


    public static void proizvPlur(Plurality pl1, Plurality pl2){
        char[] chars;
        int counter=0;
        if (pl1.chars.length>=pl2.chars.length){
            chars = new char[pl2.chars.length];
            for (int i = 0; i < pl1.chars.length ; i++) {
                for (int j = 0; j < pl2.chars.length; j++) {
                    if (pl1.chars[i]==pl2.chars[j]){
                        chars[counter]=pl2.chars[j];
                        counter++;
                    }
                }
            }
        }else {
            chars = new char[pl1.chars.length];
            for (int i = 0; i < pl2.chars.length ; i++) {
                for (int j = 0; j < pl1.chars.length; j++) {
                    if (pl2.chars[i]==pl1.chars[j]){
                        chars[counter]=pl1.chars[j];
                        counter++;
                    }
                }
            }
        }
        Plurality plurality = new Plurality(counter, chars);
        System.out.println(plurality.toString());
    }





//=========================================================
    public static boolean sravnCh(char ch, Plurality pl){
        for (int i = 0; i < pl.chars.length ; i++) {
            if (pl.chars[i]==ch){
                return true;
            }
        }
        return false;
    }

    public static void sumPlur(Plurality pl1, Plurality pl2){
        int counter=0;
        char[] chars = new char[pl1.chars.length + pl2.chars.length];

        for (int i = 0; i < pl1.chars.length ; i++) {
            if (sravnCh(pl1.chars[i], pl2)){
            }
            else{
                chars[counter]=pl1.chars[i];
                counter++;
            }
        }

        for (int i = 0; i < pl2.chars.length ; i++) {
            if (sravnCh(pl2.chars[i], pl1)){
            }
            else{
                chars[counter]=pl2.chars[i];
                counter++;
            }
        }
        Plurality plurality = new Plurality(counter, chars);
        System.out.println(plurality.toString());
    }
//==================================================================

    public static void raznPlur(Plurality pl1, Plurality pl2){
        int counter=0;
        char[] chars = new char[pl1.chars.length];

        for (int i = 0; i < pl1.chars.length ; i++) {
            if (sravnCh(pl1.chars[i], pl2)){
            }else {
                chars[counter]=pl1.chars[i];
                counter++;
            }
        }
        Plurality plurality = new Plurality(counter, chars);
        System.out.println(plurality.toString());

    }
//==================================================================







//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Plurality pl1 = new Plurality(5, getMas(5,scanner));
//        Plurality pl2 =  new Plurality(7, getMas(7, scanner));
//
////        symbolProp('h', pl1);
////        proizvPlur(pl1, pl2);
////        sumPlur(pl1, pl2);
////        raznPlur(pl1, pl2);
//    }
}
