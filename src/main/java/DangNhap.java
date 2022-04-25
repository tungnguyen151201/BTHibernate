import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DangNhap extends JFrame{
    private JLabel lbl_user;
    private JLabel lbl_pwd;
    private JTextField txtUser;
    private JPasswordField txtPwd;
    private JButton btnLogin;
    private JPanel panelDangNhap;
    public static JFrame frame;
    public DangNhap() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtUser.getText().equals("admin") && txtPwd.getText().equals("admin")) {
                    frame.dispose();
                    new GiaoVu();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid login!!!");
                }
            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("Login");
        frame.setContentPane(new DangNhap().panelDangNhap);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
