package day40_CustomClass_Statics;

public class Adress {
    public  String buildingNumber;
    public String street;
    public String city;
    public String state;
    public int zipcode;
    public static String country="USA";

    public void setInfo (String buildingNumber,String street,String city,String state,int zipcode){
       this.buildingNumber=buildingNumber;
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
    }

    public String toString() {
        return buildingNumber+" "+street+"\n"+city+" "+state+", "+zipcode;
    }

    /*
    public void setInfo() {
        System.out.println(country);
        System.out.println(buildingNumber);// instance method accepts static & none-statics (objects can share class members)
    }
    public static void setInfo2(){
        System.out.println(country);
        System.out.println(buildingNumber);// static only accepts static members ( class cannot share object' members)
    }

 */
}
/*
1. Create a class named Address
    Attributes:
        instance:  buildingNumber,street, city, state, zipCode (multiple copies are needed)
        static: country(USA only)
    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012

 */