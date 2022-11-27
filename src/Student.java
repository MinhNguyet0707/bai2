public class Student {
    private static int autoId =0;
    private int id;
    private int age;
    private String name;
    private String rank;

    public Student(String name, int age, String rank) {
        this.id = ++autoId;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }
    

    public static int getAutoId() {
		return autoId;
	}


	public static void setAutoId(int autoId) {
		Student.autoId = autoId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRank() {
		return rank;
	}


	public String setRank(String rank) {
		return this.rank = rank;
	}


	@Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
