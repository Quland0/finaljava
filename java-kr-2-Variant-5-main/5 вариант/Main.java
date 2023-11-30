import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        first mainWindow = new first();
        MallForm mallwindow = new MallForm();

        mainWindow.pack();

        mainWindow.setVisible(true);

        mainWindow.setLocationRelativeTo(null);

        mallwindow.pack();

        mallwindow.setVisible(false);

        mallwindow.setLocationRelativeTo(null);

    }
}

