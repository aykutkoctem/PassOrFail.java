package day41_CustomClass_Constructor;

import static utilities.Data.*;

public class ImportStatement {

    public static void main(String[] args) {
        /*
        Data obj=new Data();
        System.out.println(obj.str1);
        System.out.println(obj.str2);
        System.out.println(Data.);

         */


        System.out.println("----------------------------------------------------------------");
        System.out.println(str3);
        System.out.println(str4);
    }

    public static class ConstructorsIntro {

        public ConstructorsIntro(int a){
            System.out.println("Constructor with ing arg");
        }

        public static void main(String[] args) {
            new ConstructorsIntro(10);
        }
    }
}
