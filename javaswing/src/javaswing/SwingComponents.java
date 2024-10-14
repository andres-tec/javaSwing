package javaswing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



class MyFrame extends JFrame implements ActionListener
{
	JLabel l;
	JButton b; 
	int count =0; 
	MyFrame(){
		super("Swing Demo");
		setLayout(new FlowLayout());
		l= new JLabel("Clicked " + count + " Times" );
		b= new JButton("Clicked");
		b.addActionListener(this);
		getRootPane().setDefaultButton(b);
		add(l);
		add(b);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		l.setText("Clicked " + count + " Times" );
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
