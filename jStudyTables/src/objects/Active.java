/**
 * 
 */
package objects;

/**
 * @author otacon424
 *
 */
public class Active extends Person
{
	//Declaring Variables
	protected int hoursNeeded,
				  hoursRequired,
				  hoursCompleted;
	protected double requiredGPA,
					 currentGPA,
					 goalGPA;
	
	public Active()
	{
		super.name = "";
		super.age = 0;
		this.hoursNeeded = 0;
		this.hoursRequired = 0;
		this.hoursCompleted = 0;
		this.requiredGPA = 0.0;
		this.currentGPA = 0.0;
		this.goalGPA = 0.0;
	}
	
	public Active(String name, int age, int hoursNeeded, int hoursRequired, int hoursCompleted, double currentGPA, 
				  double requiredGPA, double goalGPA)
	{
		super.name = name;
		super.age = age;
		this.hoursNeeded = hoursNeeded;
		this.hoursRequired = hoursRequired;
		this.hoursCompleted = hoursCompleted;
		this.currentGPA = currentGPA;
		this.requiredGPA = requiredGPA;
		this.goalGPA = goalGPA;
	}

	public int getHoursNeeded() {
		return hoursNeeded;
	}

	public void setHoursNeeded(int hoursNeeded) {
		this.hoursNeeded = hoursNeeded;
	}

	public int getHoursRequired() {
		return hoursRequired;
	}

	public void setHoursRequired(int hoursRequired) {
		this.hoursRequired = hoursRequired;
	}

	public int getHoursCompleted() {
		return hoursCompleted;
	}

	public void setHoursCompleted(int hoursCompleted) {
		this.hoursCompleted = hoursCompleted;
	}

	public double getRequiredGPA() {
		return requiredGPA;
	}

	public void setRequiredGPA(double requiredGPA) {
		this.requiredGPA = requiredGPA;
	}

	public double getCurrentGPA() {
		return currentGPA;
	}

	public void setCurrentGPA(double currentGPA) {
		this.currentGPA = currentGPA;
	}

	public double getGoalGPA() {
		return goalGPA;
	}

	public void setGoalGPA(double goalGPA) {
		this.goalGPA = goalGPA;
	}

	
	@Override
	public String toString() {
		return "Active [hoursNeeded=" + hoursNeeded + ", hoursRequired="
				+ hoursRequired + ", hoursCompleted=" + hoursCompleted
				+ ", requiredGPA=" + requiredGPA + ", currentGPA=" + currentGPA
				+ ", goalGPA=" + goalGPA + ", name=" + name + ", age=" + age
				+ "]";
	}
	
	
	
}//end class
