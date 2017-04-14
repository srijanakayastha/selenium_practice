/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*Basic Syntax
About Java programs, it is very important to keep in mind the following points.
 Case Sensitivity -Java is case sensitive, which means
identifier Hello and hello would have different meaning in Java.
 Class Names - For all class names the first letter should be in Upper Case.
If several words are used to form a name of the class, each inner word's first letter should be in Upper Case.
Example: class MyFirstJavaClass
 Method Names - All method names should start with a Lower Case letter.
If several words are used to form the name of the method, then each inner word's first letter should be in Upper Case.
Example: public void myMethodName()
 Program File Name - Name of the program file should exactly match the class
name.
When saving the file, you should save it using the class name (Remember Java is case sensitive) and append '.java' to the end of the name (if the file name and the class name do not match, your program will not compile).
Example: Assume 'MyFirstJavaProgram' is the class name. Then the file should be saved as 'MyFirstJavaProgram.java'
 public static void main(String args[]) - Java program processing starts from the main() method which is a mandatory part of every Java program.
*/
package Class;

/**
 *
 * @author srijana
 */

//this is how we create class , in class name  first letter  should start with uppercase.//
public class Dog{
   String breed;
   int age;
   String color;
   void barking(){
   }
   void hungry(){
   }
   void sleeping(){
} }
// here barking(), hungry(), sleeping() are methods//

/* A class can contain any of the following variable types.
 Local variables: Variables defined inside methods, constructors or blocks are called local variables. 
The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed.
 Instance variables: Instance variables are variables within a class but outside any method. 
These variables are initialized when the class is instantiated. Instance variables can be accessed from inside any method, 
constructor or blocks of that particular class.
 Class variables: Class variables are variables declared within a class, 
outside any method, with the static keyword.//

/* Following is an example of a constructor:
The main rule of constructors is that they should have the same name as the class.
A class can have more than one constructor.

public class Puppy{
   public Puppy(){
   }
   public Puppy(String name){
      // This constructor has one parameter, name.
} }

/* Following is an example of creating an object:

public class Puppy{
public Puppy(String name){
// This constructor has one parameter, name. 
System.out.println("Passed Name is :" + name );
}
public static void main(String []args){

// Following statement would create an object myPuppy //

 Puppy myPuppy = new Puppy( "tommy" );

} }
Passed Name is :tommy
*/

/*Accessing Instance Variables and Methods
Instance variables and methods are accessed via created objects. 
To access an instance variable, following is the fully qualified path:

 First create an object 
ObjectReference = new Constructor();

 Now call a variable as follows 
ObjectReference.variableName;

Now you can call a class method as follows 
ObjectReference.MethodName();



*/

/* This example explains how to access instance variables and methods of a class.

public class Puppy{
   int puppyAge;
   public Puppy(String name){
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
}
   public void setAge( int age ){
       puppyAge = age;
}
public int getAge( ){
System.out.println("Puppy's age is :" + puppyAge ); 
return puppyAge;
}
public static void main(String []args){ 
// Object creation 
Puppy myPuppy = new Puppy( "tommy" );

      /* Call class method to set puppy's age 
      myPuppy.setAge( 2 );

      /* Call another class method to get puppy's age 
      myPuppy.getAge( );

      /* You can access instance variable as follows as well 

System.out.println("Variable Value :" + myPuppy.puppyAge ); }
}

o/p :

Name chosen is :tommy
Puppy's age is :2
Variable Value :2

*/


/*Java Basic Operator : 

  Arithmetic Operators
  Relational Operators
  Bitwise Operators
  Logical Operators
  Assignment Operators
  Misc Operators

*/





/*The Logical Operators

The following table lists the logical operators:
Assume Boolean variables A holds true and variable B holds false, then:
 
 
Operator
 
Description
1
&& (logical and)
Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.
Example: (A && B) is false.
if A and B are both non zero then it is true.


2
|| (logical or)
Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.
Example: (A || B) is true.
if one operand are non zero then it is true.

3
! (logical not)
Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.
Example: !(A && B) is true.
if (A && B) condn is false then !(A & & B) condition is true.

52
 
Example
The following simple example program demonstrates the logical operators. Copy and paste the following Java program in Test.java file and compile and run this program:
Java
public class Test {
  public static void main(String args[]) {
     boolean a = true;
     boolean b = false;
     System.out.println("a && b = " + (a&&b));
     System.out.println("a || b = " + (a||b) );
     System.out.println("!(a && b) = " + !(a && b));
  }
}
This will produce the following result:
The Assignment Operators
Following are the assignment operators supported by Java language:
a && b = false
a || b = true !(a && b) = true */

