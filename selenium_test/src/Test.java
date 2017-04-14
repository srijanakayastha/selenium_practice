/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srijana
 
/*You must declare all variables before they can be used. 
* Following is the basic form of a variable declaration:
* data type variable [ = value][, variable [= value] ...] 
* if you want to use more than one variable, you can use a comma-separated list.
Following are valid examples of variable declaration and initialization in Java:
* int a, b, c; // Declares three integer, a, b, and c.
* int a = 10, b = 10; // Example of initialization
 byte B = 22;// initializes a byte type variable B.
double pi = 3.14159;// declares and assigns a value of PI.
char a = 'a';// the char variable a is initialized with value 'a'
* 
There are three kinds of variables in Java:
  Local variables
  Instance variables
  Class/Static variables
  * 
  * 
  * Local Variables: 
  Access modifiers cannot be used for local variables.
  Local variables are visible only within the declared method, constructor, or block.
  Local variables are implemented at stack level internally.
  There is no default value for local variables, so local variables should 
  be declared and an initial value should be assigned before the first use.


* 
* 
*/

/*Example of local variables//
Here, age is a local variable. This is defined inside pupAge() method and its scope is limited to only this method.*/

public class Test{
   public void pupAge(){
int age = 0;
age = age + 7;
System.out.println("Puppy age is : " + age);
}
public static void main(String args[]){ 
    Test test = new Test(); 
    test.pupAge();
} }

/* o/p :  Puppy age is: 7
if we do not initialize the value of age then it gives error during compiling
*/


/*
Java Access Modifiers : 

Java provides a number of access modifiers to set access levels for classes, variables, methods, and constructors. 
The four access levels are:
  Visible to the package, the default. No modifiers are needed.
  Visible to the class only (private).
  Visible to the world (public).
  Visible to the package and all subclasses (protected).

1) Default Access Modifier - No Keyword
Variables and methods can be declared without any modifiers, as in the following examples:

//example : 

String version = "1.5.1";
boolean processOrder() {
   return true;
}//


2) Private Access Modifier - Private
Methods, variables, and constructors that are declared private can only be accessed within the declared class itself.
Private access modifier is the most restrictive access level. Class and interfaces cannot be private.
Variables that are declared private can be accessed outside the class, 
if public getter methods are present in the class.
Using the private modifier is the main way that an object encapsulates itself and hides data from the outside world.

//example : 
The following class uses private access control:

public class Logger {
   private String format;
   public String getFormat() {
      return this.format;
   }
public void setFormat(String format) { 
this.format = format;
} }

Note :  Here, the format variable of the Logger class is private, so there's no way for other 
classes to retrieve or set its value directly.
So, to make this variable available to the outside world, we defined two public methods: 
--getFormat(), which returns the value of format, and --setFormat(String), which sets its value.

3) Public Access Modifier - Public
A class, method, constructor, interface, etc. declared public can be accessed from any other class. 
Therefore, fields, methods, blocks declared inside a public class can be accessed from any class belonging to the Java Universe.
However, if the public class we are trying to access is in a different package, 
then the public class still needs to be imported. 
Because of class inheritance, all public methods and variables of a class are inherited by its subclasses.


Example
The following function uses public access control:

public static void main(String[] arguments) 
{ // ...

}
The main() method of an application has to be public. 
Otherwise, it could not be called by a Java interpreter (such as java) to run the class.


4) Protected Access Modifier - Protected

Variables, methods, and constructors, which are declared protected in a superclass can be accessed only 
by the subclasses in other package or any class within the package of the protected members' class.
The protected access modifier cannot be applied to class and interfaces. Methods, 
fields can be declared protected, however methods and fields in a interface cannot be declared protected.
Protected access gives the subclass a chance to use the helper method or variable, 
while preventing a nonrelated class from trying to use it.

//Example
The following parent class uses protected access control, 
to allow its child class override openSpeaker() method:

class AudioPlayer {
   protected boolean openSpeaker(Speaker sp) {
      // implementation details
   }
}
class StreamingAudioPlayer {
boolean openSpeaker(Speaker sp) {
      // implementation details
   }
}

Here, if we define openSpeaker() method as private, then it would not be accessible from any other class other than AudioPlayer. 
If we define it as public, then it would become accessible to all the outside world. 
But our intention is to expose this method to its subclass only, that’s why we have used protected modifier.


*/

