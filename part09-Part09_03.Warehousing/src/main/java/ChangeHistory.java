
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author AkshayBorade
 */
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    } 
    
    public void clear() {
        history.clear();
    }
    
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        if(history.isEmpty()) {
            return 0;
        }
        return Collections.max(history);
    }
    
    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        return Collections.min(history);
    }
    
    public double average() {
        double sum = 0;
        for(double d : history) {
            sum += d;
        }
        return sum / history.size();
    }
    
    
}