/**
 * 
 */
package objects;

/**
 * @author otacon424
 *
 */
public class Person {

	//Declaring the Variables to this class
	protected String name;
	protected int age;
	
	//Declaring the DVC
	public Person()
	{
		this.name = "";
		this.age = 0;
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
