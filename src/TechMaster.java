public class TechMaster {
	private String manager;
	private String teacher;
	private Clazz clazz;

	public TechMaster(String manager, String teacher, Clazz clazz) {
		this.manager = manager;
		this.teacher = teacher;
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "TechMaster{" + "manager='" + manager + '\'' + ", teacher='" + teacher + '\'' + ", clazz=" + clazz + '}';
	}
}
