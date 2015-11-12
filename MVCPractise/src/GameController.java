import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class GameController {
	private GameView gui;
	private GameModel gmod;
	
	
	
	public GameController(GameView gui, GameModel gmod){
		this.gui = gui;
		this.gmod = gmod;
		this.gui.addButtonListener(new buttonListener());
	}

	
	class buttonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s="";
			s = gmod.getResult();
			if(e.getActionCommand().matches("button0")){
				gui.getButtons()[0].setText("0");
				gui.getButtons()[0].setText(s);
				gui.getButtons()[0].setEnabled(false);
			}
			if(e.getActionCommand().matches("button1")){
				gui.getButtons()[1].setText(s);
				gui.getButtons()[1].setEnabled(false);
			}
			if(e.getActionCommand().matches("button2")){
				gui.getButtons()[2].setText(s);
				gui.getButtons()[2].setEnabled(false);
			}
			if(e.getActionCommand().matches("button3")){
				gui.getButtons()[3].setText(s);
				gui.getButtons()[3].setEnabled(false);
			}
			if(e.getActionCommand().matches("button4")){
				gui.getButtons()[4].setText(s);
				gui.getButtons()[4].setEnabled(false);
			}
			if(e.getActionCommand().matches("button5")){
				gui.getButtons()[5].setText(s);
				gui.getButtons()[5].setEnabled(false);
			}
			if(e.getActionCommand().matches("button6")){
				gui.getButtons()[6].setText(s);
				gui.getButtons()[6].setEnabled(false);
			}
			if(e.getActionCommand().matches("button7")){
				gui.getButtons()[7].setText(s);
				gui.getButtons()[7].setEnabled(false);
			}
			if(e.getActionCommand().matches("button8")){
				gui.getButtons()[8].setText(s);
				gui.getButtons()[8].setEnabled(false);
			}
			if(gmod.checkEnd()){
				gui.getRekt();
			}
		
		}
	}	
}
