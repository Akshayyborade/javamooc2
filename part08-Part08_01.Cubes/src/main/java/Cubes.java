
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("enter a number: ");
            String number = scanner.nextLine();
            if(number.equals("end")){
                break;

            }
            int num= Integer.parseInt(number);
            int Cube=(num*num*num);
            System.out.println(Cube);
        }

    }
}
