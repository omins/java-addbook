import java.util.Scanner;

public class Prompt {

	public void runPrompt() {
		System.out.printf("+------------+\n");
		System.out.printf("| 주  소  록 |\n");
		System.out.printf("+------------+\n");
		System.out.printf("|(1) 등   록 |\n");
		System.out.printf("|(2) 출   력 |\n");
		System.out.printf("|(3) 검   색 |\n");
		System.out.printf("|(4) 삭   제 |\n");
		System.out.printf("|(q) 종   료 |\n");
		System.out.printf("+------------+\n");

		System.out.printf("\n원하는 작업을 입력하십시오. : ");
		Scanner s = new Scanner(System.in);
		PrintAddBook p = new PrintAddBook();

		while (true) {
			System.out.println("명령 : 1, 2, 3, 4, q");
			String cmd = s.next();
			switch (cmd) {
			case "1":
				p.addPerson(s);
				break;
			case "2":
				p.display();
				break;
			case "3":
				p.search(s);
				break;
			case "4":
				p.delete(s);
				break;
			case "q":
				break;
			}

			if (cmd.equals("q")) {
				System.out.printf("\n종료합니다.\n");
				break;
			}
		}

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
