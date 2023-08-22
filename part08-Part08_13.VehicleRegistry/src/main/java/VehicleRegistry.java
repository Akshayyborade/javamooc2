import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> VehicleRegistry;

    public VehicleRegistry() {
        this.VehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.VehicleRegistry.containsKey(licensePlate)) {
            return false;
        } else {
            this.VehicleRegistry.putIfAbsent(licensePlate, "");
            // System.out.println("Added "+owner+" to the registry.");
            //grdhdhd
            return true;
        }

    }

    public String get(LicensePlate licensePlate) {
        try {
            return this.VehicleRegistry.getOrDefault(licensePlate, "Not Found!");
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }

    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.VehicleRegistry.containsKey(licensePlate)) {
            return false;
        } else {
            for (Map.Entry entry : this.VehicleRegistry.entrySet()) {
                if ((entry).getKey().equals((licensePlate))) {
                    break;
                }
            }

        }
        return true;
    }
}