/*

Access Control and Inheritance

The following rules for inherited methods are enforced:
  Methods declared public in a superclass also must be public in all subclasses.
  Methods declared protected in a superclass must either be protected or public in subclasses; 
    they cannot be private.
  Methods declared private are not inherited at all, so there is no rule for them.

*/

/* Java Non-Access Modifiers

Java provides a number of non-access modifiers to achieve many other functionalities.
  * The static modifier for creating class methods and variables.
  * The final modifier for finalizing the implementations of classes, methods, and variables.
  * The abstract modifier for creating abstract classes and methods.
  * The synchronized and volatile modifiers, which are used for threads.

    * static modifier :
Example
The static modifier is used to create class methods and variables, as in the following example:

public class InstanceCounter {
   private static int numInstances = 0; // static variables;
   protected static int getCount() // static methods
{
      return numInstances;
}

private static void addInstance() 
{ 
numInstances++;
}
   InstanceCounter() {
      InstanceCounter.addInstance();
}
public static void main(String[] arguments) { 
System.out.println("Starting with " + InstanceCounter.getCount() + " instances");
for (int i = 0; i < 500; ++i)
{
         new InstanceCounter();
       }
      System.out.println("Created " +
InstanceCounter.getCount() + " instances");
}
}

o/p : 
Started with 0 instances
Created 500 instances

*/

/* The Final Modifier
example of final variables 
public class Test{
final int value = 10;

// The following are examples of declaring constants:
public static final int BOXWIDTH = 6;
static final String TITLE = "Manager";
public void changeValue()
{
value = 12; //will give an error
} }

example of final method :

You declare methods using the final modifier in the class declaration, as in the following example:

public class Test{
    public final void changeName(){
       // body of method
    }
}

example of Final Classes 
public final class Test {
   // body of class
}

Abstract modifier :
Abstract class : 
An abstract class can never be instantiated. If a class is declared as abstract then the sole purpose is for the class to be extended.
A class cannot be both abstract and final (since a final class cannot be extended). If a class contains abstract methods then the class should be declared abstract. Otherwise, a compile error will be thrown.
An abstract class may contain both abstract methods as well normal methods.

abstract class Caravan{
private double price;
private String model;
private String year;
public abstract void goFast(); //an abstract method 
public abstract void changeColor();
}

Abstract Methods :
An abstract method is a method declared without any implementation. The methods body (implementation) is provided by the subclass. Abstract methods can never be final or strict.
Any class that extends an abstract class must implement all the abstract methods of the super class, unless the subclass is also an abstract class.
If a class contains one or more abstract methods, then the class must be declared abstract. An abstract class does not need to contain abstract methods.
The abstract method ends with a semicolon. Example: public abstract sample();

public abstract class SuperClass{
    abstract void m(); //abstract method
}
class SubClass extends SuperClass{
     // implements the abstract method
      void m(){
       .........
} }

The Synchronized Modifier : 
The synchronized keyword used to indicate that a method can be accessed by only one thread at a time. 
The synchronized modifier can be applied with any of the four access level modifiers.

example :
public synchronized void showDetails(){
.......
}

The Transient Modifier:
An instance variable is marked transient to indicate the JVM to skip 
the particular variable when serializing the object containing it.
This modifier is included in the statement that creates the variable, preceding the class or data type of the variable.

public transient int limit = 55; // will not persist 
public int b; // will persist

The Volatile Modifier: 
example :
public class MyRunnable implements Runnable{ 
private volatile boolean active;
     public void run(){
        active = true;
        while (active){ // line 1
            // some code here
        }
    }
    public void stop(){
active = false; // line 2 }}

public class MyRunnable implements Runnable{ private volatile boolean active;
     public void run(){
        active = true;
        while (active){ // line 1
            // some code here
        }
    }

Usually, run() is called in one thread (the one you start using the Runnable), 
and stop() is called from another thread. If in line 1, the cached value of active is used, 
the loop may not stop when you set active to false in line 2. That's when you want to use volatile.
To use a modifier, you include its keyword in the definition of a class, method, or variable. 
The modifier precedes the rest of the statement, as in the following example.

    public void stop(){
active = false; // line 2 }}
*/