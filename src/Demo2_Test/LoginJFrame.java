package Demo2_Test;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        JFrame loginframe = new JFrame();
        this.setSize(400,402);
        this.setTitle("界面 登录");
        // 位于顶部
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
