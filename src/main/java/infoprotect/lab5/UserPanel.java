/*
 * Created by JFormDesigner on Wed Oct 14 21:33:52 EEST 2015
 */

package infoprotect.lab5;

import javax.swing.*;
import java.awt.*;

/**
 * @author Darya Koreneva
 */
public class UserPanel extends JPanel {
    User user;

    public UserPanel(User user) {
        this.user = user;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Darya Koreneva
        changePasswordButton = new JButton();
        exitButton = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), getBorder()));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent e) {
                if ("border".equals(e.getPropertyName())) throw new RuntimeException();
            }
        });

        setLayout(new GridBagLayout());
        ((GridBagLayout) getLayout()).columnWidths = new int[]{0, 0, 0};
        ((GridBagLayout) getLayout()).rowHeights = new int[]{0, 0, 0, 0};
        ((GridBagLayout) getLayout()).columnWeights = new double[]{0.0, 0.0, 1.0E-4};
        ((GridBagLayout) getLayout()).rowWeights = new double[]{0.0, 0.0, 0.0, 1.0E-4};

        //---- changePasswordButton ----
        changePasswordButton.setText("Change password");
        add(changePasswordButton, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

        //---- exitButton ----
        exitButton.setText("Exit");
        add(exitButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        changePasswordButton.addActionListener((v) -> {
            ChangePassword changePassword = new ChangePassword(user);
            changePassword.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
            changePassword.setVisible(true);
        });
        exitButton.addActionListener((v) -> {
            //Save
            SwingUtilities.getWindowAncestor(this).dispose();
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Darya Koreneva
    private JButton changePasswordButton;
    private JButton exitButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
