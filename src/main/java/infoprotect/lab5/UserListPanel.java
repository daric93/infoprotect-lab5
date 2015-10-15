/*
 * Created by JFormDesigner on Wed Oct 14 20:35:18 EEST 2015
 */

package infoprotect.lab5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.Map;

/**
 * @author Darya Koreneva
 */
public class UserListPanel extends JDialog {
    private Sys sys;

    public UserListPanel(Sys sys) {
        this.sys = sys;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Darya Koreneva
        scrollPane1 = new JScrollPane();
        userTable = new JTable();
        newUserNameLabel = new JLabel();
        newUserNameTextField = new JTextField();
        addButton = new JButton();
        cancelButton = new JButton();
        addUserButton = new JButton();
        deleteUserButton = new JButton();
        blockButton = new JButton();
        unblockButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout) contentPane.getLayout()).columnWidths = new int[]{0, 0, 0, 0, 0, 0};
        ((GridBagLayout) contentPane.getLayout()).rowHeights = new int[]{0, 0, 0, 0};
        ((GridBagLayout) contentPane.getLayout()).columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout) contentPane.getLayout()).rowWeights = new double[]{1.0, 0.0, 0.0, 1.0E-4};

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(userTable);
        }
        contentPane.add(scrollPane1, new GridBagConstraints(0, 0, 5, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- newUserNameLabel ----
        newUserNameLabel.setText("New user name:");
        newUserNameLabel.setVisible(false);
        newUserNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(newUserNameLabel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

        //---- newUserNameTextField ----
        newUserNameTextField.setVisible(false);
        contentPane.add(newUserNameTextField, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

        //---- addButton ----
        addButton.setText("Add");
        addButton.setVisible(false);
        contentPane.add(addButton, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

        //---- cancelButton ----
        cancelButton.setText("Cancel");
        cancelButton.setVisible(false);
        contentPane.add(cancelButton, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- addUserButton ----
        addUserButton.setText("Add user");
        contentPane.add(addUserButton, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

        //---- deleteUserButton ----
        deleteUserButton.setText("Delete user");
        contentPane.add(deleteUserButton, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

        //---- blockButton ----
        blockButton.setText("Block");
        contentPane.add(blockButton, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

        //---- unblockButton ----
        unblockButton.setText("Unblock");
        contentPane.add(unblockButton, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        setSize(560, 335);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents


        setData(sys.userMap);
        addUserButton.addActionListener((v) -> {
            newUserNameLabel.setVisible(true);
            newUserNameTextField.setVisible(true);
            addButton.setVisible(true);
            cancelButton.setVisible(true);
        });
        addButton.addActionListener((v) -> {
            String newUserName = newUserNameTextField.getText();
            sys.userMap.put(newUserName, new User(newUserName, ""));
            setData(sys.userMap);
            newUserNameLabel.setVisible(false);
            newUserNameTextField.setVisible(false);
            addButton.setVisible(false);
            cancelButton.setVisible(false);
        });
        cancelButton.addActionListener((v) -> {
            newUserNameLabel.setVisible(false);
            newUserNameTextField.setVisible(false);
            addButton.setVisible(false);
            cancelButton.setVisible(false);
        });
        deleteUserButton.addActionListener((v) -> {
            Object valueAt = userTable.getValueAt(userTable.getSelectedRow(), userTable.getSelectedColumn());
            sys.userMap.remove(valueAt);
            setData(sys.userMap);

        });
        blockButton.addActionListener((v) -> {
            Object valueAt = userTable.getValueAt(userTable.getSelectedRow(), userTable.getSelectedColumn());
            User user = sys.getUserByName(valueAt.toString());
            user.setBlocked(true);
            setData(sys.userMap);
        });
        unblockButton.addActionListener((v) -> {
            Object valueAt = userTable.getValueAt(userTable.getSelectedRow(), userTable.getSelectedColumn());
            User user = sys.getUserByName(valueAt.toString());
            user.setBlocked(false);
            setData(sys.userMap);
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Darya Koreneva
    private JScrollPane scrollPane1;
    private JTable userTable;
    private JLabel newUserNameLabel;
    private JTextField newUserNameTextField;
    private JButton addButton;
    private JButton cancelButton;
    private JButton addUserButton;
    private JButton deleteUserButton;
    private JButton blockButton;
    private JButton unblockButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void setData(Map<String, User> users) {
        String[] columns = {"Name", "Block"};
        Object[][] list = new Object[users.size()][2];

        User[] userArray = users.values().stream().toArray(User[]::new);
        for (int i = 0; i < userArray.length; i++) {
            list[i][0] = userArray[i].getName();
            list[i][1] = userArray[i].getBlock();
        }

        TableModel tableModel = new DefaultTableModel(list, columns);
        userTable.setModel(tableModel);
    }
}
