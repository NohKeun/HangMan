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
		System.out.println("���ӽ��� : 1, ���� : 2");
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
		//���߿� ����
		System.out.println("���� ����!");
	}
	
	private void error() {
		
		System.out.println("����");
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
