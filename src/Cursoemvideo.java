import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cursoemvideo extends JFrame{
    private JLabel lblMensagem;
    private JButton btnClick;
    private JPanel painelMenu;

    public Cursoemvideo() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensagem.setText("Olá, Mundo");
                //JOptionPane.showMessageDialog(btnClick, "Olá, Mundo!");

            }
        });
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cursoemvideo frame = new Cursoemvideo();
                frame.setContentPane(frame.painelMenu);
                frame.setTitle("Cursoemvideo");
                frame.setSize(400,400);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

    }
}
