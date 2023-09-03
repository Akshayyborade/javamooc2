

public class Teacher extends Person {
    private int salary;
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary=salary;
        //TODO Auto-generated constructor stub
    }
    
    

    /**
     * @return int return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return super.toString()+"\n  salary "+this.salary+" euro/month";
    }

}