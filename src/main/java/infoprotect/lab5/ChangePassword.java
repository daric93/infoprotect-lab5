/*
 * Created by JFormDesigner on Wed Oct 14 21:38:08 EEST 2015
 */

package infoprotect.lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * @author Darya Koreneva
 */
public class ChangePassword extends JDialog {
    User user;

    public ChangePassword(User user) {
        this.user = user;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Darya Koreneva
        oldPasswordField = new JLabel();
        oldPassword = new JPasswordField();
        newPasswordField = new JLabel();
        newPassword = new JPasswordField();
        repeatPasswordField = new JLabel();
        repeatPassword = new JPasswordField();
        errorLabel = new JLabel();
        panel1 = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout) contentPane.getLayout()).columnWidths = new int[]{0, 0, 0};
        ((GridBagLayout) contentPane.getLayout()).rowHeights = new int[]{0, 0, 0, 0, 0, 0};
        ((GridBagLayout) contentPane.getLayout()).columnWeights = new double[]{0.0, 1.0, 1.0E-4};
        ((GridBagLayout) contentPane.getLayout()).rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- oldPasswordField ----
        oldPasswordField.setText("Old password:");
        oldPasswordField.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(oldPasswordField, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(oldPassword, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- newPasswordField ----
        newPasswordField.setText("New password:");
        newPasswordField.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(newPasswordField, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(newPassword, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- repeatPasswordField ----
        repeatPasswordField.setText("Repeat password:");
        repeatPasswordField.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(repeatPasswordField, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(repeatPassword, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));
        contentPane.add(errorLabel, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                            "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                            java.awt.Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("border".equals(e.getPropertyName())) throw new RuntimeException();
                }
            });

            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout) panel1.getLayout()).rowHeights = new int[]{0, 0};
            ((GridBagLayout) panel1.getLayout()).rowWeights = new double[]{0.0, 1.0E-4};

            //---- okButton ----
            okButton.setText("Ok");
            panel1.add(okButton, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

            //---- cancelButton ----
            cancelButton.setText("Cancel");
            panel1.add(cancelButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 0), 0, 0));
        setSize(400, 150);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        okButton.addActionListener((v) -> {
            String oldP = new String(oldPassword.getPassword());
            String newP = new String(newPassword.getPassword());
            String repP = new String(repeatPassword.getPassword());
            if (Objects.equals(user.getPassword(), oldP)) {
                if (Objects.equals(newP, repP)) {
                    user.setPassword(newP);
                    dispose();
                } else {
                    errorLabel.setText("Passwords isn't equal");
                    newPassword.setText("");
                    repeatPassword.setText("");
                }
            } else {
                oldPassword.setText("");
                errorLabel.setText("Wrong password");
            }
        });
        cancelButton.addActionListener((v) -> {
            this.dispose();
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Darya Koreneva
    private JLabel oldPasswordField;
    private JPasswordField oldPassword;
    private JLabel newPasswordField;
    private JPasswordField newPassword;
    private JLabel repeatPasswordField;
    private JPasswordField repeatPassword;
    private JLabel errorLabel;
    private JPanel panel1;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
