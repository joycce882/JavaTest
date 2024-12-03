package waitandnoity;

public class fooder extends Thread{

//    创建run操作 1 循环  2 同步代码块  3 共享数据是否到了末尾  4 共享数据核心部分
    @Override
    public void run() {
        while (true){
            synchronized (desk.lock){
                if (desk.count == 0) {
                    break;
                }
                else {
                    // 判断桌子上是否有面条 如果有 就开吃 没有就等待 吃完之后唤醒cook
                    if (desk.flag==0){
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    else {
                        //吃的总数-1
                        desk.count--;
                        System.out.println("吃货正在吃面条，还能吃"+desk.count+"碗");
                        // 吃完之后，唤醒cook
                        desk.lock.notifyAll();

                        desk.flag = 0;
                    }
                }

            }
        }

    }
}
