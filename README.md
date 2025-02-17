# CodeDraw

CodeDraw is an easy-to-use drawing library where you use code to create pictures and animations.
It is made for beginners that understand little about programming
and makes it very simple to draw and animate various shapes and images to a canvas.

Read the [introduction to CodeDraw](https://github.com/Krassnig/CodeDraw/blob/master/INTRODUCTION.md)
for a beginners guide to CodeDraw.

The JavaDoc for CodeDraw can be found [here](https://krassnig.github.io/CodeDrawJavaDoc/).

For a C# version of CodeDraw go to the [CodeDrawProject repository](https://github.com/Krassnig/CodeDrawProject).

## How to install

Go to [releases](https://github.com/Krassnig/CodeDraw/releases) and download the newest CodeDraw.jar.

### Intellij

Open Intellij with the project where you would like to add CodeDraw. Click on **File > Project Structure...**.
Under **Project Settings** select **Libraries**.
At the top left click on the small **plus icon** and select the **Java** option.
Goto the downloaded CodeDraw.jar and select it and then press **OK**.
Now you can import CodeDraw with ```import codedraw.*;``` at the top of your Java files.

### Eclipse

Open Eclipse with the project where you would like to add CodeDraw. Right-click on your Project > **Properties > Java Build Path > Add External JARs...**
Go to the downloaded CodeDraw.jar and select it and then press **OK**.
Now you can import CodeDraw with ```import codedraw.*;``` at the top of your Java files.


## Examples

### Static Images

Here is a quick illustration on how CodeDraw works.

```java
import codedraw.*;

public class Main {
	public static void main(String[] args) {
		// Creates a new CodeDraw window with the size of 400x400 pixel
		CodeDraw cd = new CodeDraw(400, 400);

		// Sets the drawing color to red
		cd.setColor(Palette.RED);
		// Draws the outline of a rectangle
		cd.drawRectangle(100, 100, 200, 100);
		// Draws a filled Square
		cd.fillSquare(180, 150, 80);

		// Changes the color to light blue
		cd.setColor(Palette.LIGHT_BLUE);
		cd.fillCircle(300, 200, 50);

		// Finally, the method show must be called
		// to display the drawn shapes in the CodeDraw window.
		cd.show();
	}
}
```
# ❗ Don't forget to call .show() ❗

![static_image](https://user-images.githubusercontent.com/24553082/153450298-403d3adc-87f9-476e-82a4-48aeac21ec90.png)

### Animations

Animation can be created by repeatedly rendering different images and waiting after renders.

```java
import codedraw.*;

public class Main {
	public static void main(String[] args) {
		CodeDraw cd = new CodeDraw(400, 400);

		for (double sec = -Math.PI / 2; true; sec += Math.PI / 30) {
			// clears the entire canvas
			cd.clear();
			// draws the second hand
			cd.drawLine(200, 200, Math.cos(sec) * 100 + 200, Math.sin(sec) * 100 + 200);

			// draws the twelve dots
			for (double j = 0; j < Math.PI * 2; j += Math.PI / 6) {
				cd.fillCircle(Math.cos(j) * 100 + 200, Math.sin(j) * 100 + 200, 4);
			}

			// displays the drawn objects and waits 1 second
			cd.show(1000);
		}
	}
}
```

https://user-images.githubusercontent.com/24553082/153450395-71f69b67-9b86-4f16-b0b6-e88c85650391.mp4

### User Interaction

User interaction can be created with the EventScanner.
Events created by user interaction can be read from the EventScanner
with the has****() methods and next****() methods.
The EventScanner works similarly to the Scanner in Java.

```java
import codedraw.*;
import codedraw.events.*;

public class Main {
	public static void main(String[] args) {
		CodeDraw cd = new CodeDraw();
		EventScanner es = new EventScanner(cd);

		cd.drawText(200, 200, "Move your mouse over here.");
		cd.show();

		cd.setColor(Palette.RED);

		while (!es.isClosed()) {
			while (es.hasEventNow()) {
				if (es.hasMouseMoveEvent()) {
					MouseMoveEvent a = es.nextMouseMoveEvent();
					cd.fillSquare(a.getX() - 5, a.getY() - 5, 10);
				} else {
					es.nextEvent();
				}
			}

			cd.show(16);
		}
	}
}
```

https://user-images.githubusercontent.com/24553082/153450427-b9091fb7-3b1e-413b-b01e-6b89bf50d447.mp4
