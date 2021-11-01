import java.util.ArrayList;
import java.util.Scanner;

public class PrintAddBook {

	private ArrayList<Person> addBook;

	public PrintAddBook() {
		addBook = new ArrayList<Person>();
	}

	public void addPerson(Scanner s) {
		System.out.printf("\n등록할 사람의 이름을 입력해주세요: \n");
		String person = s.next();

		System.out.printf("등록할 사람의 전화번호를 입력해주세요: \n");
		String phone = s.next();

		System.out.printf("등록할 사람의 주소를 입력해주세요: \n");
		String address = s.next();

		addBook.add(new Person(person, phone, address));
		System.out.printf("%s님이 주소록에 등록되었습니다.\n\n", person);

	}

	public void display() {
		if (addBook.isEmpty()) {
			System.out.printf("등록된 주소가 없습니다. \n\n");
			return;
		}

		System.out.printf("\n현재 등록된 주소록은 아래와 같습니다.\n");
		System.out.printf("+------------------------------+\n");

		for (int i = 0; i < addBook.size(); i++) {
			Person person = addBook.get(i);
			System.out.printf((i + 1) + " >  ");
			person.showPersonInfo();
		}
	}

	public void search(Scanner s) {
		if (addBook.isEmpty()) {
			System.out.printf("등록된 주소가 없습니다. \n\n");
			return;
		}
		System.out.printf("검색할 사람의 이름을 입력해주세요: \n");
		String cmd = s.next();

		for (int i = 0; i < addBook.size(); i++) {
			Person person = addBook.get(i);
			if (person.getPersonName().equals(cmd)) {
				System.out.printf("\n%s님을 찾았습니다.\n\n", cmd);
				System.out.printf("이름: %s \n전화번호: %s\n주소: %s\n", person.getPersonName(), person.getPhoneNumber(),
						person.getAddress());
				return;
			}
			if (i == (addBook.size() - 1) && !person.getPersonName().equals(cmd)) {
				System.out.printf("\n%s님을 찾지 못했습니다.\n\n", cmd);
			}
		}

	}

	public void delete(Scanner s) {
		if (addBook.isEmpty()) {
			System.out.printf("등록된 주소가 없습니다. \n\n");
			return;
		}
		System.out.printf("삭제할 사람의 이름을 입력해주세요: \n");
		String cmd = s.next();

		for (int i = 0; i < addBook.size(); i++) {
			Person person = addBook.get(i);
			if (person.getPersonName().equals(cmd)) {
				addBook.remove(i);
				System.out.printf("\n%s님의 주소가 삭제되었습니다.\n\n", cmd);
				return;
			}
			if (i == (addBook.size() - 1) && !person.getPersonName().equals(cmd)) {
				System.out.printf("\n%s님을 찾지 못했습니다.\n\n", cmd);
			}
		}
	}

}
