package day43_OOP_Encapsulation;

public class EncapsulationIntro {
    public String username="Cybertek",password="Cybertek123";

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(String username){
        if (username.length()<5){
            System.out.println("User name needs to be at least 5 character long");
            return;
        }
        this.username=username;
    }
    public void setPassword(String password){
        if (password.length()<8){
            System.out.println("Password needs to be at least 8 characters long");
          return;
        }
        this.password=password;
    }


}
