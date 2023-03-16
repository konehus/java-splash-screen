# Java Splash Screen Demo

This demo showcases how to implement a splash screen in a Java application. A splash screen is a graphical image that appears while the application is loading, providing a more pleasant user experience during the application's startup process. It can also be used as an advertising tool to promote your application or brand.

## How to Run the Demo

1. Ensure you have Java and the Java Development Kit (JDK) installed on your system. You can check this by running `java -version` and `javac -version` in your terminal.
2. Download or clone this repository to your local machine.
3. Open a terminal and navigate to the root folder of the project.
4. Compile the Java source code using the appropriate command in your terminal.
	```bash
	javac -d bin src/com/example/Main.java
	```
5. Package the compiled Java code into a JAR file using the appropriate command in your terminal.
6. Download the `splash-image.png` file from this repository and save it to your local machine.
7. Run the application with the appropriate command in your terminal to launch the JAR file with the splash screen.

## Customizing the Splash Screen

To use a custom splash screen for your own Java application:

1. Create or select an image file to use as your splash screen (GIF, JPEG, or PNG formats are supported).
2. Add the `-splash` option with the path to your chosen image file to your `java` command when launching your application.
3. Package your Java application into a JAR file, and ensure that the `Main-Class` attribute is specified in the `MANIFEST.MF` file.
