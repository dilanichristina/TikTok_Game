import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.*;

public class tiktok{
	
	static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	static int loc;
	int[][] array = new int[3][3];

	public static void main(String args[]) {
		createGraphic();
		
	}
	
	public static void createGraphic() {
		
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.setLayout(new GridLayout(3,3));	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1 = new JButton("");
		b2 = new JButton("");
		b3 = new JButton("");
		
		b4 = new JButton("");
		b5 = new JButton("");
		b6 = new JButton("");
		
		b7 = new JButton("");
		b8 = new JButton("");
		b9 = new JButton("");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		
		f.setVisible(true);
		
	
		b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	b1.setText("*");
            	loc = 1;
                
            }
        });
		
		b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	b2.setText("*");
            	
            	loc = 2;
            }
        });
		
		b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	b3.setText("*");
            	
            	loc = 3;
            }
        });
		
		b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	b4.setText("*");
            	
            	loc = 4;
            }
        });
		
		b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	b5.setText("*");
            	
            	loc = 5;
            }
        });
		
		b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	b6.setText("*");
            	
            	loc = 6;
            }
        });
		
		b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	b7.setText("*");
            	
            	loc = 7;
            }
        });
		
		b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	b8.setText("*");
            	
            	loc = 8;
            }
        });
		
		b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	b9.setText("*");
            	
            	loc = 9;
            }
        });
		
		
	}
}
