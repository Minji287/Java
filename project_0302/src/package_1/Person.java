package package_1;

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
	
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Person(String name, int age, int height, int weight) {
		super(); // 기본 - object(모든 클래스의 조상)라는 클래스로 부터 물려받음
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
//	void showPerson() {
//		System.out.println("이름: " + name);
//		System.out.println("나이: " + age);
//		System.out.println("키: " + height);
//		System.out.println("몸무게: " + weight);
//	}
}
