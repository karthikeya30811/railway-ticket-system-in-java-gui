/// login page like a IRTC in GUI
package Ticket;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class UserLogin extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1,b2;
	
	UserLogin(){
		this.setVisible(true);
		this.setTitle("ICRTC LOGIN");
		Container con=getContentPane();
		con.setLayout(new GridLayout(4,2));  
		l1=new JLabel("Enter Name",JLabel.CENTER);
		t1=new JTextField(30);		
		
		l4=new JLabel("Phone Number",JLabel.CENTER);
		t4=new JTextField(30);
		l5=new JLabel("Email",JLabel.CENTER);
		t5=new JTextField(40);
		
		b1=new JButton("Login");
		b2=new JButton("Clear");
		con.add(l1);
		con.add(t1);
		
		con.add(l4);
		con.add(t4);
		con.add(l5);
		con.add(t5);
		
		con.add(b1);
		con.add(b2);
		con.setBackground(Color.orange);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			this.setVisible(false);
			try
			{
				
				String name=t1.getText();
				
				String pnum=t4.getText();
				String ema=t5.getText();

				
				FileWriter fw=new FileWriter("Login.txt",true);
				System.out.println("Name :"+name+"\tMobile Number :"+pnum+"\tEmail:"+ema);
fw.write("Name :"+name+"\tMobile Number :"+pnum+"\tEmail:"+ema+"\t");
fw.close();
Login a=new Login(name);
a.setVisible(true);
a.setSize(700,600);
			}
			
			catch(IOException ie)
			{
				System.out.println(ie.getMessage());
			}
		}
		else if(ae.getSource()==b2)
		{
			t1.setText(null);
	
			t4.setText(null);
			t5.setText(null);
			t6.setText(null);
		}
	}

	
	
	public static void main(String[] args) {
UserLogin U=new UserLogin();
U.setSize(500, 500);
		
	}

}