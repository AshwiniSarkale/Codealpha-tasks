import javax.swing.*;
import java.awt.event.*;

public class WordCounter extends JFrame implements ActionListener {
    JLabel label;
    JTextArea textArea;
    JButton countButton;

    public WordCounter() {
        setTitle("Word Counter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        label = new JLabel("Enter your text:");
        label.setBounds(20, 20, 100, 20);
        add(label);

        textArea = new JTextArea();
        textArea.setBounds(20, 50, 250, 50);
        add(textArea);

        countButton = new JButton("Count Words");
        countButton.setBounds(100, 110, 100, 30);
        countButton.addActionListener(this);
        add(countButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) {
            String text = textArea.getText();
            int wordCount = countWords(text);
            JOptionPane.showMessageDialog(this, "Word Count: " + wordCount);
        }
    }

    private int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        new WordCounter();
    }
}