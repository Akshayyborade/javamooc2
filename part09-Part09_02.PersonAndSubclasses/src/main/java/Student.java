

public class Student extends Person {
  
    private int credit=0;
    public Student(String name, String address){
        super(name, address);
       
    }
    
    

    /**
     * @return String return the name
     */
    public String getName() {
        return super.getName();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        super.setName(name);
    }

    /**
     * @return int return the credit
     */
    public int getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public String toString(){
        return super.toString()+"\n  Study credits "+ this.credits();
    }


    /**
     * @return String return the address
     */
    public String getAddress() {
        return super.getAddress();
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        super.setAddress(address);
    }
    public void study(){
        credit++;
    }
    public int credits(){
        return credit;
    }

}