
	import java.awt.GridLayout;
	import java.awt.event.WindowAdapter;
	import java.awt.event.WindowEvent;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JFrame;
	import javax.swing.ImageIcon;
	import javax.swing.UIManager;
	import javax.swing.SwingUtilities;
	 
	public class Label extends JPanel {
		private static int HOUR_OF_DAY;

		
	    public Label() {
	        super(new GridLayout(3,1));  //3 rows, 1 column
	        JLabel label1, label2, label3;
	 
	        //ImageIcon icon = createImageIcon("images/middle.gif","a pretty but meaningless splat");
	 
	        //Create the first label.
	        label1 = new JLabel("Image and Text", JLabel.CENTER);
	        label1.setVerticalTextPosition(JLabel.BOTTOM);
	        label1.setHorizontalTextPosition(JLabel.CENTER);
	 
	        //Create the other labels.
	        label2 = new JLabel(HOUR_OF_DAY);
	        label3 = new JLabel();
	 	 
	        //Add the labels.
	        add(label1);
	        add(label2);
	        add(label3);
	    }
	 
	    protected static ImageIcon createImageIcon(String path,
	                                               String description) {
	        java.net.URL imgURL = Label.class.getResource(path);
	        if (imgURL != null) {
	            return new ImageIcon(imgURL, description);
	        } else {
	            System.err.println("Couldn't find file: " + path);
	            return null;
	        }
	    }
	 
	    /**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event dispatch thread.
	     */
	    private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("LabelDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Add content to the window.
	        frame.add(new Label());
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }
	 
	    public static void main(String[] args) {
	        //Schedule a job for the event dispatch thread:
	        //creating and showing this application's GUI.
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	        //Turn off metal's use of bold fonts
	            UIManager.put("swing.boldMetal", Boolean.FALSE);
	                 
	        createAndShowGUI();
	            }
	        });
	    }
	}


