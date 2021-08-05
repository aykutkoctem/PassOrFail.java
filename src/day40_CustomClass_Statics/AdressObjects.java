package day40_CustomClass_Statics;

import java.util.Scanner;

public class AdressObjects {
    public static void main(String[] args) {
        Adress adress=new Adress();
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your building number");
        String building=scan.next();

        scan.nextLine();
        System.out.println("Enter your street name");
        String street=scan.nextLine();

        System.out.println("Enter your city name");
        String city=scan.nextLine();

        System.out.println("Enter your state name");
        String state=scan.nextLine();

        System.out.println("Enter your zipcode");
        int zipcode=scan.nextInt();

        adress.setInfo(building,street,city,state,zipcode);
        System.out.println(adress);
    }
}
