package day02_printstatement;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String word=scan.next();
        char firstChar=word.charAt(3);
        System.out.println(firstChar);
    }

}