/*
Miscellaneous Operators : 
Conditional Operator ( ? : )
Conditional operator is also known as the ternary operator. 
This operator consists of three operands and is used to evaluate Boolean expressions. 
The goal of the operator is to decide, which value should be assigned to the variable. 

The operator is written as:
variable x = (expression) ? value if true : value if false
it is same like if else loop :
if(a==1) ? true or false need to check.

Following is an example: 
public class Test {
public static void main(String args[]){ int a, b;
a = 10;
b = (a == 1) ? 20: 30;
System.out.println( "Value of b is : " + b );
      b = (a == 10) ? 20: 30;
System.out.println( "Value of b is : " + b ); }
}
This will produce the following result:
     Value of b is : 30 because (a==1)(10==1) is not true 
Value of b is : 20 because (10==10) is true.
 

nstanceof Operator
This operator is used only for object reference variables. 
The operator checks whether the object is of a particular type (class type or interface type). 
instanceof operator is written as:
( Object reference variable ) instanceof (class/interface type)

If the object referred by the variable on the left side of the operator passes the IS-A check 
for the class/interface type on the right side, then the result will be true. 
Following is an example:
Java
     ( Object reference variable ) instanceof (class/interface type)
   
public class Test {
public static void main(String args[]){
String name = "James"; 
// following will return true since name is type of String boolean result = 
name instanceof String; 
System.out.println( result );
} }
This will produce the following result:
true

This operator will still return true, if the object being compared is the assignment compatible with the type on the right. Following is one more example:
     true
   
class Vehicle {}
public class Car extends Vehicle {
public static void main(String args[]){
Vehicle a = new Car();
boolean result = a instanceof Car; 
System.out.println( result );
} }
This will produce the following result:
     true
*/

