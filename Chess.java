import java.awt.*;
import javax.swing.*;

public class Chess extends JPanel {
    private int toggle = 0;

    public Chess() {
        Timer timer = new Timer(1000, e -> {
            toggle = (toggle + 1) % 2; // Toggle between 0 and 1
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int size = 50; // Square size
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boolean isBlack = ((i + j + toggle) % 2 == 0);
                g.setColor(isBlack ? Color.BLACK : Color.WHITE);
                g.fillRect(j * size, i * size, size, size);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animated ChessBoard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new Chess());
        frame.setVisible(true);
    }
}
