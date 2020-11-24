import javax.swing.*; // give me all classes from swing
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class TicTacToe extends JFrame {

    private JButton[] buttons;

    public TicTacToe() {
        super.setSize(800, 600);
        super.setTitle("Tic Tac Toe");
        // by default, if a window closes, the program still runs
        // when the window is closed, stop the program
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPanel();
        // by default, windows are invisible
        super.setVisible(true);
    }

    public boolean HasXWon() {
        // Check horizontally
        // This really sucks :(
        try {
            if (buttons[0].getText().equals("X") && buttons[1].getText().equals("X") && buttons[2].getText().equals("X")) {
                return true;
            } else if (buttons[3].getText().equals("X") && buttons[4].getText().equals("X") && buttons[5].getText().equals("X")) {
                return true;
            } else if (buttons[6].getText().equals("X") && buttons[7].getText().equals("X") && buttons[8].getText().equals("X")) {
                return true;
            }
            // Check vertically
            else if (buttons[0].getText().equals("X") && buttons[3].getText().equals("X") && buttons[6].getText().equals("X")) {
                return true;
            } else if (buttons[1].getText().equals("X") && buttons[4].getText().equals("X") && buttons[7].getText().equals("X")) {
                return true;
            } else if (buttons[2].getText().equals("X") && buttons[5].getText().equals("X") && buttons[8].getText().equals("X")) {
                return true;
            }
            // Check diagonally
            else if (buttons[0].getText().equals("X") && buttons[4].getText().equals("X") && buttons[8].getText().equals("X")) {
                return true;
            } else
                return buttons[2].getText().equals("X") && buttons[4].getText().equals("X") && buttons[6].getText().equals("X");
        } catch (NullPointerException e) {
            // do nothing
            return false;
        }
    }

    public boolean HasOWon() {
        // Check horizontally
        // This really sucks :(
        try {
            if (buttons[0].getText().equals("O") && buttons[1].getText().equals("O") && buttons[2].getText().equals("O")) {
                return true;
            } else if (buttons[3].getText().equals("O") && buttons[4].getText().equals("O") && buttons[5].getText().equals("O")) {
                return true;
            } else if (buttons[6].getText().equals("O") && buttons[7].getText().equals("O") && buttons[8].getText().equals("O")) {
                return true;
            }
            // Check vertically
            else if (buttons[0].getText().equals("O") && buttons[3].getText().equals("O") && buttons[6].getText().equals("O")) {
                return true;
            } else if (buttons[1].getText().equals("O") && buttons[4].getText().equals("O") && buttons[7].getText().equals("O")) {
                return true;
            } else if (buttons[2].getText().equals("O") && buttons[5].getText().equals("O") && buttons[8].getText().equals("O")) {
                return true;
            }
            // Check diagonally
            else if (buttons[0].getText().equals("O") && buttons[4].getText().equals("O") && buttons[8].getText().equals("O")) {
                return true;
            } else
                return buttons[2].getLabel().equals("O") && buttons[4].getText().equals("O") && buttons[6].getText().equals("O");
        } catch (NullPointerException e) {
            // do nothing
            return false;
        }
    }

    public boolean HasNobodyWon() {
        for (JButton button : buttons) {
            if (button.getText().isEmpty()) {
                return false;
            }
        }

        return true;
    }

    public void newGame() {
        for (JButton button : buttons) {
            button.setText("");
        }
    }

    private void buildPanel() {
        GridLayout layout = new GridLayout(3, 3);
        super.setLayout(layout);

        AtomicInteger counter = new AtomicInteger();
        ActionListener myListener = event -> {
            String label = event.getActionCommand();
            JButton button = (JButton) event.getSource();
            if (label.equals("")) {
                if (counter.get() % 2 == 0) {
                    button.setText("X");
                } else {
                    button.setText("O");
                }
                counter.getAndIncrement();
            }

            if (HasXWon()) {
                JOptionPane.showMessageDialog(null, "X wins!" + "\n Resetting...");
                newGame();
            } else if (HasOWon()) {
                JOptionPane.showMessageDialog(null, "O wins!" + "\n Resetting...");
                newGame();
            } else if (HasNobodyWon()) {
                JOptionPane.showMessageDialog(null, "Cat's game" + "\n Resetting...");
                newGame();
            }
        };

        // make an array of 9 JButtons
        JButton[] buttons = new JButton[9];
        this.buttons = buttons;
        for (int x = 0; x < buttons.length; x++) {
            buttons[x] = new JButton();
            super.add(buttons[x]);
            buttons[x].addActionListener(myListener);
        }

    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
    }
}
