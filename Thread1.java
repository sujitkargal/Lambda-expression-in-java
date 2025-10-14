
public class Thread1 {
    public static void main(String[] a){
        // Using lambda expression to implement Runnable
        Runnable task=()->{
            System.out.println("Task is running in a thread");
        };

        Thread tr = new Thread(task);
        tr.start();
    }
}

