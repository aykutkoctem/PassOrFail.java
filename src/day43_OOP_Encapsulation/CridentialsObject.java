package day43_OOP_Encapsulation;

public class CridentialsObject {
    public static void main(String[] args) {
        Credential facebook=new Credential("qw","12");
        facebook.setUsername("cybertek");
        facebook.setPassword("Cybertek123!");

        System.out.println(facebook.getUsername());
        System.out.println(facebook.getPassword());

        System.out.println("------------------------------------");
        System.out.println("username: "+facebook.getUsername());
        System.out.println("password: "+facebook.getPassword());
        System.out.println("-----------------------------------------------");
        Credential gmail=new Credential(null,null);
        gmail.setUsername("gmail.com");
        gmail.setPassword("gmail123456!");


        System.out.println(gmail.getUsername());
        System.out.println(gmail.getPassword());

    }
}
