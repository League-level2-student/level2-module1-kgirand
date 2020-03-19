package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add name");
	JButton view = new JButton("View names");
	ArrayList<String> names = new ArrayList();
	public void run(){
	frame.add(panel);
	panel.add(add);
	panel.add(view);
	frame.pack();
	frame.setVisible(true);
	add.addActionListener(this);
	view.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource()==add) {
		String input = JOptionPane.showInputDialog("Enter any name");
		names.add(input);
	}
	if(e.getSource()==view) {
		System.out.println("view");
		String guestList = "";
		int guestNumber = 1;
		for(String s : names) {
			guestList+="Guest #" + guestNumber + ": " + s + "\n";
			guestNumber ++;
		}
		JOptionPane.showMessageDialog(null, guestList);
	}
	}
	

	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
