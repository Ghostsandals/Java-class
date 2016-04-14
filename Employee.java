
public class Employee {
	private String name;
    private double payRate;
    private final int EMPLOYEE_ID;
    private static int nextID = 1000;
    public static final double STARTING_PAY_RATE = 7.75;

	
	 public Employee(String name) {
         this.name = name;
         this.EMPLOYEE_ID = getNextID();
         this.payRate = STARTING_PAY_RATE;
 }
 
	 public Employee(String name, double startingPay) {
         this.name = name;
         this.EMPLOYEE_ID = getNextID();
         this.payRate = startingPay;
 }
 
	 public String getName() {
         return name;
 }
 
	 public int getEmployeeID() {
         return EMPLOYEE_ID;
 }
 
	 public double getPayRate() {
		 return payRate;
 }
 
	 public void changeName(String newName) {
         name = newName;
 }
 
	 public void changePayRate(double newRate) {
         payRate = newRate;
 }
 
	 private static int getNextID() {
         return nextID++;
 }

}
