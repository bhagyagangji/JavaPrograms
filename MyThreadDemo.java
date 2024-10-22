public class MyThreadDemo {
    public static void main(String[] args) {
        System.out.println("In main thread");

        MyThread t1 = new MyThread("other");
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main-"+i);
        }
        System.out.println("End of main");
    }
}
