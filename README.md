A. Project Overview
• Purpose and description of the Vehicle Management System
• Summary of inheritance, composition, and abstraction usage
B. Class Hierarchy
• Explanation of the superclass and subclasses
• Description of overridden methods
• Explanation of access modifiers used
C. Instructions to Compile and Run
Example:
javac *.java
java Main
D. Screenshots
• Program output demonstrating correct behavior of vehicles and drivers
E. Reflection Section
Write 1–2 paragraphs discussing:
• How inheritance simplified the design
• How method overriding helped customize behavior
• Challenges faced when using protected and default access modifiers

A. Project Overview

Purpose of the Vehicle Management System is to make it easier to manage vehicles by connecting them via their common characteristics. 
Inheritance was used by connecting vehicles to the class Vehicle. 
Composition was done with every Vehicle object having a Driver object. 
Abstraction was used by making Vehicle class abstract and it having 2 abstract startEngine and stopEngine functions.
-------------------
B. Class Hierarchy

Superclass - Vehicle, subclasses - Car, Motorcycle, Truck. 
Vehicle superclass had fields like brand, year and also driver and to it car, motorcycle, truck subclasses were connecting and possessing these fields too. 
Vehicle also had a displayinfo method that worked on subclasses.

Overridden methods in this case were abstract methods startEngine() and stopEngine(). Each subclass had its own implementation of this method that allowed this same method to work differently on each class

Access modifiers: *protected* was used in Vehicle so that only subclasses could use those fields. *private* is used to protect data. *public* used for methods so that everything can access it.
-----------------------
C. Instructions to run
1. install java
2. install this project and open a terminal in this directory.
3. run these commands:
   1. javac *.java
   2. java Main
-------------------
D. Reflection
Inheritance simplified the design by allowing to define shared vehicle fields and methods only once, making it easier to read and more accessible. 
Especially it will help if there is ever a need to add a new vehicle as it will be possible to just connect it to the superclass.
Method overriding helped with changing behavior of a method for each vehicle type while also making it the same method for each subclass.
Using *protected* access modifier can be dangerous because it will be possible to leak the data.

