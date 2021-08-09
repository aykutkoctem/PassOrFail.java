package day41_CustomClass_Constructor;
import static  utilities.StringUtility.reverse;

public class PalindromeTask {

    public static void main(String[] args) {
        String word="Level";
        System.out.println(reverse(word));
      boolean r1= reverse(word).equalsIgnoreCase(word);
        System.out.println(r1);
    }
}
