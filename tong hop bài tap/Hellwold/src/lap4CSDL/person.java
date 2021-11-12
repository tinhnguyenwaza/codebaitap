package lap4CSDL;

public class person {

	String name;
	int age;
	
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//mothor get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return   name + " " + age;
	}
	
	
}
