
package VIEW;

import javax.swing.*;
import java.awt.*;

public class FrmUtils {
    public static void centralizarFormulario(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int frameWidth = frame.getWidth();
        int frameHeight = frame.getHeight();

        int x = (screenWidth - frameWidth) / 2;
        int y = (screenHeight - frameHeight) / 2;

        frame.setLocation(x, y);
    }
}
    

