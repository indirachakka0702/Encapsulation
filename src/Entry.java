
public class Entry {

	public static void main(String[] args) 
	{
		Employee e =  new Employee();
		//e.empName = " srini"; // it is security issue defining like that
		
		e.setEmpName("srinidhi");
		System.out.println(e.getEmpName());
		
		e.setEmpRollNumber();
		e.getEmpRollNumber();
		// encapsulation similar to (also called) data hiding
		
		car c = new car();
		System.out.println(c.SteringCount);
	}

}
