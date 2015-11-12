import javax.swing.JButton;

public class GameModel {
	private Boolean player1Wins = false;
	private Boolean player2Wins = false;
	private Boolean catsGame = false;
	private char[][] board = new char[3][3];
	int i=0;
	
	
	public GameModel(){
		while(player1Wins && player2Wins&&catsGame == false){
		}
	}
		
		
	
	
	public JButton[] getGameStatus(JButton[] buttons){
		return null;
	}
	
	public String getResult(){
		if( i%2 == 0){
			return "X";
		}else{
			return "O";
		}

	}
	public Boolean checkEnd(){
		i++;
		if(i>=9){
			return true;
		}
		return false;
	}
	public int checkWinner(){
		//logic for winning combinations
		return 0;
	}
}

