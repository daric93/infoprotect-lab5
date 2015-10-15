/*
 * Created by JFormDesigner on Wed Oct 14 17:07:08 EEST 2015
 */

package infoprotect.lab5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Objects;

/**
 * @author unknown
 */
public class AskPasswordDialog extends JDialog {
    private final Sys sys;

    public AskPasswordDialog(Frame owner, Sys sys) {
        super(owner);
        this.sys = sys;
        initComponents();
    }

    public AskPasswordDialog(Dialog owner, Sys sys) {
        super(owner);
        this.sys = sys;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Darya Koreneva
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        userNameTextField = new JTextField();
        label2 = new JLabel();
        passwordField1 = new JPasswordField();
        messegeLabel = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        userPanel = new JPanel();

        //======== this ========
        setModal(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                            "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                            java.awt.Color.red), dialogPane.getBorder()));
            dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("border".equals(e.getPropertyName())) throw new RuntimeException();
                }
            });

            dialogPane.setLayout(new GridBagLayout());
            ((GridBagLayout) dialogPane.getLayout()).columnWidths = new int[]{0, 0};
            ((GridBagLayout) dialogPane.getLayout()).rowHeights = new int[]{0, 0, 0, 0};
            ((GridBagLayout) dialogPane.getLayout()).columnWeights = new double[]{1.0, 1.0E-4};
            ((GridBagLayout) dialogPane.getLayout()).rowWeights = new double[]{0.0, 1.0, 0.0, 1.0E-4};

            //======== contentPanel ========
            {
                contentPanel.setLayout(new GridBagLayout());
                ((GridBagLayout) contentPanel.getLayout()).columnWidths = new int[]{0, 0, 0};
                ((GridBagLayout) contentPanel.getLayout()).rowHeights = new int[]{0, 0, 0, 0};
                ((GridBagLayout) contentPanel.getLayout()).columnWeights = new double[]{0.0, 1.0, 1.0E-4};
                ((GridBagLayout) contentPanel.getLayout()).rowWeights = new double[]{0.0, 0.0, 1.0, 1.0E-4};

                //---- label1 ----
                label1.setText("User name:");
                contentPanel.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                contentPanel.add(userNameTextField, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                //---- label2 ----
                label2.setText("Password:");
                label2.setHorizontalAlignment(SwingConstants.RIGHT);
                contentPanel.add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                contentPanel.add(passwordField1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));
                contentPanel.add(messegeLabel, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(contentPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout) buttonBar.getLayout()).columnWidths = new int[]{0, 85, 80};
                ((GridBagLayout) buttonBar.getLayout()).columnWeights = new double[]{1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));

            //======== userPanel ========
            {
                userPanel.setLayout(new GridBagLayout());
                ((GridBagLayout) userPanel.getLayout()).rowHeights = new int[]{0, 0};
                ((GridBagLayout) userPanel.getLayout()).rowWeights = new double[]{1.0, 1.0E-4};
            }
            dialogPane.add(userPanel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(465, 200);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        okButton.addActionListener((v) -> {
            String userName = userNameTextField.getText();
            String password = new String(passwordField1.getPassword());
            User user = sys.getUserByName(userName);
            if (user != null) {
                if (password.equals(user.getPassword())) {
                    if (Objects.equals(user.getPassword(), "empty")) {
                        //NewPassword
                        NewPassword newPassword = new NewPassword((Dialog) null, user, sys);
                        newPassword.setVisible(true);
                        this.setVisible(false);
                    } else {
                        if (Objects.equals(user.getName(), "admin")) {
                            //AdminPanel
                            userPanel.add(new AdminPanel(user, sys));
                            cancelButton.setEnabled(false);
                            okButton.setEnabled(false);
                            userNameTextField.setEnabled(false);
                            passwordField1.setEnabled(false);
                            dialogPane.repaint();
                            contentPane.revalidate();
                        } else {//UserPanel
                            userPanel.add(new UserPanel(user));
                            cancelButton.setEnabled(false);
                            okButton.setEnabled(false);
                            userNameTextField.setEnabled(false);
                            passwordField1.setEnabled(false);
                            dialogPane.repaint();
                            contentPane.revalidate();
                        }
                    }
                } else {
                    messegeLabel.setText("Wrong password");
                }
            } else messegeLabel.setText("No such user");
        });
        cancelButton.addActionListener((v) -> dispose());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Darya Koreneva
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField userNameTextField;
    private JLabel label2;
    private JPasswordField passwordField1;
    private JLabel messegeLabel;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel userPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
