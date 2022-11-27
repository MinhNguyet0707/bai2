import java.util.ArrayList;

public class Clazz {
    private ArrayList<Student> students;
    private String monHoc;
	public Clazz(ArrayList<Student> students, String monHoc) {
		super();
		this.students = students;
		this.monHoc = monHoc;
	}
	@Override
	public String toString() {
		return "Clazz [students=" + students + ", monHoc=" + monHoc + "]";
	}

   
    
}
