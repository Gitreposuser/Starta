public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }
    public String getDesignation(){
        return this.designation;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public Employee(){
        this.name = "Alex";
        this.age = 30;
        this.designation = "";
        this.salary = 2000;
    }


    public  Employee( String name,
                      int age,
                      String designation,
                      double salary){
        setName(name);
        setAge(age);
        setDesignation(designation);
        setSalary(salary);
    }
    private void showText(String text) {
        System.out.println(text);
    }

    public void showEmployeeStats() {
        showText(getName());
        showText(Integer.toString(getAge()));
        showText(getDesignation());
        showText(Double.toString(getSalary()));
    }

    public void increaseSalary(){
        setSalary(getSalary() * 2);
    }
}
