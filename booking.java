/// booking a ticket page in GUI
package Ticket;
import java.awt.*;

import java.awt.event.*;
import java.io.FileWriter;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
JTextField t1,t2,t3,t4,t5,t6,t7,t8;
String[] gender={"Select","Male","Female","Rather Not To Say"};

JButton b1,b2;
JComboBox a,b,c,d,e,f,g;
double bill=93;
Login(String name)
{
	l1=new JLabel("Name ",SwingConstants.CENTER);
	l2=new JLabel("Age",SwingConstants.CENTER);
	l3=new JLabel("Gender",SwingConstants.CENTER);
	l4=new JLabel("Source",SwingConstants.CENTER);
	l5=new JLabel("Destination",SwingConstants.CENTER);
	l6=new  JLabel("NameofTrain",SwingConstants.CENTER);
	l7=new JLabel(" BerthNumber",SwingConstants.CENTER);
	l8=new JLabel("Coach",SwingConstants.CENTER);
	l9=new JLabel("BerthType",SwingConstants.CENTER);
	l10=new JLabel("TrainType",SwingConstants.CENTER);
	l11=new JLabel("TotalAmount:",SwingConstants.CENTER);
	t1=new JTextField(30);
	t1.setText(name);
	t2=new JTextField(20);
	//t3=new JTextField(10);
	g=new JComboBox(gender);
	String [] Source= {"Select","Trupathi","Vizag","Dehil","Agra","Kashmir"};
	 b=new JComboBox(Source);
	//t4=new JTextField(30);
	//t5=new JTextField(30);
	
	String [] destiny= {"Select","VijayaWada","Hyderbad","Punjab","Chennai","Banglore"};
	 f=new JComboBox(destiny);
	 String [] train={"Select","vishakaExpress","Amaravathi Express","TirupathiExpress","Chennai Express","Banglore Express","DehliExpress","Punjab Express","Jammu & kashmir","Shimla",};
	 a=new JComboBox(train);
	//Integer [] Seat= { 1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
	//JcomboBox1=new JComboBox(Seat);
	 t6=new JTextField(50);
	 t7=new JTextField(100);
	String [] Coach= {"Select","AC Coach","non Ac Coach"};
	c=new JComboBox(Coach);
	String [] Bed= {"Select","Upper bed","Lower Bed"," East Upper Bed","East Lower Bed"," West upper Bed","West Lower Bed"};
	d=new JComboBox(Bed);
	String [] type= {"Select","Express","Super fast"};
	e=new JComboBox(type);
	b1=new JButton("PROCEED");
	b2=new JButton("CANCEL");
	setSize(800,500);
	setVisible(true);
	setTitle("IRCTC TICKET BOOKING");
	Container con=getContentPane();
	con.setLayout(new GridLayout(12,2));
	con.setBackground(Color.cyan);
	con.add(l1);
	con.add(t1);
	con.add(l2);
	con.add(t2);
	con.add(l3);
	con.add(g);
	con.add(l4);
	con.add(b);
	con.add(l5);
	con.add(f);
	//con.add(JComboBox1);
	//con.add(JComboBox);
	con.add(l6);
	con.add(a);
	con.add(l7);
	con.add(t6);
	con.add(l8);
	con.add(c);
	con.add(l9);
	con.add(d);
	con.add(l10);
	con.add(e);
	con.add(l11);
	con.add(t7);
	con.add(b1);
	con.add(b2);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	this.pack();		
	
}

public void actionPerformed(ActionEvent ae)
{
	try
	{
		if(ae.getSource()==b1)
		{
			
			bill=93;
				String name=t1.getText();
				String age=t2.getText();
				String Gender=g.getSelectedItem().toString();
				//String Gender=t3.getText();
				String StartingPoint=b.getSelectedItem().toString();
				String Destination=f.getSelectedItem().toString();
				String NAMETrain=a.getSelectedItem().toString();
				String seat=t6.getText();
				String Coach=c.getSelectedItem().toString();
				String Trian=d.getSelectedItem().toString();
				String type=e.getSelectedItem().toString();
				String amount = Double.toString(bill());
				t7.setText(amount);
				JOptionPane.showMessageDialog(b1,"you want to book a ticket ");
				FileWriter f=new FileWriter("D://project.txt",true);
				f.write(" NAME: "+ name +"  AGE: "+ age +"  Gender:  "+  Gender  +" Starting point: "+  StartingPoint  +"    Destination:  "+  Destination  +"   Name of Train: "+  NAMETrain  +"  Seat number: "+  seat  +"  Type of Coach: "+  Coach  +" Type of Bed: "+  Trian  +" Train type:  "+ type+" "+t7.getText());
				System.out.println("\t name: "+ name +"Age: "+ age +"  Gender:  "+ Gender +"  Source:  "+ StartingPoint +"   Destiontion:   "+Destination +"   Name of train: "+NAMETrain +"  Seat Number: "+seat +"    Coach:   "+Coach +"   Bed:  "+Trian +"   Train Type:  "+type+" Total amount:"+t7.getText() );
				f.close();
				Booked a=new Booked(name, age, StartingPoint, Destination, NAMETrain, seat, Coach, type, Trian, bill);
				a.setVisible(true);
				a.setSize(500,400);
		}
	
		if(ae.getSource()==b2)
		{
			t1.setText(" ");
			t2.setText(" ");
			g.setSelectedIndex(0);
			//t3.setText(null);
			b.setSelectedIndex(0);
		////	t4.setText(null);
			f.setSelectedIndex(0);
			//t5.setText(null);
			t6.setText(" ");
			a.setSelectedIndex(0);
			c.setSelectedIndex(0);
			d.setSelectedIndex(0);
			e.setSelectedIndex(0);
			t7.setText(" ");
		
			
		}
	}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}

}
public double bill()
{
	 if(c.getSelectedItem().equals("AC Coach"))
		bill=bill+75;
	 
	 if(e.getSelectedItem().equals("Super fast"))
		bill=bill+55;
	
	return bill;
}
public static void main(String args[])
{
	Login s=new Login("");
	s.setVisible(true);
	s.setSize(400,500);
}



}
