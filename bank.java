class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "hii");
    }

}

public class bank {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        System.out.println("hello");
    }
}
// synchronize matalb ke baad ke thread ka run hona