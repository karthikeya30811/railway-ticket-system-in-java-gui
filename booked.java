// here you can check the booked the details and you must create a one notepad to store the booked details
package Ticket;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Booked extends JFrame{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;

Booked(String Name,String Age,String Source,String Destination,String NameofTrain,String BerthNumber,String Coach,String BerthType,String TrainType,double TotalAmount )
{
 setVisible(true);{
	 l1=new JLabel( "Customer Name  : " + Name);
		l2=new JLabel("Customer age : "+Age);
		l4=new JLabel("Source       : "+Source);
		l5=new JLabel("Destination  : "+ Destination);
		l6=new JLabel("Name of Train: "+NameofTrain);
		l7=new JLabel("BerthNumber  : "+ BerthNumber);
		l8=new JLabel("Type of Coach: "+Coach);
		l9=new JLabel("BerthType    : "+BerthType);
		l10=new JLabel(" Train Type:  "+TrainType);
		l11=new JLabel("Total Amount : "+TotalAmount);
		Container con=getContentPane();
		con.setLayout(new GridLayout(11,6));
		con.setBackground(Color.ORANGE);
		con.add(l1);
		con.add(l2);
		con.add(l4);
		con.add(l5);
		con.add(l6);
		con.add(l7);
		con.add(l8);
		con.add(l9);
		con.add(l10);
		con.add(l11);
;		pack();
		
 }
	
	
	

	
	
	
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}







