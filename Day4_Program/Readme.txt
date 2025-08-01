Encapsulation (data hiding by wrapping the data members & member functions) & Abstraction (code/ Business Logic -  implementation hiding) --- Hiding 


Abstraction -- Abstract & Interface

Hiding the implementation and showing the necessary/relevant information -- What is an object 

Abstract classes are not 100% abstraction  --- we are implementing using abstract keyword : In abstract class we have both abstract methods as well as 
non abstract method --  where implementation/definition of abstract methods will be given by child class while overriding the abstract methods which is mandatory to override the abstract methods
and overriding is not mandatory for non abstract methods
//Amazon                                                                    Zara (.net/java (api for paymentProcessing))
abstract class Payment{
            
           private int years = 2;
           
           public int getYears()
           {
           return years;
           }
                                                                               class ProductPayment extends Payment
//abstract method  --  (methods declared without an implementation)              
abstract void paymentProcessing() ;                                            {  // Zara has to give the implementation or definition of paymentProcessing method because it is abstract   }

   // api -- call  (hidden implementation)

//non -abstract method
void discount()
{
// we can give the definition
 
}

}


interface --- (100% abstraction) --we are implementing using interface keyword  where all methods are by default abstract  (but before java 1.8) because after 1.8 onvwards we do have static or default methods for extension( as in functional interface)-- 

It's an agreement/contract where the implementation of all methods of an interface will be given by a child class and by default the variables in an interface are final
Interface is used to achieve 100% abstraction  
Swiggy																		PizzaHut
interface Process                                                     class Deliver implements Process
{                                                                        {// override all the three methods that are mandatory and give the definition}

// by default it is abstract
 void paymentProcessing() ;

 
 void productListing();

 void productPrice();


}


interface CrudOperations             class AdminUser implements CrudOperations
{										{

void add();								void add(){}
															
void delete();							void delete() {}
void update();							void update(){}
void view();								void view(){}
}										}						

class Hr implements CrudOperations
{										{

							void add(){}														
							void delete() {}
							void update(){}
							void view(){}
}										}




--------------------------------------------------------------------------------------

Inheritance : where a child class inherits properties and methods from parent(super ) class using the extends keyword
              and it enables code reuse , hierarchical structure and also support polymorhism.
              
Types of Inheritance:
a) Single Inheritance : one child(sub or derived class) and one parent(super ,base class)

for eg :  class Father{}     ,   class Child extends Father {}
b) Multilevel Inheritance : one child class extends one base class and then the another child class extends the child class

for eg :  class Father{}   , class Child extends Father{} ,   class GrandChild extends Child{}

c) Multiple Inheritance ( which is implemented via Interface) --  one class can implements two interfaces

for eg:   interface Operations{} , interface Execution{}   ,  class MainProgram implements Operations, Execution

* Second ex. is not possible :  class Father{}   , class Child extends Father{} ,   class GrandChild extends Father , Child 
* Third  ex. is possible : class Father{}   , interface Operations{} ,   class Child extends Father implements Operations {}
* Fourth ex. is not possible : class Father{}   , interface Operations{} ,   class Child implements Operations extends Father {}
* Fifth  ex. is possible:   interface Operations{} , interface Execution extends Operations{}   

d) Hierarchical Inheritance  : --  When multiple subclasses extending one same Parent 

for eg :  class GrandFather{}   , class Father extends GrandFather{} ,   class Child extends GrandFather{}

e) Hybrid Inheritance  --- Mix of types  eg : Hierarchical + interface based multiple inheritance

Super keyword is used in inheritance generally 
1. Super keyword is used to access the parent class fields or methods when overridden in child class  (super.field or super.method() you are calling in child  class of base class)
2. Super keyword  must be the first statement in the subclass constructor if used.
3. A subclass inherits only non-private or protected members of a base class.
4. super can't be used in static context.



------------------------------------------------------------------
Java Exception Handling

Throwable (Base Class)


Error  -- (JVM/ System Level issues) errors which we cannot handle  ( OutOfMemoryError ), errors cannot be predicted , Usually we cannot 
catch in code , serious issues that may occur suddenly  for(i=0 ; i<n;i++)
An error is a serious issue that arises in the JVM or system environment , 
ususally outside the application control . It is also a throwable object , but it 
indicates problems that are not meant to be caught or handled in normal code by the programmers or Developers

eg: JVM runs out of memory 
Infinite recursion or a loop which causes a stack overflow

These are not recoverable .

Exception  --- Application Level issues -- which is an event that disrupts the normal flow of the program during execution. It is 
an object that represents an error or unexpected situation that can be handled gracefully using 
try , catch and finally blocks  also includes throw and throws key word.

try:=  business logic  --  you think that may be the code is risky
catch := handle immediately the exception after occured in try block 
finally block will execute in both the cases 

throws 
throws


-------------------------------------------New Day8---------------------
Java Exception Handling

Throwable (Base Class)


Error  -- (JVM/ System Level issues) errors which we cannot handle  ( OutOfMemoryError ), errors cannot be predicted , Usually we cannot 
catch in code , serious issues that may occur suddenly  for(i=0 ; i<n;i++)
An error is a serious issue that arises in the JVM or system environment , 
ususally outside the application control . It is also a throwable object , but it 
indicates problems that are not meant to be caught or handled in normal code by the programmers or Developers

eg: JVM runs out of memory 
Infinite recursion or a loop which causes a stack overflow

These are not recoverable .

Exception  --- Application Level issues -- which is an event that disrupts the normal flow of the program during execution. It is 
an object that represents an error or unexpected situation that can be handled gracefully using 
try , catch and finally blocks  also includes throw and throws key word.

try:=  business logic  --  you think that may be the code is risky
catch := handle immediately the exception after occured in try block 
finally block will execute in both the cases 


Runtime Exceptions  ( Unchecked Exceptions ) 

ArithmeticExceptions :  DivideByZero

IllegalArgumentException : NumberFormatException / IllegalThreadStateException

ClassCastException : It may throw when an object is cast to a class it's not an instance of

IndexOutOfBoundExcept : for invalid retreiving the values from the array or string for a invalid index range

Null Pointer Exception : which is pointing to null reference;


Compile Time Exceptions (Checked Exception)

classNotFoundexception

filenotfoundexception

InterruptedException
instantiation exception

nosuchmethod exception







