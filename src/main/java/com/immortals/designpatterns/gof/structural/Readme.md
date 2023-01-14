<h3 xmlns="http://www.w3.org/1999/html"> Describe The Structural Design Patterns  </h3>

<div class = "adapter">

<h4> 1. Structural Pattern : Adapter Pattern</h4>
<ul>
  <li>Acts as intermediate for converting  incompatible interface to what is expected from client interface </li>
  <li>wraps an existing class with a new interface so that it becomes compatible with the client’s interface.</li>
</ul>
 <div>
<h6>When To Use  </h6>
<ul class="usage">
<li>When an outside component provides captivating functionality that we'd like to reuse, but it's incompatible with our current application.</li>
<li>A suitable Adapter can be developed to make them compatible with each other</li>
<li>When our application is not compatible with the interface that our client is expecting</li>
<li>When we want to reuse legacy code in our application without making any modification in the original code</li>
</ul>
</div>
<div>
<h6>Use Case Example </h6>
<p class="use case">
   let say we have currency conversion app , which converts INR to USD , now a client needs Conversion to happen in POUND . To solve this problem we would have adapter which converts the currency and provides the result. 
</p>
<h6>Realtime Use Cases :JDK framework </h6>
    <ol class="real time use case">
      <li>Arrays.asList() Method to Convert Arrays to List</li>
      <li>NIO Framework uses adapter pattern . for example :  InputStreamReader input = new InputStreamReader(new FileInputStream("input.txt"));</li>
    </ol>
</div>
</div>

<div class="Bridge">
<h4>2. Structural Pattern : Bridge Pattern</h4>
<ul>
 <li>To decouple an abstraction from its implementation so that the two can vary independently.This means to create a bridge interface that uses OOP principles to separate out responsibilities into different
abstract classes.</li>
</ul>

<div>
<h6>When To Use </h6>
<ul class="usage">
<li>When we want a parent abstract class to define the set of basic rules, and the concrete classes to add additional rules</li>
<li>When we have an abstract class that has a reference to the objects, and it has abstract methods that will be defined in each of the concrete classes</li>
</ul>
</div>

<div>
<h6>Use Case Example </h6>
<p class="use case">
  lets say we have , to create a shape and need to fill it with the specified color , then we have to abstracted two classes one shape which is being created and color which needs to be filled. 
</p>
<p>
  Another, one is creating a notification service. 
</p>
<h6>Realtime Use Cases : JDK framework</h6>
<ol class="real time use case">
  <li>The JDBC API. It acts as a link between the database such as Oracle, MySQL, and PostgresSQL, and their particular implementations.</li>
<li>The JDBC API is a set of standard interfaces such as Driver, Connection, and ResultSet, to name a few. This enables different database vendors to have their separate implementations.</li>
</ol>
</div>

</div>


<div class = "composite">

<h4> 3. Structural Pattern : Composite Pattern</h4>
<ul>
 <li>to compose objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly.</li>
</ul>
<p>We can break the pattern down into:</p>
<ol>
<li>component – is the base interface for all the objects in the composition. It should be either an interface or an abstract class with the common methods to manage the child composites.</li>
<li>leaf – implements the default behavior of the base component. It doesn't contain a reference to the other objects.</li>
<li>composite – has leaf elements. It implements the base component methods and defines the child-related operations.</li>
<li>client – has access to the composition elements by using the base component object.</li>
</ol>
<div>
<h6>When To Use  </h6>
<ul class="usage">
<li>you want to represent part-whole hierarchies of objects.</li>
<li>you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly.</li>
</ul>
</div>
<div>
<h6>Use Case Example </h6>
<p class="use case">
  build a hierarchical structure for Departments in the college for Btech, degree such as CSE , ECE , mechanical , chemical and civil .
</p>
<h6>Realtime Use Cases :JDK framework </h6>
    <ol class="real time use case">
       <li>Nested containers in AWT/Swing are great examples of usages of the composite pattern in core Java.</li>
    </ol>
</div>
</div>

<div class = "decorator">

<h4> 4. Structural Pattern : Decorator Pattern</h4>
<ul>
<li> Decorator pattern is used to add additional responsibility/ functionality to existing behaviour of an object without altering its original structure. </li>
<li>
This pattern creates a decorator class which is wrapper to the existing class and provides additional functionality keeping class methods signature intact.
</li>
<li>More than just inheritance (you are controlling which pieces complement your object, not necessarily trying to override it, like with inheritance);</li>
</ul>
<div>
<h6>When To Use  </h6>
<ul class="usage">
<li>when we want to enhance the behavior of an object without modifying the original object itself</li>
</ul>
</div>

<div>
<h6>Use Case Example </h6>
<p class="use case"></p>
  <li>created an application that at some point should notify users via email about something.</li>
  <li>Simple Sandwich Creation Example</li>
<h6>Realtime Use Cases :JDK framework </h6>
<ol class="real time use case">
<li>BufferedInputStream is decorating the FileInputStream to add the capability to buffer the input.</li>
</ol>
 <div class="d-inline-flex p-2 bd-highlight">
    <pre>
        <code class="csharp rounded  shadow-sm p-3 mb-5">
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("test.txt")));
                while (bis.available() > 0) {
                    char c = (char) bis.read();
                    System.out.println("Char: " + c);
                }
        </code>
    </pre>
</div>

</div>
</div>
