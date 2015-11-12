
public class TicTacToe {


	public static void main(String[] args){
		GameView theView = new GameView();
		GameModel theModel = new GameModel();
		GameController theController = new GameController(theView,theModel);
		theView.setVisible(true); 
			
		
	}
}
