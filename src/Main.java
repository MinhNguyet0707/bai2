
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static TechMasterAction action = new TechMasterAction();
	public static ClazzAction clazzAction = new ClazzAction();
	public static void main(String[] args) {
		menu();

	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			showMenu();
			int functionChoice = chooseFunction();
			switch (functionChoice) {
			case 1:
				action.inputTechMaster(sc);
				break;
			case 2:
				clazzAction.themHocVien(sc);
				
				break;
			case 3:
                clazzAction.capNhatLucHoc(sc);
				break;
			case 4:
				clazzAction.xoaHocVien(sc);
				break;

			}
		}
	}

	public static int chooseFunction() {
		System.out.print("Xin mời chọn chức năng: ");
		int choice = 0;
		do {
			choice = new Scanner(System.in).nextInt();
			if (choice >= 1 && choice <= 5) {
				break;
			}
			System.out.print("Chức năng vừa chọn không hợp lệ, vui lòng chọn lại: ");
		} while (true);
		return choice;
	}

	public static void showMenu() {
		System.out.println("----Quản Lý TechMasTer-----");
		System.out.println("1. Hiển thị thông tin chi tiết của trung tâm.");
		System.out.println("2.thêm học viên vào lớp hiện tại.");
		System.out.println("3. cập nhật thông tin học lực của 1b học viên dựa vào Id.");
		System.out.println("4.Có 1 bạn xin nghỉ học, hãy giúp thầy xóa bạn đó khỏi lớp học");
		System.out.println("5. Thoát.");
	}

}
