package day43_OOP_Encapsulation;

public class Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable);// public access modifier is reachable in same package
        System.out.println(AccessModifiers.defaultVariable);
        EncapsulationIntro obj=new EncapsulationIntro();
      /*  System.out.println(obj.username);
        System.out.println(obj.password);

        obj.username="U";
        obj.password="123";
        System.out.println(obj.username);
        System.out.println(obj.password);

       */

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());
        obj.setUsername("Aykut");
        obj.setPassword("123");
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());
    }

}
