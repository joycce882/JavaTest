package thread_method;

import org.jetbrains.annotations.NotNull;

public class Mytread2 extends Thread{

    public Mytread2() {
    }

    public Mytread2(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "x"+i);
        }
    }
}
