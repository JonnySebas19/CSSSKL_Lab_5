import javax.swing.JFrame;
public class Window extends JFrame {

  public Window() {
      setSize(400,400);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

   public static void main (String[] args) {
      Window a = new Window();
      Window b = new Window();
    }
}

