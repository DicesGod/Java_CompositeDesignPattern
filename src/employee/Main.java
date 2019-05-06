package employee;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee CEO =new Employee ("John Smith", "CEO"); 
		Employee MarySmith =new Employee ("MarySmith", "Head of Sales"); 
		Employee MarryBrown =new Employee ("MarryBrown", "Head of Marketing"); 
		
		CEO.getSubordinates().add(MarySmith);
		CEO.getSubordinates().add(MarryBrown);
		
		System.out.println(CEO.toString());
		
		for (Employee e : CEO.getSubordinates()) {
		System.out.println(e);	
		}
	}
	

}
