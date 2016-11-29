package proj_hangman;

import java.util.Scanner;

public class Run {

	private Scanner scanner = new Scanner(System.in);

	private int num;

	private String[] words = { "apple", "potato", "people" };
	private String gameWord, c;

	private char[] charWord;
	private char[] correctWord;
	private int correct;

	// private Random random = new Random();

	public void menu() {
		int num;
		System.out.println("���ӽ��� : 1, ���� : 2");
		num = scanner.nextInt();

		switch (num) {
		case 1:
			gameStart();
			break;
		case 2:
			gameEnd();
			break;
		default:
			System.out.println("���� �ٽ� �Է�");
			menu();
		}
	}

	private void gameStart() {
		// num = random.nextInt(words.length);
		num = (int) (Math.random() * words.length);
		gameWord = words[num];
		correctWord = new char[gameWord.length()]; // �ʱ�ȭ
		// charWord = new char[gameWord.length()];
		correct = 0;
		charWord = gameWord.toCharArray();
		int i;
		for (i = 0; i < gameWord.length(); i++) {
			correctWord[i] = '_';
			// charWord[i] = gameWord.charAt(i);
			if (i == gameWord.length() - 1)
				System.out.print(correctWord[i]);
			else
				System.out.print(correctWord[i] + " ");
		}
		System.out.println();

		game();
	}

	private void game() {
		System.out.print("���ĺ� �Է�>>");

		c = scanner.next();
		for (int i = 0; i < gameWord.length(); i++) {
			if (c.charAt(0) == charWord[i]) {
				correctWord[i] = c.charAt(0);
				correct++;
			}
			if (i == gameWord.length() - 1)
				System.out.print(correctWord[i]);
			else
				System.out.print(correctWord[i] + " ");
		}
		System.out.println();
		if (correct == gameWord.length()) {
			System.out.print("�ٽ��ҷ���? (y/n)>>");
			boolean j = scanner.nextBoolean();
			if (j == true)
				gameStart();
			else
				gameEnd();
		} else
			game();
	}

	private void gameEnd() {
		System.out.println("���� ����!");
	}
}