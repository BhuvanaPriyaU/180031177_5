package session4;

public class EncapsulationDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEid(31177);
		e.setName("bhuvana");
		e.setSalary(1000000);
		System.out.println("Employee ID: "+e.getEid());
		System.out.println("Employee Name: "+e.getName());
		System.out.println("Salary: "+e.getSalary());
	}
}
