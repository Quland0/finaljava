import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;


public class first extends JFrame{
    private JButton MallButton;
    private JButton ToiletButton;
    private JButton ShopButton;
    private JButton EventButton;
    private JButton ParkingButton;
    private JButton EmployessButton;
    private JPanel MainWindow;


    public first(){
        super("Торговый центр");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(MainWindow);
        MallButton.addActionListener(e -> {
            MainWindow.setVisible(false);
            MallWindow.setVisible(true);
        });

    }


}
