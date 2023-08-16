import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> person;
    
    public IOU(){
     person= new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        this.person.put(toWhom,amount);
    }
    public double howMuchDoIOweTo(String toWhom){
      if (this.person.containsKey(toWhom)) {
        return this.person.get(toWhom);
      }
      return 0.0;
    }



}