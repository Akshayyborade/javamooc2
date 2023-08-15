public class Container {
    private int amount;

    public Container() {

    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount>0) {
            this.amount += amount;
            
        }
        if (this.contains()>100) {
            this.amount=100;
            
        }
    }

    public void remove(int amount) {
        if (amount>0) {
            this.amount -= amount;
        } 
        if (this.contains()<0) {
            this.amount=0;
            
        }

    }
    public String toString(){
        return this.contains()+"/"+100;
    }

}
