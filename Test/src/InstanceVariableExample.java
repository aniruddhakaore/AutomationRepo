public class InstanceVariableExample {

  
   public String name;

   
   private double salary;

   
   public InstanceVariableExample (String empName) {
      name = empName;
   }

  
   public void setSalary(double empSal) {
      salary = empSal;
   }

   
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

   public static void main(String args[]) {
      InstanceVariableExample empOne = new InstanceVariableExample("Rajkumar");
      empOne.setSalary(50000);
      empOne.printEmp();
   }
}