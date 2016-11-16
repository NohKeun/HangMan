package proj_hangman;

import java.util.Random;
import java.util.Scanner;

public class Run {

	private Scanner scanner = new Scanner(System.in);
	
	private Run run;
	
	private String[] words= {"apple", "potato", "people"};	
	private String gameWord;
	
	private Random random = new Random();
	
	
	public void menu() {
		int num;
		System.out.println("게임시작 : 1, 종료 : 2");
		num = scanner.nextInt();

		switch(num) {
		case 1:
			gameStart();
			break;
		case 2:
			gameEnd();
			break;	
		}
	}
	
	private void gameStart() {
		gameRun();
	}
	
	private void gameEnd() {
		//나중에 구현
		System.out.println("게임 종료!");
	}
	
	private void error() {
		
		System.out.println("에러");
	}
	
	private void gameRun() {
		int num = random.nextInt(words.length);
		
		gameWord = words[num];
		
		System.out.println(gameWord);
		
		for(int i = 0; i<words[num].length(); i++) {
			System.out.print("_ ");
		}
	}
	
}
