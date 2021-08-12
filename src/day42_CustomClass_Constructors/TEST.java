package day42_CustomClass_Constructors;

import java.util.Scanner;

public class TEST {
   static int Inum=10;
    public static void main(String[] args) {

        TEST obj1=new TEST();
        obj1.Inum=20;
        TEST obj2=new TEST();
        System.out.println(obj2.Inum);
    }
}
