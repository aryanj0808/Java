

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class AssignmentNo08_Calculator_R34 extends JFrame implements ActionListener
{
JPanel p1,p2;
JTextField t1;
JButton b[]=new JButton[10];
JButton Add,Sub,Mul,Div,Eq,Clr;

int v1,v2,res;
char op;

 AssignmentNo08_Calculator_R34()
{
 p1=new JPanel();
 p2=new JPanel();

p1.setLayout(new GridLayout(1,1,5,5));
p2.setLayout(new GridLayout(4,4));

t1=new JTextField(50);

 for(int i=0;i<10;i++)
 {
  b[i]=new JButton(i+"");
 }

 Add=new JButton("+");
 Sub=new JButton("-");
 Mul=new JButton("*");
 Div=new JButton("/");
 Eq=new JButton("=");
 Clr=new JButton("Clr");

  p1.add(t1);

  for(int i=0;i<10;i++)
  {
   p2.add(b[i]);
  }

 p2.add(Add);
 p2.add(Sub);
 p2.add(Mul);
 p2.add(Div);
 p2.add(Eq);
 p2.add(Clr);

 for(int i=0;i<10;i++)
 {
  b[i].addActionListener(this);
 }
 
Add.addActionListener(this);
Sub.addActionListener(this);
Mul.addActionListener(this);
Div.addActionListener(this);
Eq.addActionListener(this);
Clr.addActionListener(this);

 this.setLayout(new BorderLayout(5,5));
 this.add(p1,BorderLayout.NORTH);
 this.add(p2,BorderLayout.CENTER);

 this.setTitle("Calculator");
 this.setSize(250,300);
 this.setVisible(true);
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent ae)
{
 String str=ae.getActionCommand();
 char ch=str.charAt(0);

 if(Character.isDigit(ch))
 {
   t1.setText(t1.getText()+str);
 }
 
 else
 {
   if(str.equals("+"))
   {
   v1=Integer.parseInt(t1.getText());
    op='+';
    t1.setText("");

   }

 
   if(str.equals("-"))
   {
    v1=Integer.parseInt(t1.getText());
    op='-';
    t1.setText("");

   }


   if(str.equals("*"))
   {
    v1=Integer.parseInt(t1.getText());
    op='*';
    t1.setText("");
   }

 if(str.equals("/"))
   {
    v1=Integer.parseInt(t1.getText());
    op='/';
    t1.setText("");
   }

 if(str.equals("="))
   {
    v2=Integer.parseInt(t1.getText());
    if(op=='+')
    {
      res=v1+v2;
    }

   if(op=='-')
    {
      res=v1-v2;
    }

  if(op=='*')
    {
      res=v1*v2;
    }

 if(op=='/')
    {
      res=v1/v2;
    }

  t1.setText(res+"");
   } 

 if(str.equals("Clr"))
  {
   t1.setText("");
  }

 }

}


public static void main(String[] args)
{
AssignmentNo08_Calculator_R34 obj=new AssignmentNo08_Calculator_R34();
 
 }
}