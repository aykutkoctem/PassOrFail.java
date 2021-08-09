package day40_CustomClass_Statics;

public class TEST {
    public static void main(String[] args) {
        String str="AAAGroup2BBB";
        char ch='A';
        int count=0;
        for (char each : str.toCharArray()) {
            if (each==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