/*
java loop control : 
while loop : repeats a statement or group of statement while a given condition is 
true.test the condition before executing the loop body.

Syntax

The syntax of a while loop is:
Here, statement(s) may be a single statement or a block of statements. 
The condition may be any expression, and true is any non zero value.
When executing, if the boolean_expression result is true, then the actions 
inside the loop will be executed. This will continue as long as the expression 
result is true.
When the condition becomes false, program control passes to the 
line immediately following the loop.

Example

public class Test {
public static void main(String args[]) { 
int x = 10;
      while( x < 20 ) {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
} }
}
This will produce the following result:
value of x : 10
value of x : 11
value of x : 12
value of x : 13
value of x : 14
value of x : 15
value of x : 16
value of x : 17
value of x : 18
value of x : 19

for loop : how many times task a is to be repeated. repetition control structure
allows you to  efficiently write a loop that needs to be executed.

Syntax
The syntax of a for loop is:
Here is the flow of control in a for loop:
  The initialization step is executed first, and only once. 
This step allows you to declare and initialize any loop control variables and 
this step ends with a semi colon (;).
  Next, the Boolean expression is evaluated. 
If it is true, the body of the loop is executed. If it is false, the body of the loop will not be executed and control jumps to the next statement past the for loop.
  After the body of the for loop gets executed, 
the control jumps back up to the update statement. 
This statement allows you to update any loop control variables. 
This statement can be left blank with a semicolon at the end.
  The Boolean expression is now evaluated again. 
If it is true, the loop executes and the process repeats 
(body of loop, then update step, then Boolean expression). 
After the Boolean expression is false, the for loop terminates.

for(initialization; Boolean_expression; update)
{
   //Statements
}

Example
Following is an example code of the for loop in Java.

public class Test {
public static void main(String args[]) 
{
for(int x = 10; x < 20; x = x+1) 
{ 
System.out.print("value of x : " + x ); 
System.out.print("\n");
} }

This will produce the following result:

value of x : 10
value of x : 11
value of x : 12
value of x : 13
value of x : 14
value of x : 15
value of x : 16
value of x : 17
value of x : 18
value of x : 19

Do While Loop in Java :

A do...while loop is similar to a while loop, except that a do...while loop is 
guaranteed to execute at least one time.

do {
   //Statements
}
while(Boolean_expression);(x<20);

Example

public class Test {
public static void main(String args[])
{ 
int x = 10;
      do{
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }
while( x < 20 );
   }
}

This will produce the following result:

value of x : 10
value of x : 11
value of x : 12
value of x : 13
value of x : 14
value of x : 15
value of x : 16
value of x : 17
value of x : 18
value of x : 19


Loop Control Statements: are 
1) break statement
2) Continue statement

The break statement in Java programming language has the following two usages:
  When the break statement is encountered inside a loop, the loop is immediately 
terminated and the program control resumes at the next statement following the loop.
  It can be used to terminate a case in the switch statement (covered in the next chapter).

example :

public class Test {
public static void main(String args[]) { int [] numbers = {10, 20, 30, 40, 50};
for(int x : numbers ) { 
if( x == 30 ) {
break; }
         System.out.print( x );
         System.out.print("\n");
      }
} }

result : 10, 20

continue statement : 

Example

public class Test {
public static void main(String args[]) { 
int [] numbers = {10, 20, 30, 40, 50};
for(int x : numbers ) {
if( x == 30 ) {
continue; }
         System.out.print( x );
         System.out.print("\n");
      }
} }

results : 10 20 40 50

Enhanced for loop in java :
Example

public class Test {
public static void main(String args[]){ 
int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         System.out.print( x );
         System.out.print(",");
}

System.out.print("\n");
String [] names ={"James", "Larry", "Tom", "Lacy"}; 

for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }
} }
Results : 
10,20,30,40,50,
James,Larry,Tom,Lacy,

*/
/* Decision Making are :

1) if statement : syntax :
  if(Boolean_expression)
{
   //Statements will execute if the Boolean expression is true
}

Example

public class Test {
public static void main(String args[]){ 
int x = 10;
if( x < 20 )//10<20 so , the boolean expression is true. 
{
System.out.print("This is if statement");
} }
}

result: This is if statement

2) If-else Statement in Java: 

Syntax
Following is the syntax of an if...else statement:
 
    
if(Boolean_expression)
{
//Executes when the Boolean expression is true
}
else 
{
//Executes when the Boolean expression is false
}

Example
This will produce the following result:

public class Test {
public static void main(String args[])
{ 
int x = 30;
if( x < 20 )//here 30<20 so, the condition is false it is executed to else statement//
{
System.out.print("This is if statement");
}
else
{
System.out.print("This is else statement");// here boolean expression is false so ,the else statement.//
}
}
}
result : This is else statement


3) The if...else if...else Statement: 

Syntax
Following is the syntax of an if...else statement:
if(Boolean_expression 1)
{
//Executes when the Boolean expression 1 is true
}
else if(Boolean_expression 2)
{
//Executes when the Boolean expression 2 is true
}
else if(Boolean_expression 3)
{
//Executes when the Boolean expression 3 is true
}
else
{
   //Executes when the none of the above condition is true.
}

example : 

public class Test {
public static void main(String args[]){ 
int x = 30;
if( x == 10 )
{
System.out.print("Value of X is 10");
}
else if( x == 20 ){ 
System.out.print("Value of X is 20");
}
else if( x == 30 ){
System.out.print("Value of X is 30");
}
else
{
System.out.print("This is else statement");
}
} }
     This will produce the following result:
    Value of X is 30

4) Nested if Statement in Java : 

Syntax
The syntax for a nested if...else is as follows:
This will produce the following result:

 
if(Boolean_expression 1)
{
//Executes when the Boolean expression 1 is true 

if(Boolean_expression 2)

{
//Executes when the Boolean expression 2 is true

   }
}
You can nest else if...else in the similar way as we have nested if statement.

Example
public class Test {
public static void main(String args[])
{ 
int x = 30;
int y = 10;
if( x == 30 )
{ 
if( y == 10 ){
System.out.print("X = 30 and Y = 10"); }
} }
}

result : X = 30 and Y = 10

5) Switch Statement in Java :

A switch statement allows a variable to be tested for equality against a list of values. 
Each value is called a case, and the variable being switched on is checked for each case.

Syntax

The syntax of enhanced for loop is:

switch(expression){
    case value :
       //Statements
       break; //optional
    case value :
       //Statements
       break; //optional
    //You can have any number of case statements.
    default : //Optional
        //statement
}

example 

public class Test {
public static void main(String args[]){
//char grade = args[0].charAt(0); 
char grade = 'C';
      switch(grade)
      {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");

 break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
}
System.out.println("Your grade is " + grade); }
}
result :

$ java Test
Well done
Your grade is a C
$



Java- Numbers Classes :
Normally, when we work with Numbers, we use primitive data types 
such as byte, int, long, double, etc.

example :

int i = 5000;
float gpa = 13.65;
byte mask = 0xaf;


Syntax
Here is a separate method for each primitive data type:
 
byte byteValue()
short shortValue()
int intValue()
long longValue()
float floatValue()
double doubleValue()

*/

