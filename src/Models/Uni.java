package Models;

public class Uni extends Person{
    String position;
    double salary;
    public Uni(){
        super();
        position = "Position";
        salary = 0;
    }
    public Uni(String name, String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override public int getId() {
        return super.getId();
    }

    @Override public String getName(){
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    public String getPosition() {
        return position;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    @Override
    public double p_amount() {
        return salary;
    }

    @Override
    public int compareTo(Person person) {
        if(salary == person.p_amount()) return 0;
        else if(salary > person.p_amount()) return 1;
        else return -1;
    }
}
