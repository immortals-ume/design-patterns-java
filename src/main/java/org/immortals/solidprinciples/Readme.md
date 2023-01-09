# SOLID Principles

SOLID principle comprises the following ,

    S -> Single Responsibility Principle 
    O -> Open/Closed Principle
    L -> Liskov Substitution Principle
    I -> Interface Segregation Principle
    D -> Dependency Inversion.

1. Single Responsibility Principle
    - It states that a class should do one thing, and therefore it should have only a single reason to change.
    - Only one potential change in the software’s specification should be able to affect the specification of the class.

   Advantages of Single Responsibility Principle
    - It should be followed to not create Incompatible modules in the project , since different teams work on the same
      classes . which can lead to inconsistencies
    - Version Control Easier, we can see easier to look changes
    - Creating less Merge conflicts,fewer conflicts will appear – files will have a single reason to change, and
      conflicts that do exist will be easier to resolve.


2. Open/Closed Principle
    - classes should be open for extension and closed to modification.
    - Modification means changing the code of an existing class, and extension means adding new functionality.
    - It is usually done with the help of interfaces and abstract classes.


3. Liskov Substitution Principle
    - The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.
    - This means that, given that class B is a subclass of class A, we should be able to pass an object of class B to
      any method that expects an object of class A and the method should not give any weird output in that case.
    - This is the expected behavior, because when we use inheritance we assume that the child class inherits everything
      that the superclass has.
    - The child class extends the behavior but never narrows it down.
    - Therefore, when a class does not obey this principle, it leads to some nasty bugs that are hard to detect.


4. Interface Segregation Principle
    - Segregation means keeping things separated, and the Interface Segregation Principle is about separating the
      interfaces.
    - The principle states that many client-specific interfaces are better than one general-purpose interface.
    - Clients should not be forced to implement a function they do no need.


5. Dependency Inversion

    - our classes should depend upon interfaces or abstract classes instead of concrete classes and functions same as
      Open/Close principles
