import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class OrderAndRecord1 implements ActionListener
{	
	double price,total;
	double count;
	JFrame f;
	JButton order,record,clear,half1,half2,half3,half4,full2,full1,full3,full4,cheese,grill,normal,small,med,large,norm,panner,back;
	JButton submit;
	JPanel mainpagePanel,secondpagePanel,p,p1,p2;
	JLabel title,amount,qty;
	JLabel momos,chowmien,chole_bhature,tea,coffee,pizza,burger,uttpam,rolls;
	JTextArea jtext,textfield;
	JScrollPane scroll;
	JTextField t1;
	FileOutputStream fout,fout1;
	FileInputStream fin;
	File file;

	OrderAndRecord1()
	{
		f=new JFrame("Kadimi's");
		file=new File("record.txt");
		mainpagePanel=new JPanel();
		secondpagePanel=new JPanel(new GridLayout(3,1));
		p=new JPanel();
		p1=new JPanel();
		p2=new JPanel();
		textfield=new JTextArea(2,15);
		textfield.setEditable(false);
		amount=new JLabel("Total Amount :");
		submit=new JButton("SUBMIT");
		back=new JButton("BACK");
		t1=new JTextField();
		amount.setBounds(130,80,150,20);
		textfield.setBounds(300,80,120,20);
		submit.setBounds(160,130,100,30);
		back.setBounds(290,130,100,30);
		t1.setBounds(350,20,100,20);
		p2.setLayout(new FlowLayout());
		title=new JLabel("CUSTOMER RECIEPT");
		jtext=new JTextArea(10,49);
		jtext.setEditable(false);
		jtext.setText("ITEM"+"\t     "+"   QUANTITY"+"  "+"  AMOUNT"+"   "+"  TOTAL");
		jtext.setFont(new Font("Courier", Font.BOLD, 15));
		jtext.append("\n\n");
		scroll=new JScrollPane(jtext);
		order=new JButton("PLACE AN ORDER");
		record=new JButton("REVIEW RECORDS");
		clear=new JButton("CLEAR RECORDS");
		half1=new JButton("H");
		full1=new JButton("F");
		half2=new JButton("H");
		full2=new JButton("F");
		half3=new JButton("H");
		full3=new JButton("F");
		half4=new JButton("H");
		full4=new JButton("F");
		cheese=new JButton("C");
		grill=new JButton("G");
		normal=new JButton("N");
		small=new JButton("S");
		med=new JButton("M");
		large=new JButton("L");
		norm=new JButton("VEG");
		panner=new JButton("Paneer");
		momos=new JLabel("MOMOS");
		chowmien=new JLabel("Chowmien");
		chole_bhature=new JLabel("Chole Bhature");
		tea=new JLabel("Tea");
		coffee=new JLabel("Coffee");
		pizza=new JLabel("Pizza");
		burger=new JLabel("Burger");
		uttpam=new JLabel("Uttapam");
		rolls=new JLabel("Rolls");
		qty=new JLabel("Quantity");
		qty.setBounds(260,20,80,20);
		order.setBounds(150,100,180,80);
		order.setFont(new Font("Courier",Font.PLAIN,15));
		record.setBounds(150,250,180,80);
		record.setFont(new Font("Courier",Font.PLAIN,15));
		clear.setBounds(150,400,180,80);
		clear.setFont(new Font("Courier",Font.PLAIN,15));
		order.addActionListener(this);
		record.addActionListener(this);
		clear.addActionListener(this);
		mainpagePanel.add(order);
		mainpagePanel.add(record);
		mainpagePanel.add(clear);

		p.setLayout(null);
		p1.setLayout(null);
		p2.add(title);
		secondpagePanel.add(p1);
		secondpagePanel.add(p);
		secondpagePanel.add(p2);
		p2.add(scroll);
		p1.add(momos);
		momos.setBounds(20,0,80,50); 
		p1.add(chowmien);   
		chowmien.setBounds(20,50,100,10);
		p1.add(burger);      
		burger.setBounds(20,60,100,50);
		p1.add(pizza);       
		pizza.setBounds(20,70,100,90);
		p1.add(rolls);       
		rolls.setBounds(20,80,100,130);
		p1.add(chole_bhature);     
		chole_bhature.setBounds(20,90,150,170);
		p1.add(uttpam);      
		uttpam.setBounds(20,100,100,210);
		p1.add(tea);         
		tea.setBounds(20,110,100,270);
		p1.add(coffee);      
		coffee.setBounds(20,120,100,290);

		p1.add(half1);
		half1.setBounds(100,20,50,20);
		p1.add(full1);
		full1.setBounds(160,20,50,20);
		p1.add(half2);
		half2.setBounds(100,45,50,20);
		p1.add(full2);
		full2.setBounds(160,45,50,20);
	
		p1.add(normal);     normal.setBounds(100,75,50,20);
		p1.add(grill);      grill.setBounds(160,75,50,20);
		p1.add(cheese);     cheese.setBounds(220,75,50,20);
		p1.add(small);      small.setBounds(100,105,50,20);
		p1.add(med);        med.setBounds(160,105,50,20);
		p1.add(large);      large.setBounds(220,105,50,20);
		p1.add(norm);       norm.setBounds(100,135,90,20);
		p1.add(panner);     panner.setBounds(200,135,90,20);
		p1.add(half3);		half3.setBounds(130,165,50,20);
		p1.add(full3);		full3.setBounds(200,165,50,20);
		p1.add(half4);		half4.setBounds(100,195,50,20);
		p1.add(full4);		full4.setBounds(170,195,50,20);
		p1.add(t1);
		p1.add(qty);

		half1.addActionListener(this);
		full1.addActionListener(this);
		half2.addActionListener(this);
		full2.addActionListener(this);
		normal.addActionListener(this);
		grill.addActionListener(this);
		cheese.addActionListener(this);
		small.addActionListener(this);
		med.addActionListener(this);
		large.addActionListener(this);
		norm.addActionListener(this);
		panner.addActionListener(this);
		half3.addActionListener(this);
		full3.addActionListener(this);
		half4.addActionListener(this);
		full4.addActionListener(this);
	
		p.add(amount);
		p.add(textfield);
		p.add(submit);
		p.add(back);
		submit.addActionListener(this);
		back.addActionListener(this);

		f.setContentPane(mainpagePanel);
		f.setSize(550,700);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==order)
		{	
			f.setTitle("Kadimi's- MENU");
				f.remove(mainpagePanel);
				f.setContentPane(secondpagePanel);
		}
		f.validate();

		if(e.getSource()==record)
		{
			if (Desktop.isDesktopSupported())
				try
				{
					Desktop.getDesktop().open(file);
					
				}
			catch(Exception e2)
			{
				System.out.println(e2);
			}	
		}

		if(e.getSource()==clear)
		{
			try
			{
				
				fout1=new FileOutputStream(file);
				String s4=" ";
				byte b3[]=s4.getBytes();
				fout1.write(b3);
			}
			catch(Exception e4)
			{
				System.out.println(e4);
			}
			JOptionPane.showMessageDialog(f,"You'r records have been cleared");
		}

		if(e.getSource()==half1)
		{
			count=Double.parseDouble(t1.getText());
			price=50*count;
			total+=price;
			jtext.append("Momos"+"\t   "+count+" Half Plate"+"   "+price+"\t"+total);
			jtext.append("\n");
			textfield.setText(""+total);
			t1.setText("");
		}
		if(e.getSource()==full1)
		{
			count=Double.parseDouble(t1.getText());
			price=100*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Momos"+"\t   "+count+" Full Plate"+"   "+price+"\t"+total);
			jtext.append("\n");
			t1.setText("");
		}
		if(e.getSource()==half2)
		{
			count=Double.parseDouble(t1.getText());
			price=70*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Chowmien"+"   "+count+" Half Plate"+"\t"+price+"\t"+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==full2)
		{
			count=Double.parseDouble(t1.getText());
			price=130*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Chowmien"+"   "+count+" Full Plate"+"\t"+price+"\t"+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==normal)
		{
			count=Double.parseDouble(t1.getText());
			price=55*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Normal Burger"+"\t "+count+"\t   "+price+"\t  "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==grill)
		{
			count=Double.parseDouble(t1.getText());
			price=80*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Grill Burger"+"\t "+count+"\t   "+price+"\t  "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==cheese)
		{
			count=Double.parseDouble(t1.getText());
			price=120*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Normal Burger"+"\t "+count+"\t   "+price+"\t  "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==small)
		{
			count=Double.parseDouble(t1.getText());
			price=120*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Small Pizza"+"\t "+count+"\t   "+price+"\t  "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==med)
		{
			count=Double.parseDouble(t1.getText());
			price=200*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Medium Pizza"+"\t "+count+"\t   "+price+"\t  "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==large)
		{
			count=Double.parseDouble(t1.getText());
			price=290*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Large Pizza"+"\t "+count+"\t   "+price+"\t   "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==norm)
		{
			count=Double.parseDouble(t1.getText());
			price=80*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Veg Roll"+"\t "+count+"\t    "+price+"\t   "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==panner)
		{
			count=Double.parseDouble(t1.getText());
			price=170*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Paneer Roll"+"\t "+count+"\t  "+price+"\t   "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==half3)
		{
			count=Double.parseDouble(t1.getText());
			price=40*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Chole Bhature"+"   "+count+"Half Plate"+"   "+price+"     "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==full3)
		{
			count=Double.parseDouble(t1.getText());
			price=70*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Chole Bhature"+"   "+count+"Full Plate"+"   "+price+"     "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==half4)
		{
			count=Double.parseDouble(t1.getText());
			price=70*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Uttapam"+"\t\t"+count+"Half Plate"+"   "+price+"     "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==full4)
		{
			count=Double.parseDouble(t1.getText());
			price=140*count;
			total+=price;
			textfield.setText(""+total);
			jtext.append("Uttapam"+"\t\t"+count+"Full Plate"+"   "+price+"     "+total);
			jtext.append("\n");
			t1.setText("");
		}

		if(e.getSource()==submit)
		{
			count=0;
			price=0;
			total=0;
			try
			{
				fout=new FileOutputStream(file,true);
				byte b[]=jtext.getText().getBytes();
				fout.write(b);
				String x=" \n\n";
				byte b1[]=x.getBytes();
				fout.write(b1);
				fout.close();
			}
			catch(Exception a)
			{
				System.out.println(a);
			}

			textfield.setText("");
			jtext.setText("ITEM"+"\t     "+"QUANTITY"+"\t"+"AMOUNT"+"\t   "+"TOTAL");
			jtext.append("\n\n");
		}

		if(e.getSource()==back)
		{
			count=0;
			price=0;
			total=0;
			textfield.setText("");
			jtext.setText("ITEM"+"\t     "+"QUANTITY"+"\t"+"AMOUNT"+"\t   "+"TOTAL");
			jtext.append("\n\n");
			f.setTitle("KAdimi's");
			f.remove(secondpagePanel);
			f.setContentPane(mainpagePanel);
		}
		f.validate();
		
	}
}		
	
