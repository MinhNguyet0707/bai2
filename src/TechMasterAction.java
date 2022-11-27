import java.util.InputMismatchException;
import java.util.Scanner;

public class TechMasterAction {
	public TechMaster inputTechMaster(Scanner scanner) {
		System.out.println("Mời b nhập teacher name: ");
		String teacher = scanner.nextLine();
		System.out.println("Mời b nhập manager name: ");
		String manager = scanner.nextLine();
		ClazzAction action = new ClazzAction();
		TechMaster techMaster;
		while (true) {
			try {
				Clazz clazz = action.inputClass(scanner);
				techMaster = new TechMaster(teacher, manager, clazz);
				System.out.println(techMaster.toString());
				break;
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				System.out.println("Vui lòng nhập lại số lượng student");
			}
		}
		return techMaster;
	}
}
