package day42_CustomClass_Constructors;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Sabir");
        Employee employee2=new Employee("Aykut","Sdet");
        Employee employee3=new Employee("Anil","QA",1234);
        Employee employee4=new Employee("Ahmet","SDET",123456,220001);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
    }
}
