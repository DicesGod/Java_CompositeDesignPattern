package employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

		private String name;
		private String position;
		
		private List<Employee> subordinates;
		
		public Employee(String name, String position) {
			super();
			this.name = name;
			this.position = position;
			subordinates = new ArrayList<Employee>();
		}
		
		public List<Employee> getSubordinates(){
			return subordinates;
		}

		
		@Override
		public String toString() {
			return "Employee: [ name=" + name + ", position=" + position + " ]";
		}
		
		
	}



