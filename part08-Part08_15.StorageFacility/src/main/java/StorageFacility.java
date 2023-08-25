import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    
    private HashMap<String,  ArrayList<String>> items ;
    public StorageFacility(){
        items = new HashMap<>();
    }
    public void add(String unit, String item){
        this.items.putIfAbsent(unit, new ArrayList<>());
        this.items.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit){
       return this.items.getOrDefault(storageUnit, new ArrayList<>()); 

    }
    public void remove(String storageUnit, String item){
        ArrayList<String> unit = contents(storageUnit);
        if (!unit.isEmpty()) {
            unit.remove(item);
            if (unit.isEmpty()) {
                items.remove(storageUnit);
            }
        }

    }
    public ArrayList<String> storageUnits() {
        ArrayList<String> result = new ArrayList<>();
        for (String key : items.keySet()) {
            if (!items.get(key).isEmpty()) {
                result.add(key);
            }
        }
        return result;
    }

}