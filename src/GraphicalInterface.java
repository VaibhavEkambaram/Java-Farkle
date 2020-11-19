import javax.swing.*;
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

        JPanel informationPanel = new JPanel();
        informationPanel.setBackground(Color.RED);
        informationPanel.setPreferredSize(new Dimension((int) (this.getWidth() * 0.25), this.getHeight()));
        mainPanel.add(informationPanel, BorderLayout.LINE_START);

        JPanel gamePanel = new JPanel();
        gamePanel.setBackground(Color.GREEN);
        mainPanel.add(gamePanel, BorderLayout.CENTER);


        JPanel textInformationPanel = new JPanel();
        textInformationPanel.setBackground(Color.BLUE);
        textInformationPanel.setPreferredSize(new Dimension(this.getWidth(), (int) (this.getHeight() * 0.2)));
        mainPanel.add(textInformationPanel, BorderLayout.PAGE_END);
        return mainPanel;
    }
}