/*

12.)  Java – Character Class
Normally, when we work with characters, we use primitive data types char.
char ch = 'a';
// an array of char//
char[] charArray ={'a','b','c','d','e'};
The Character class offers a number of useful class (i.e., static) methods for 
manipulating characters. 
You can create a Character object with the Character constructor:
Character ch = new Character('a');

Example
    // Here following primitive char 'a'
// is boxed into the Character object ch
// Character ch = 'a';


// Here primitive 'x' is boxed for method test, 
// return is unboxed to char 'c'
char c = test('x');

Example
If you want to put quotes within quotes, you must use the escape sequence, \", 
on the interior quotes:

public class Test {
public static void main(String args[]) { 
System.out.println("She said \"Hello!\" to me.");
}
}

result : She said "Hello!" to me.

13.) Java – Strings Class :

In java programming language, string are treated as objects.

Creating Strings : 
The most direct way to create a string is to write:
String greeting = "Hello world!";


As with any other object, you can create String objects by using the 
new keyword and a constructor.

Example :
public class StringDemo{
public static void main(String args[]){
char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'}; 
String helloString = new String(helloArray); 
System.out.println( helloString );
} }

result : hello.


The StringBuilder class was introduced as of Java 5 and the main difference between 
the StringBuffer and StringBuilder 
is that StringBuilders methods are not thread safe (not synchronised).

It is recommended to use StringBuilder whenever possible because it is faster than StringBuffer. 
However, if the thread safety is necessary, the best option is StringBuffer objects.

Example :

public class Test{
    public static void main(String args[]){
       StringBuffer sBuffer = new StringBuffer(" test");
       sBuffer.append(" String Buffer");
       System.out.println(sBuffer);
} }

result : test String Buffer


Java – String Buffer reverse() Method:

Syntax
Here is the syntax for this method:
public StringBuffer reverse()

example : 

public class Test {
public static void main(String args[]) {
StringBuffer buffer = new StringBuffer("Game Plan"); 
buffer.reverse();
System.out.println(buffer);
} }

result : nalP emaG

*/

/* 14) Java Arrays:

1) Declaring Array Variables: 
dataType[] arrayRefVar; // peferred way//
double[] mylist;//preferred way//

Creating Arrays :
you can create an array by using the new operator with the following syntax:

arrayRefVar = new dataType[arraySize];

The above statement does two things:
  It creates an array using new dataType[arraySize].
  It assigns the reference of the newly created array to the variable arrayRefVar.

Declaring an array variable, creating an array, and assigning the reference of the array to
the variable can be combined in one statement, as shown below:

dataType[] arrayRefVar = new dataType[arraySize];

Alternatively you can create arrays as follows:

dataType[] arrayRefVar = {value0, value1, ..., valuek};


Example
Following statement declares an array variable, myList, creates an array of 10 
elements of double type and assigns its reference to myList:
 double[] myList = new double[10];
*/

/*
15) java Date and Time: 
java provides Date class available in java.util package. this class encaapsulates 
the current date and time.

Date class constructor supports two constructor :
constructor and description :

Date(): 
This constructor initializes the object with the current date and time.

Date(long millisec):
This constructor accepts an argument that equals the number of milliseconds 
that have elapsed since midnight, January 1, 1970.

following are the method of the  date class:
Methods with Description

boolean after(Date date):
Returns true if the invoking Date object contains a date that is later than the 
one specified by date, otherwise, it returns false.


boolean before(Date date):
Returns true if the invoking Date object contains a date that is earlier than 
the one specified by date, otherwise, it returns false.

Object clone( ):
Duplicates the invoking Date object.

int compareTo(Date date):
Compares the value of the invoking object with that of date. 
Returns 0 if the values are equal. Returns a negative value if the invoking object is earlier than date. 
Returns a positive value if the invoking object is later than date.

String toString( ):
Converts the invoking Date object into a string and returns the result.

Getting Current Date & Time : You can use a simple Date object with 
toString() method to print the current date and time as follows:

import java.util.Date;
public class DateDemo {
public static void main(String args[]) {
       // Instantiate a Date object
       Date date = new Date();
       // display time and date using toString()
       System.out.println(date.toString());
   }
}

result : on May 04 09:51:52 CDT 2009
*/


