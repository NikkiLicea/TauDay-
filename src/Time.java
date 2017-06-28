import javax.swing.JFrame;
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.SwingUtilities;

public class Time {
	//private static int HOUR_OF_DAY;
	
	public Time(){
//		super(new GridLayout(3,1));  //3 rows, 1 column
//        JLabel label1, label2, label3;
	}
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Clock");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JLabel emptyLabel = new JLabel("");
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    
   	//Create the first label.
	label1 = new JLabel("Image and Text",
	icon,
	JLabel.CENTER);
	//Set the position of its text, relative to its icon:
	label1.setVerticalTextPosition(JLabel.BOTTOM);
	label1.setHorizontalTextPosition(JLabel.CENTER);
	
	//Create the other labels.
	label2 = new JLabel("Text-Only Label");
	label3 = new JLabel(icon);
	
	//Create tool tips, for the heck of it.
	label1.setToolTipText("A label containing both image and text");
	label2.setToolTipText("A label containing only text");
	label3.setToolTipText("A label containing only an image");
	
	//Add the labels.
	add(label1);
	add(label2);
	add(label3);
	}

    
	}
}
	
