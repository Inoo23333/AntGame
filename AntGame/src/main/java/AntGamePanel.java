import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class AntGamePanel extends JPanel implements ActionListener,Runnable {
    static int k = 0;//表示当前画到第几组数据 antNum个蚂蚁前进一次的数据算一组

    int x[];
    int y = 250;//蚂蚁的高度

    float incTime;
    int antNum;
    List<OneAntRecord> arrayList;

    //private int incTime;
    private int velocity;
    private int stickLength;
    //private int antNum;
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
    Label minTimeLabel = new Label("MinTime");
    TextField minTimeTextField = new TextField();
    Label maxTimeLabel = new Label("MaxTime");
    TextField maxTimeTextField = new TextField();

    Image stickIm = new ImageIcon("src/image/Stick.png").getImage();
    ImageIcon stickImage = new ImageIcon("src/image/Stick.png");
    JLabel stickLabel = new JLabel(stickImage);

    Button confirmButton = new Button("Start");

    Image bg;

    public AntGamePanel(float incTime, int antNum, List<OneAntRecord> arrayList,float min,float max) {
        this.incTime = incTime;
        this.antNum = antNum;
        this.arrayList = arrayList;

        x = new int[antNum];
        for (int i = 0; i < antNum; i++)
            x[i] = (int) arrayList.get(i).position + 155;

        //setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        //this.setBackground(Color.yellow);
        this.setSize(650, 600);

        incTimeLabel.setBounds(20, 20, 60, 20);
        this.add(incTimeLabel);
        incTimeTextField.setBounds(100, 20, 60, 20);
        this.add(incTimeTextField);
        incTimeTextField.setText("1.0");

        velocityLabel.setBounds(180, 20, 60, 20);
        this.add(velocityLabel);
        velocityTextField.setBounds(260, 20, 60, 20);
        this.add(velocityTextField);
        velocityTextField.setText("5");

        stickLengthLabel.setBounds(400, 20, 100, 20);
        this.add(stickLengthLabel);
        stickLengthTextField.setBounds(520, 20, 60, 20);
        this.add(stickLengthTextField);
        stickLengthTextField.setText("300");

        antNumLabel.setBounds(20, 60, 60, 20);
        this.add(antNumLabel);
        antNumTextField.setBounds(100, 60, 60, 20);
        this.add(antNumTextField);
        antNumTextField.setText("5");

        positionsLabel.setBounds(180, 60, 60, 20);
        this.add(positionsLabel);
        positionsTextField.setBounds(260, 60, 200, 20);
        this.add(positionsTextField);
        positionsTextField.setText("30,80,110,160,250");

        confirmButton.setBounds(500, 60, 80, 30);
        confirmButton.addActionListener(this);
        this.add(confirmButton);

        stickLabel.setBounds(155, 300, 340, 40);
        this.add(stickLabel);

        minTimeLabel.setBounds(100,450,60,20);
        this.add(minTimeLabel);
        minTimeTextField.setBounds(200,450,60,20);
        this.add(minTimeTextField);
        minTimeTextField.setText(Float.toString(min));

        maxTimeLabel.setBounds(400,450,60,20);
        this.add(maxTimeLabel);
        maxTimeTextField.setBounds(500,450,60,20);
        this.add(maxTimeTextField);
        maxTimeTextField.setText(Float.toString(max));
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            incTime = Float.parseFloat(incTimeTextField.getText().trim());
        } catch (Exception ex) {
        }
        try {
            velocity = Integer.parseInt(velocityTextField.getText().trim());
        } catch (Exception ex) {
        }
        try {
            stickLength = Integer.parseInt(stickLengthTextField.getText().trim());
        } catch (Exception ex) {
        }
        try {
            antNum = Integer.parseInt(antNumTextField.getText().trim());
        } catch (Exception ex) {
        }
        String positionString = positionsTextField.getText().trim();
        String[] tmp = positionString.split(",");
        positions = new float[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            try {
                positions[i] = Integer.valueOf(tmp[i]);
            } catch (Exception ex) {
            }
        }
        UserPanel.start(incTime,velocity,antNum,positions,stickLength);
        this.repaint();

    }

    Image antIm = new ImageIcon("src/image/Ant.jpg").getImage();

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        this.setBackground(Color.orange);//设定背景颜色

        Image[] images = new Image[antNum];
        ImageIcon antIcon1;
        ImageIcon antIcon2;

        ImageIcon[] nums = new ImageIcon[5];

        antIcon1 = new ImageIcon("src/image/Ant.jpg");
        antIcon2 = new ImageIcon("src/image/Ant2.jpg");

        nums[0] = new ImageIcon("src/image/num1.png");
        nums[1] = new ImageIcon("src/image/num2.png");
        nums[2] = new ImageIcon("src/image/num3.png");
        nums[3] = new ImageIcon("src/image/num4.png");
        nums[4] = new ImageIcon("src/image/num5.png");

        for (int i = 0; i < antNum; i++) {
            if (arrayList.get(k * antNum + i).direction == Direction.left)//判断蚂蚁方向
                images[i] = antIcon1.getImage();
            else
                images[i] = antIcon2.getImage();
            g.drawImage(images[i], x[i] + 155, y, 40, 50, null);
            g.drawImage(nums[i].getImage(),x[i] + 160,y-30,30,30,null);
        }

        paintComponents(g);

    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < x.length; i++)
                x[i] = (int) arrayList.get(k * antNum + i).position;
            try {
                Thread.sleep((int) incTime * 100);//暂停incTime*100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            k++;
            repaint();//重新开始
        }
    }

}