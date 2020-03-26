
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.*;

public class GameFrame extends JFrame {
    private static final int WIDTH = 650;//界面的宽度
    private static final int HEIGHT = 600;//界面的高度

    /*
        private int incTime;
        private int velocity;
        private int stickLength;
        private int antNum;
        private float[] positions;

        Label incTimeLabel = new Label("IncTime ");
        TextField incTimeTextField = new TextField();
        Label velocityLabel = new Label("Velocity");
        TextField velocityTextField = new TextField();
        Label stickLengthLabel = new Label("stickLength");
        TextField stickLengthTextField = new TextField();
        Label antNumLabel = new Label("AntNum");
        TextField antNumTextField = new TextField();
        Label positionsLabel = new Label("Positions");
        TextField positionsTextField = new TextField();

        Button confirmButton = new Button("Start");



     */
    //public static void main(String[] args)
    //{
    //    GameFrame gameStartPanel = new GameFrame();
    //}


    public GameFrame(){
        /*
            Container contentpane = this.getContentPane();
            ImageIcon bg = new ImageIcon("/Users/user/IdeaProjects/AntGame/src/image/Background.jpg");
            JLabel bgLabel = new JLabel(bg);
            bgLabel.setBounds(300, 300, 10, 10);

            contentpane.add(bgLabel);
            this.getLayeredPane().add(bgLabel, new Integer(Integer.MIN_VALUE));


         */
        this.setBackground(Color.yellow);
        this.setSize(WIDTH, HEIGHT);//设置GUI界面的宽高
        this.setTitle("AntGame");//设置标题
        this.setResizable(false);//设置窗口大小不可改变
        this.setLocationRelativeTo(null);//设置窗口位置居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认关闭操作
        this.setVisible(true);//设置窗口可见
        /*
            incTimeLabel.setBounds(20, 20, 60, 20);
            this.add(incTimeLabel);
            incTimeTextField.setBounds(100, 20, 60, 20);
            this.add(incTimeTextField);

            velocityLabel.setBounds(180, 20, 60, 20);
            this.add(velocityLabel);
            velocityTextField.setBounds(260, 20, 60, 20);
            this.add(velocityTextField);

            stickLengthLabel.setBounds(400, 20, 100, 20);
            this.add(stickLengthLabel);
            stickLengthTextField.setBounds(520, 20, 60, 20);
            this.add(stickLengthTextField);

            antNumLabel.setBounds(20, 60, 60, 20);
            this.add(antNumLabel);
            antNumTextField.setBounds(100, 60, 60, 20);
            this.add(antNumTextField);

            positionsLabel.setBounds(180, 60, 60, 20);
            this.add(positionsLabel);
            positionsTextField.setBounds(260, 60, 120, 20);
            this.add(positionsTextField);

            confirmButton.setBounds(500, 60, 80, 30);
            confirmButton.addActionListener(this);
            this.add(confirmButton);

         */

        }


/*
        SettingBox settingBox = new SettingBox();
        settingBox.setBounds(0,0,650,100);
        contentpane.add(settingBox);
        GameAnimation gameAnimation = new GameAnimation();
        gameAnimation.setBounds(0,100,650,500);
        contentpane.add(gameAnimation);

 */



    //@Override
    /*public void actionPerformed(ActionEvent e) {
        try{
            incTime=Integer.parseInt(incTimeTextField.getText().trim());
        }catch(Exception ex){
        }
        try{
            velocity = Integer.parseInt(velocityTextField.getText().trim());
        }catch(Exception ex) {
        }
        try{
            stickLength = Integer.parseInt(stickLengthTextField.getText().trim());
        }catch(Exception ex) {
        }
        try{
            antNum  =Integer.parseInt(antNumTextField.getText().trim());
        }catch(Exception ex) {
        }
        String positionString = positionsTextField.getText().trim();
        String[] tmp = positionString.split(",");
        positions = new float[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            try{
                positions[i] = Integer.valueOf(tmp[i]);
            }catch(Exception ex) {
            }
        }
        System.out.println(incTime);
        System.out.println(velocity);
        System.out.println(antNum);
        System.out.println(positions);
        System.out.println(stickLength);
        UserPanel.start(incTime,velocity,antNum,positions,stickLength);

        }


     */
}

