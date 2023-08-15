import java.util.Scanner;
public class UserInterface {
    private TodoList list;
    private Scanner scan;
    public UserInterface(TodoList list, Scanner scan){
    this.list=list;
    this.scan=scan;
    }
    public void start(){
        while (true) {
            System.out.println("Command: ");
            String cmd = scan.nextLine();
            cmd.trim();
            if(cmd.equals("add")){
                String task = scan.nextLine();
                this.list.add(task);
            }
            if (cmd.equals("list")) {
            this.list.print();
            }
            if (cmd.equals("remove")) {
                System.out.println("Which one is removed? ");
                int i =  scan.nextInt();
                this.list.remove(i); 
            }
            if (cmd.equals("stop")) {
                break;
                
            }
            
        }

    }

}