package Demo2_Test;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        // 初始化界面
        initJframe();
        // 初始化菜单
        initJmeanBar();
        // 设置显示
        this.setVisible(true);

    }

    private void initJmeanBar() {
        // 初始化菜单
        JMenuBar jMenuBar = new JMenuBar();
        // 创建菜单上面两个可以选择的对象
        JMenu functionmenu = new JMenu("功能");
        JMenu aboutmenu = new JMenu("其他");
        // 创建选项下面的条目
        JMenuItem replaygame = new JMenuItem("重新游戏");
        JMenuItem reloginItem = new JMenuItem("重新登陆");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem otherItem = new JMenuItem("其他功能待开发...");
        // 功能菜单添加条例
        functionmenu.add(reloginItem);
        functionmenu.add(reloginItem);
        functionmenu.add(closeItem);

        // 添加条例
        aboutmenu.add(otherItem);

        jMenuBar.add(functionmenu);
        jMenuBar.add(aboutmenu);

        // 给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJframe() {
        this.setSize(500,520);
        // 标题
        this.setTitle("拼图v1.0");
        // 位于顶部
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
