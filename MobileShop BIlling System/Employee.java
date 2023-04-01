class Employee{
	private int id;
	private String name;
	private String address;
	private double[] performance;// = new double[50];
	private double salary;
	
	int getId(){
		return this.id;
	}
	
	void setId(int id){
		this.id = id;
	}
	
	String getName(){
		return this.name;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getAddress(){
		return this.address;
	}
	
	void setAddress(String address){
		this.address = address;
	}
	
	double[] getPerformance(){
		return this.performance;
	}
	
	void setPerformance(double[] p){
		this.performance = p;
	}
	
	double getSalary(){
		return this.salary;
	}
	
	void setSalary(double salary){
		if(salary >= 0)
			this.salary = salary;
	}
	
	public Employee(int id, String name, String address, double salary, double[] p){
		this.setId(id);
		this.setName(name);
		this.setAddress(address);
		this.setSalary(salary);
		this.setPerformance(p);
	}
	
	public void showEmployeeDetails(){
		System.out.println("Employee ID: " + this.getId());
		System.out.println("Employee Name: " + this.getName());
		System.out.println("Employee Address: " + this.getAddress());
		System.out.println("Employee Salary: " + this.getSalary());
		this.findPerformance();
		this.findAvg();
	}
	
	private void findPerformance(){
		System.out.print("Employee Performance mark: ");
		for(int index = 0; index < this.performance.length; index++){
			System.out.print(this.performance[index] + " ");
		}
	}
	
	private void findAvg(){
		double avg =0, sum = 0;
		int index = 0;
		for(index = 0; index < this.performance.length; index++){
			sum += this.performance[index];
		}
		avg = sum/index;//this.performance.length
		System.out.println("\nEmployee performance average: " + avg);
		
		//double[] u = this.getPerformance();
		//for(int index = 0; index < 4; index++){
		//	System.out.print(u[index] + " ");
		//}
	}
}

//Org has Emp
//Ins has Std
//bank has Acc
//has a

















