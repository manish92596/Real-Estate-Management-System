import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Searchpropertytable extends JFrame {
   JButton agent_det;
   Searchpropertytable() {
        this.setTitle("Property_Details");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // get screen size
       // this.setLayout(null);
       this.setSize(2440,2440);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        this.getContentPane().add(panel);

        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(scrollPane);
       
        agent_det = new JButton("contact area agent");
        panel.add(agent_det);

        // String url = "jdbc:mysql://localhost:3306/practice_join";
        // String user = "root";
        // String password = "ABHI@singh1301";

        // try {
        //     Connection connection = DriverManager.getConnection(url, user, password);
        //     Statement statement = connection.createStatement();
        //     ResultSet resultSet = statement.executeQuery("SELECT * FROM property");
        //     ResultSetMetaData metaData = resultSet.getMetaData();
        //     int columnCount = metaData.getColumnCount();
        //     for (int i = 1; i <= columnCount; i++) {
        //         tableModel.addColumn(metaData.getColumnName(i));
        //     }
        //     while (resultSet.next()) {
        //         Object[] row = new Object[columnCount];
        //         for (int i = 1; i <= columnCount; i++) {
        //             row[i - 1] = resultSet.getObject(i);
        //         }
        //         tableModel.addRow(row);
        //     }
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        table.setPreferredScrollableViewportSize(new Dimension(1500, 1470));
      this.pack();
        this.setVisible(true);
    }




    public static void main(String[] args) {
        new Searchpropertytable();
    }
}