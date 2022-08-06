# NumberHelper
The Numbers

When the program is launched, the main method in GUI.java creates an object of the GUI.java class. This object displays all of the UI components on screen for the user.
Initially, the user can only see a window which prompts them to choose a user level. Once a level is chose, the initial window is hidden and the main window of the app is made visible.
If the user chose to be a Basic user, then the main window will disable the button for advanced features. If the user chose to be an advanced user, the main window leaves this button enabled.

The many buttons on the UI, when pressed, append their symbols into a text area on the interface. When the "=" button is clicked, the contents of this text area are passed to the Calculation.java class as a String, and the text area is cleared.
When that String is recieved by Calculation.java, it is parsed for keywords such as " + ", " / ", or "sin". Depending on which keywords are found, Calculation.java then parses the String for numbers on which to operate, and performs the correct calculation.
Once an answer is determined, Calculation.java passes that answer back to GUI.java, and the answer is appended into the text area in the GUI for the user to see.
