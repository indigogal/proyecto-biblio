import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

import models.libro;

public class Main {
  public static void main(String[] args) {
    try {
      DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory();
      Screen screen = terminalFactory.createScreen();
      screen.startScreen();
    } catch (Exception err) {
      System.out.println("Error initializing TUI");
      System.out.println(err);
      System.exit(1);
    }
  }
}
