import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GiaoVu extends JFrame {
    private JPanel panelGiaoVu;
    private JTable subjectTable;
    private JButton btnAddSubject;
    private JButton btnDeleteSubject;
    private JButton btnStudentList;
    private JButton btnDetail;

    public GiaoVu() {
        setTitle("Admin");
        setContentPane(panelGiaoVu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void createUIComponents() {
        //String[][] data = {{"1", "abc", "t3"}, {"1", "abc", "t3"};
        String[] columnNames = { "Mã môn", "Tên môn", "Thời khóa biểu"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        subjectTable = new JTable(model);
    }
}
