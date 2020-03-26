
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GameAnimation extends JPanel {
    ImageIcon stickImage =new ImageIcon(getClass().getResource("src/image/Stick.png"));//设置图片的来源路径（图片的URL）
    JLabel stickLabel = new JLabel();

    public GameAnimation()
    {
        stickImage.setImage(stickImage.getImage().getScaledInstance(100, 20, 100));//设置图片大小
        stickLabel.setIcon(stickImage);
        this.setSize(650,500);
        //this.setBackground(Color.yellow);

        this.add(stickLabel);
    }

    protected void paintComponent(Graphics g){//重写paintComponent方法以实现jPanel加背景
        super.paintComponent(g);
        ImageIcon image=new ImageIcon(getClass().getResource("src/image/Background.jpg"));        //获取图像
        image.setImage(image.getImage().getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_FAST)); //调整图像的分辨率以适应容器
        image.paintIcon(this, g,0, 0);
    }


}
