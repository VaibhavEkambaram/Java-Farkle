import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GraphicalInterface extends JFrame {
    public GraphicalInterface() {
        super("Farkle");

        setInterfaceTheme();

        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));

        this.setJMenuBar(createMenuBar());
        this.getContentPane().add(createGamePanel());


        setLocationByPlatform(true);
        pack();
        setVisible(true);
    }


    private void setInterfaceTheme() {
        // Set java swing theme to native operating system theme
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    public JMenuBar createMenuBar() {
        JMenuBar menu = new JMenuBar();
        menu.add(new JMenu("Game"));
        menu.add(new JMenu("Options"));
        menu.add(new JMenu("Help"));
        return menu;
    }

    public JPanel createGamePanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.RED);
        buttonPanel.setPreferredSize(new Dimension((int) (this.getWidth() * 0.25), this.getHeight()));
        mainPanel.add(buttonPanel, BorderLayout.LINE_START);

        JPanel gamePanel = new JPanel();
        gamePanel.setBackground(Color.GREEN);
        mainPanel.add(gamePanel, BorderLayout.CENTER);


        JPanel informationPanel = new JPanel();
        informationPanel.setBackground(Color.BLUE);
        informationPanel.setPreferredSize(new Dimension(this.getWidth(), (int) (this.getHeight() * 0.225)));
        mainPanel.add(informationPanel, BorderLayout.PAGE_END);

        informationPanel.setLayout(new BorderLayout());


        JPanel innerPanel = new JPanel(new GridLayout(1,2));
        innerPanel.add(new JPanel());
        innerPanel.add(new JPanel());

        informationPanel.add(innerPanel,BorderLayout.CENTER);

        JTextPane informationTextPanel = new JTextPane();
        informationTextPanel.setEditable(false);
        informationTextPanel.setText("Hello and Welcome to Farkle!");
        informationPanel.add(informationTextPanel,BorderLayout.PAGE_END);

        return mainPanel;
    }
}

