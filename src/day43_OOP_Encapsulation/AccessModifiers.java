package day43_OOP_Encapsulation;

public class AccessModifiers {
 public static int publicVariable=100;
 //protected static int protectVariable=1000;
 static int defaultVariable=200; // access modifier:default
 private static int privateVariable=200;

    public static void main(String[] args) {
        System.out.println(privateVariable);// private access modifier is reachable within same class
        System.out.println(defaultVariable);//
        System.out.println(publicVariable);
    }

}
