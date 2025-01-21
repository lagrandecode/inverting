import java.util.Date;

public class Person{
    private String name;
    private Date dob;

    public Person(String name, Date dob){
        this.name = name;
        this.dob = dob;
    }
    public String toString(){
        return name + "(" + dob + ")";
    }

}