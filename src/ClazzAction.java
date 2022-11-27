
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClazzAction {
	public static StudentAction action = new StudentAction();
	public static ArrayList<Student> studentArrayList = new ArrayList<>();

	public Clazz inputClass(Scanner sc) {
		System.out.println("nhap môn học");
		String monHoc = sc.nextLine();
		System.out.println("Bạn muốn nhập bn student: ");
		String number = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(number); i++) {
			Student student = action.inputStudent(sc);
			studentArrayList.add(student);
		}
		return new Clazz(studentArrayList, monHoc);
	}

	public void themHocVien(Scanner sc) {
		Student std1 = action.inputStudent(sc);
		studentArrayList.add(std1);
		for (Student o : studentArrayList) {
			System.out.println(o.toString());

		}

	}

	public void capNhatLucHoc(Scanner sc) {
		System.out.println("Mời bạn nhập id muốn câp nhật lực học");
//		Scanner sc = new Scanner(System.in);
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Mời bạn nhập lực học muốn thay đổi");
		String lucHoc = sc.nextLine();
		int bienDem = 0;
		for (Student o : studentArrayList) {
			if (o.getId() == id) {
				o.setRank(lucHoc);
				bienDem++;

			}
		}
		if (bienDem == 0) {
			System.out.println("ko có mã id này trong trung tâm");
		}
		for (Student o : studentArrayList) {
			System.out.println(o.toString());

		}

	}

	public void xoaHocVien(Scanner sc) {
		System.out.println("mời bạn nhâp tên học viên xin nghỉ");
		String ten = sc.nextLine();
		int bienDem = 0;

		for (Student o : studentArrayList) {
			if (o.getName().equals(ten)) {
				studentArrayList.remove(o);
			}
		}
		if (bienDem == 0) {
			System.out.println("ko có bạn này trong trung tâm");
		}
		if (studentArrayList.size() != 0) {
			for (Student o : studentArrayList) {
				System.out.println(o.toString());
			}
		}

	}
}
