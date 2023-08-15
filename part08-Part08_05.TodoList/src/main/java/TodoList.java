import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> task;
    
    
    public TodoList(){
        this.task = new ArrayList<>();
       
    }
   /**
     * @return String return the task
     */
    public void remove(int n) {
        this.task.remove(n-1);
    }

    /**
     * @param task the task to set
     */
    public void add(String task) {
        this.task.add(task);
    }
    /**
     * @param task the task to print
     */
    public void print(){
        int i =1;
     for (String string : task) {
        
        System.out.println(i+": "+string);
        i++;
     }
    }

}