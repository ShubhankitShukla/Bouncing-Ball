import javax.swing.*;
import java.awt.*;

public class RECT {
    JFrame frame;
    RECT(){
        frame=new JFrame("Frame");
        Panel panel=new Panel(900,700);
        Container c=frame.getContentPane();
        c.setBackground(Color.blue);

       // panel.setBounds(0,0,50,50);
        panel.setBackground(Color.BLACK);
        c.add(panel);

        frame.setSize(900,700);
        frame.setVisible(true);
       // frame.setLayout(null);

    }
    public static void main(String arg[]){
        RECT object=new RECT();
    }
}
