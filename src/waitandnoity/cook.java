package waitandnoity;

public class cook extends Thread{
    @Override
    public void run() {
        // 四步法  循环  同步代码块  共享数据是否到了末尾  共享数据核心处理
        while (true){
            synchronized (desk.lock){
                if (desk.count==0){
                    break;
                }
                else {
                    if (desk.flag==1){
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    else {
                        System.out.println("这里是厨师正在做饭，还能做"+desk.count+"碗");
                        desk.lock.notifyAll();
                        desk.flag=1;
                    }
                }
            }
        }

    }
}
