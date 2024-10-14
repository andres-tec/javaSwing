package javaswing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.Date;
import java.util.Locale;

import javax.swing.*;
import javax.swing.text.*;



class MyFrame extends JFrame
{

	MyFrame(){
		JTextField tf1= new JTextField(14);
		DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
		JFormattedTextField tf2 = new JFormattedTextField(df);
		tf2.setColumns(15);
		tf2.setValue(new Date());
		
//		NumberFormat nf = NumberFormat.getInstance();
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormatter nft= new NumberFormatter(nf);
		nft.setAllowsInvalid(false);
//		nft.setMaximum(20);
		JFormattedTextField tf3 = new JFormattedTextField(nft);
		tf3.setColumns(15);
		tf3.setValue(20);  
		setLayout(new FlowLayout());
		
		JTextArea txtArea= new JTextArea(20,30);
		
		add(tf1);
		add(tf2);
		add(tf3);
		add(txtArea);
		
	}
}

public class SwingComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		MyFrame f = new MyFrame();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
