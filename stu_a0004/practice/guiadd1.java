import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JTextField;

class guiadd1
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
JButton b;
JLabel l;

public add()
{
t1=new JTextField(10);
t2=new JTextField(10);
b=new JButton("Add");
l=new JLabel("output");

add(t1);
add(t2);
add(b);
add(l);


b.addActionListener(this);

setLayout(new FlowLayout());
setVisible(true);
setSize(500,500);
setDefaultCloseOperation(3);
}

public void actionPerformed(ActionEvent ae)
{
int num1=Integer.parseInt(t1.getText());
int num2=Integer.parseInt(t2.getText());

int ut=num1+num2;

l.setText(ut+ "");
}
}
