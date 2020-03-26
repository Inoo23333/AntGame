
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class SettingBox extends JPanel implements ActionListener {
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

    public SettingBox()
    {
        this.setSize(650,100);
        this.setBackground(Color.blue);

        incTimeLabel.setBounds(20,20,60,20);
        this.add(incTimeLabel);
        incTimeTextField.setBounds(100,20,60,20);
        this.add(incTimeTextField);

        velocityLabel.setBounds(180,20,60,20);
        this.add(velocityLabel);
        velocityTextField.setBounds(260,20,60,20);
        this.add(velocityTextField);

        stickLengthLabel.setBounds(400,20,100,20);
        this.add(stickLengthLabel);
        stickLengthTextField.setBounds(520,20,60,20);
        this.add(stickLengthTextField);

        antNumLabel.setBounds(20,60,60,20);
        this.add(antNumLabel);
        antNumTextField.setBounds(100,60,60,20);
        this.add(antNumTextField);

        positionsLabel.setBounds(180,60,60,20);
        this.add(positionsLabel);
        positionsTextField.setBounds(260,60,120,20);
        this.add(positionsTextField);

        confirmButton.setBounds(500,60,80,30);
        confirmButton.addActionListener(this);
        this.add(confirmButton);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("34272");
        System.out.println(incTimeTextField.getText().trim());
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

    }
/*
    protected void paintComponent(Graphics g){//重写paintComponent方法以实现jPanel加背景
        super.paintComponent(g);
        try{
            ImageIcon image=new ImageIcon(getClass().getResource("src/image/SettingBox.png"));        //获取图像
            image.setImage(image.getImage().getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_FAST)); //调整图像的分辨率以适应容器
            image.paintIcon(this, g,0, 0);
        }catch(Exception ex) {
        }

    }

 */
}
