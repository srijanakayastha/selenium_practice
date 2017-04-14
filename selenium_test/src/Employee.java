/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srijana
 /* For our case study, we will be creating two classes. They are Employee and EmployeeTest.
 Remember 
 this is the Employee class and the class is a public class. 
 Now, save this source file with the name Employee.java.
The Employee class has four instance variables - name, age, 
 designation and salary. The class has one explicitly defined constructor, 
 which takes a parameter.*/


public class Employee {
    
    
     String name;
   int age;
   String designation;
   double salary;
   // This is the constructor of the class Employee
   public Employee(String name){
      this.name = name;
   }
   // Assign the age of the Employee  to the variable age.
   public void empAge(int empAge){
      age =  empAge;
   }
/* Assign the designation to the variable designation.*/ 
   public void empDesignation(String empDesig){
      designation = empDesig;
   }
/* Assign the salary to the variable salary.*/
    
   public void empSalary(double empSalary){ 
       salary = empSalary;
   }
   /* Print the Employee details */
   public void printEmployee(){
System.out.println("Name:"+ name ); 
System.out.println("Age:" + age );
System.out.println("Designation:" + designation );
System.out.println("Salary:" + salary);
} }





/* Instance Variables
  Instance variables are declared in a class, but outside a method, constructor or any block.
Access modifiers can be given for instance variables.

The instance variables are visible for all methods, constructors and block in the class. 
Normally, it is recommended to make these variables private (access level). 
However, visibility for subclasses can be given for these variables with the use of access modifiers.
Instance variables have default values. For numbers, the default value is 0, 
for Booleans it is false, and for object references it is null. 
Values can be assigned during the declaration or within the constructor.
Instance variables can be accessed directly by calling the variable name inside the class. However, within static methods (when instance variables are given accessibility), 
they should be called using the fully qualified name . ObjectReference.VariableName.





/* Example of instance variables:

public class Employee{
   // this instance variable is visible for any child class.
   public String name;
   // salary  variable is visible in Employee class only.
   private double salary;

// The name variable is assigned in the constructor. 
public Employee (String empName){
      name = empName;
   }

// The salary variable is assigned a value. 
public void setSalary(double empSal){
      salary = empSal;
   }
// This method prints the employee details. 
      public void printEmp(){
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }
public static void main(String args[]){ 
Employee empOne = new Employee("Ransika"); 
empOne.setSalary(1000);
empOne.printEmp();
} 
This will produce the following result:
     name  : Ransika
salary :1000.0
    */

/*

Example of class/static variables//

Class variables also known as static variables are declared with 
the static keyword in a class, but outside a method, constructor or a block.
//Default values are same as instance variables. For numbers, the default value is 0; 
for Booleans, it is false; and for object references, it is null. 
Values can be assigned during the declaration or within the constructor. 
Additionally, values can be assigned in special static initializer blocks.
  Static variables can be accessed by calling with the class name ClassName.VariableName.

  When declaring class variables as public static final, 
then variable names (constants) are all in upper case. 
If the static variables are not public and final, 
the naming syntax is the same as instance and local variables.//


public class Employee{
// salary variable is a private static variable 
private static double salary;

// DEPARTMENT is a constant
public static final String DEPARTMENT = "Development "; 
public static void main(String args[]){
      salary = 1000;
System.out.println(DEPARTMENT + "average salary:" + salary); }
}

o/p :Development average salary:1000

Note: If the variables are accessed from an outside class, 
the constant should be accessed as Employee.DEPARTMENT


*/