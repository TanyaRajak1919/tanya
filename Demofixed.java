class WithdrawThread extends Thread {
    static int balance = 1000;
    int amount;

    WithdrawThread(int amount) {
        this.amount = amount;
    }

    public void run() {
        synchronized (WithdrawThread.class) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                balance -= amount;
                System.out.println(
                        Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
            }
        }
    }
}

public class Demofixed {
    public static void main(String[] args) {
        WithdrawThread t1 = new WithdrawThread(800);
        WithdrawThread t2 = new WithdrawThread(500);

        t1.start();
        t2.start();
    }
}
