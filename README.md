# NumberHelper
The Numbers

When the program is launched, the main method in GUI.java creates an object of the GUI.java class. This object displays all of the UI components on screen for the user.
Initially, the user can only see a window which prompts them to choose a user level. Once a level is chose, the initial window is hidden and the main window of the app is made visible.
If the user chose to be a Basic user, then the main window will disable the button for advanced features. If the user chose to be an advanced user, the main window leaves this button enabled.

The many buttons on the UI, when pressed, append their symbols into a text area on the interface. When the "=" button is clicked, the contents of this text area are passed to the Calculation.java class as a String, and the text area is cleared.
When that String is recieved by Calculation.java, it is parsed for keywords such as " + ", " / ", or "sin". Depending on which keywords are found, Calculation.java then parses the String for numbers on which to operate, and performs the correct calculation.
Once an answer is determined, Calculation.java passes that answer back to GUI.java, and the answer is appended into the text area in the GUI for the user to see.

Class Diagram:


![class3](https://user-images.githubusercontent.com/90457870/183232438-85fc3e88-eefa-4106-858d-32b91494216d.png)

Use Case Diagram:

![usecase](https://user-images.githubusercontent.com/90457870/183232447-729a3436-a066-486e-87bc-b46a16e71262.png)

Sequence Diagram:

![sequence2](https://user-images.githubusercontent.com/90457870/183232456-d85dc1a2-93cd-4f3e-81de-5f52e2ce2044.png)

State Diagram:

![state2](https://user-images.githubusercontent.com/90457870/183232467-32660b04-13f2-408c-adb7-7b55c49e1413.png)