/*16.) Java – Regular Expressions




*/


/* 17) Java Methods :



Creating Method :


Considering the following example to explain the syntax of a method:



public static int methodName(int a, int b)
{ 

// body
}

Here, 

  public static: modifier

  int: return type

  methodName: name of the method

  a, b: formal parameters

  int a, int b: list of parameters

Method definition consists of a method header and a method body. 
The same is shown in the following syntax:


modifier returnType nameOfMethod (Parameter List)
{ 
// method body
}

The syntax shown above includes:

  modifier: It defines the access type of the method and it is optional to use.

  returnType: Method may return a value.

  nameOfMethod: This is the method name. 

The method signature consists of the method name and the parameter list.


Parameter List: The list of parameters, it is the type, order, and number 
of parameters of a method. These are optional, method may contain zero parameters.

  method body: The method body defines what the method does with the statements.

/** the snippet returns the minimum between two numbers 


 public static int minFunction(int n1, int n2) {
   int min;
   if (n1 > n2)
    min = n2;
else
    min = n1;
    return min;


}
*/


/* Method calling

For using a method, it should be called. There are two ways in which a method is called i.e.,
method returns a value or returning nothing (no return value).

The method returning value can be understood by the following example:
    int result = sum(6, 9);




Following is the example to demonstrate how to define a method and how to call it:
This will produce the following result:

public class ExampleMinNumber{
   public static void main(String[] args) {
      int a = 11;
      int b = 6;
      int c = minFunction(a, b);
      System.out.println("Minimum Value = " + c);
}

 // returns the minimum of two numbers //

public static int minFunction(int n1, int n2)
{
      int min;
      if (n1 > n2)
        min = n2; 
        else
        min = n1;
        return min;
}
}

result :
     Minimum value = 6



*/










/* The this keyword: 
Differentiate the instance variables from local variables if they have same names, 
within a constructor or a method.

class Student{
   int age;
   Student(int age){
   this.age=age;
   }
}

class Student{
   int age
   Student(){
   this(20);
   }
   Student(int age){
   this.age=age;
   }
}

Parameterized Constructor:

Example
Here is a simple example that uses a constructor with a parameter:
// A simple constructor.
class MyClass {
int x;

   // Following is the constructor
   MyClass(int i ) {
x = i;
}
}

you will need to call a constructor to initialize object :
//here MyClass is constructor//
public class ConsDemo {
public static void main(String args[]) { 
MyClass t1 = new MyClass( 10 ); 
MyClass t2 = new MyClass( 20 ); 
System.out.println(t1.x + " " + t2.x);
} }

result : 10 20

Example
Here is a simple example that uses a constructor without parameters:

Parameterized Constructor

Most often, you will need a constructor that accepts one or more parameters.
Parameters are added to a constructor in the same way that they are added to a method, 
just declare them inside the parentheses after the constructor's name.


The constructors :
// A simple constructor.
class MyClass {
int x;

   // Following is the constructor//

   MyClass() {
x = 10;
}
}

Method Overloading: 

public class ExampleOverloading{
   public static void main(String[] args) {
      int a = 11;
      int b = 6;
      double c = 7.3;
      double d = 9.4;

      int result1 = minFunction(a, b);

      // same function name with different parameters

      double result2 = minFunction(c, d);

      System.out.println("Minimum Value = " + result1);
      System.out.println("Minimum Value = " + result2);
}

// for integer

public static int minFunction(int n1, int n2) {
      int min;
      if (n1 > n2)
        min = n2; 

        else

        min = n1;


return min;

}
}

result :
Minimum Value = 6
Minimum Value = 7.3


Here, two methods are given by the same name but with different parameters. 
The minimum number from integer and double types is the result.

passing parameters by value : 








The void Keyword: 

The void keyword allows us to create methods which do not return a value. 
Here, in the following example we're considering a void method methodRankPoints. 
This method is a void method, which does not return any value. 

for example :


public class ExampleVoid {
   public static void main(String[] args) {
      methodRankPoints(255.7);
}
public static void methodRankPoints(double points) { if (points >= 202.5) {
         System.out.println("Rank:A1");
      }
      else if (points >= 122.4) {
         System.out.println("Rank:A2");
}
else {
         System.out.println("Rank:A3");
      }
} }


result :Rank:A1




*/