public class Employee {
    
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    
    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public String getFullName(){
        return firstName+lastName;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public Employee(String firstName,String lastName,int age,double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    public Employee(String firstName,String lastName,int age){
        this(firstName,lastName,age,1000);
    }

     public Employee(String firstName,String lastName){
        this(firstName,lastName,25,1000);
    }
    
    
    
}
