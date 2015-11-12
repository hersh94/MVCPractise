import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GameView extends JFrame {

	private JButton[] but;
	public GameView(){
		this.setLayout(new GridLayout(3,3));
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		but = new JButton[9];
		for(int i=0; i<9; i++){
			but[i] = new JButton("");
			but[i].setActionCommand("button"+i);
			this.add(but[i]);
			
		}

		
		
	}
	
	void addButtonListener(ActionListener buttonListener){
		for(int i=0; i<9;i++){
			but[i].addActionListener(buttonListener);
		}
	}
	public JButton[] getButtons(){
		return but;
	}
	public void getRekt(){
		JOptionPane.showMessageDialog(null, "getRekt");

	}
}