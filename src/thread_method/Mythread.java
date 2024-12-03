package thread_method;

import org.jetbrains.annotations.NotNull;

public class Mythread extends Thread {
    public Mythread() {
    }

    public Mythread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+"@"+i);
        }

    }
}
