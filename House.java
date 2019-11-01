/**
 * Abstract House class used as a parent class
 * @author henryvy
 *
 */
public abstract class House {
	
	/**
	 * This method will be called in the main class
	 */
	public void buildHouse() {
		prepFoundation();
		createFrame();
		installDrywall();
		addWindows();
		addElectrical();
		addPlumbing();
	}
	
	public void prepFoundation() {
		System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
	}
	
	/**
	 * abstract method that makes every child class implement this method.
	 */
	public abstract void createFrame();
	
	public void installDrywall() {
		System.out.println("Drywall: Creating the interior walls.");
	
	}
	
	public void addWindows() {
		System.out.println("Windows: Putting in the glass for the windows.");
	
	}
	
	public void addElectrical() {
		System.out.println("Electrical: Running all the wires and hooking up the power.");

	}
	
	public void addPlumbing() {
		System.out.println("Plumbing: Letting water run throug the house.");

	}
}
