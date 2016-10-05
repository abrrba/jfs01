import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.*;
public class guiadd
{
public static void main(String args[])
{
add obj=new add();
}
}

class add extends JFrame implements ActionListener
{
JTextField t1;
JTextField t2;
JLabel l;
JButton b;
public add()
{
 t1=new JTextField(10);
 t2=new JTextField(10);
 l=new JLabel("output");
 b=new JButton("add");

b.addActionListener(this);

add(t1);
add(t2);
add(l);
add(b);

setLayout(new FlowLayout());
setVisible(true);
setSize(500,500);
setDefaultCloseOperation(3);
}
public void actionPerformed(ActionEvent ae)
{
int num1=Integer.parseInt(t1.getText());
int num2=Integer.parseInt(t2.getText());
int out=num1+num2;
l.setText(out +"");
}

}
