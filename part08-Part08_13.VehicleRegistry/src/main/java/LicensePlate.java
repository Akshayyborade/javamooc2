
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    public boolean equals(Object obj){
        if(obj==this){
            return true;
        }
        if((obj==null)||!(obj instanceof LicensePlate)){
            return false;
        }
        LicensePlate otherLicense= (LicensePlate) obj;
        if(this.liNumber.equals(otherLicense.liNumber) && this.country.equals(otherLicense.country) ){
            return  true ;
        }
        return false;
    }
    public int hashcode(){
        return Objects.hash(this);
    }

}
