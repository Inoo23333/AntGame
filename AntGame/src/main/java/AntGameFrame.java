import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AntGameFrame extends JFrame {
    private static final int WIDTH = 650;//界面的宽度
    private static final int HEIGHT = 600;//界面的高度

    float incTime;
    int antNum;
    List<OneAntRecord> arrayList;

    public void ShowAnt(float min,float max){
        AntGamePanel panel = new AntGamePanel(incTime,antNum,arrayList,min,max);//得到面板对象
        Thread t = new Thread(panel);//启动面板的动画线程
        t.start();
        this.add(panel);//将面板加载到Frame主窗口里
    }

    public AntGameFrame(float incTime,int antNum,List<OneAntRecord> arrayList)
    {
        this.incTime=incTime;
        this.antNum=antNum;
        this.arrayList=arrayList;
        this.setSize(WIDTH, HEIGHT);//设置GUI界面的宽高
        this.setTitle("AntGame");//设置标题
        this.setResizable(false);//设置窗口大小不可改变
        this.setLocationRelativeTo(null);//设置窗口位置居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认关闭操作
        this.setVisible(true);//设置窗口可见

    }
}
