package Lock;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(@NotNull String name) {
        super(name);
    }

    static int ticket = 0;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        method();

    }

    private void method() {
        while (true){
            lock.lock();
                try {
                    if (ticket == 100) {
                        break;
                    }
                    else {
                        Thread.sleep(10);
                        ticket++;
                        System.out.println(getName()+"现在卖出的是"+ticket+"张票");
                    }
                    }
                catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                finally {
                        lock.unlock();
                    }
        }
    }
}
