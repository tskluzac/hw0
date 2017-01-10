package uchidb;


/**
 * @author aelmore
 *
 * Edited by Tyler J. Skluzacek 1/10/2017
 */
public class HW0Runner {


	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm

	// Member-Variable: holding a container object that will serve as our singleton.
	// Cast Integer/String in lieu of T/S to avoid implementing interface again...
	private static Containers<Integer, String> singleton_container = new ContainerMaker<>();

	public static Containers<Integer, String> getContainers() {

		return singleton_container;

	}

	//Tests conducted. Empty main class omitted.

}
