# Convertor-using-Design-Patterns
The document you provided appears to be a detailed assignment or project related to the application of design patterns in a software system. Let me break it down into Part 1 and Part 2 for a clearer understanding:

Part 1: Understanding and Implementing Design Patterns
In Part 1, the focus is on understanding and implementing two specific design patterns: the Chain of Responsibility and the Decorator pattern. Here's a simple explanation of each:

Chain of Responsibility Pattern:

What It Is: This pattern is used to pass a request along a chain of handlers. Each handler decides either to process the request or to pass it to the next handler in the chain.
In Your Project: You would use this pattern to handle different types of length conversions (like kilometers to miles, yards, or feet). Each conversion could be a 'handler' in the chain.
Decorator Pattern:

What It Is: This pattern is used to add new functionalities to objects dynamically without altering their structure. This is achieved by creating a set of decorator classes that wrap the original class.
In Your Project: This could be used to format the output of the length conversions. For example, you could have decorators for adding units, formatting the number, or displaying the result in different ways.

Part 2: Implementing the GUI
In Part 2, the focus shifts to the graphical user interface (GUI) aspect of your project. Here, you are expected to create a user interface that allows users to interact with your length conversion system. The key points are:

Creating the Interface: Using Java libraries like javax.swing and java.awt, you need to create an interface where users can input the length in kilometers and select the unit they want to convert it to (miles, yards, or feet).

Integrating the Patterns with GUI: The Chain of Responsibility and Decorator patterns implemented in Part 1 need to be integrated into the GUI. This means when a user inputs data and requests a conversion, your program should use these patterns to process the request and display the result in the GUI.

User Interaction: The GUI should be intuitive, allowing users to easily enter data, select conversion options, and view the converted values.
