package methods;

public class MethodChallenge {

	public static void main(String[] args) {
	
		calculatedScore();
	}
	
	public static void calculatedScore() {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;


	int finalScore = score;
	if(gameOver == true) {
		finalScore +=(levelCompleted * bonus);
		System.out.println("Your Final score was " + finalScore);
	}
	
	}

}
