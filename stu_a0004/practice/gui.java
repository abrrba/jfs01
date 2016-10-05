import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.GridLayout;
public class gui
{
public static void main(String[] args)
{
Abc obj=new Abc();
obj.setVisible(true);
obj.setSize(500,500);

}
}

class Abc extends JFrame
{
public Abc()
{
JLabel l=new JLabel("abhijeet GIte");
JLabel l1=new JLabel("shruti");
add(l);
add(l1);
setLayout(new GridLayout());
setDefaultCloseOperation(3);//we can use 3 instead of JFrame.EXIT_ON_CLOSE
}
}

