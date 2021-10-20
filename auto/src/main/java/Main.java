import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.im.InputContext;

public class Main {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            System.out.println("Start robot !");

            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);

            robot.delay(1000);

            System.out.println("Mouse move");

            robot.mouseMove(110,609);

            System.out.println("Mouse moved");

            InputContext context = InputContext.getInstance();

            System.out.println(context.getInputMethodControlObject());

//            while (true) {

                var m = MouseInfo.getPointerInfo().getLocation();

                System.out.println(m.x);
                System.out.println(m.y);
                robot.delay(2000);
//            }


            KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
                @Override
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    System.out.println(keyEvent.getKeyCode());
                    return false;
                }
            });

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
