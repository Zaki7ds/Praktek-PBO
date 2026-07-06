package Pratikum20042026;

public class Author {
    //final tidak bisa di ubah
    private final String name;
    private String email;
    private final char gender;
    
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    public String toString(){
            return name + " ( " + gender + ") at " + email;
    }
}
