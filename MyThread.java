public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run(){
        System.out.println("In the thread -- " + getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"-"+i);   
        }
    }
    
}