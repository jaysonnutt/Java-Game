import javax.swing.JFrame;

public class Game {
	public static void main(String[] args) {
		JFrame window = new JFrame("Galaga (Kinda)");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);

		window.setContentPane(new GamePanel());

		window.pack();
		window.setVisible(true);
	}
}
