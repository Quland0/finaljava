import javax.swing.*;

public class MallForm extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JSpinner spinner1;
    private JRadioButton YesRadioButton;
    private JRadioButton NoRadioButton;
    private JButton SendButton;
    private JPanel MallWindow;

    public MallForm(){
        super("Торговый центр");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(MallWindow);
    }
}
