/*
 * Created by JFormDesigner on Wed Oct 14 20:10:06 EEST 2015
 */

package infoprotect.lab5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Darya Koreneva
 */
public class NewPassword extends JDialog {
    private final Sys sys;
    private final User user;
    List<JTextField> textFieldList = new ArrayList<>();

    public NewPassword(Frame owner, User user, Sys sys) {
        super(owner);
        this.sys = sys;
        this.user = user;
        initComponents();
    }

    public NewPassword(Dialog owner, User user, Sys sys) {
        super(owner);
        this.sys = sys;
        this.user = user;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Darya Koreneva
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        label3 = new JLabel();
        newPasswordField = new JPasswordField();
        label4 = new JLabel();
        repeatPasswordField = new JPasswordField();
        messegeLabel = new JLabel();
        questionsPanel = new JPanel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
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
                    java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new GridBagLayout());
                ((GridBagLayout)contentPanel.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)contentPanel.getLayout()).rowHeights = new int[] {0, 0, 0};
                ((GridBagLayout)contentPanel.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)contentPanel.getLayout()).rowWeights = new double[] {0.0, 1.0, 1.0E-4};

                //======== panel1 ========
                {
                    panel1.setBorder(new TitledBorder("Password"));
                    panel1.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0};
                    ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                    ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 1.0, 1.0E-4};
                    ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                    //---- label3 ----
                    label3.setText("New password:");
                    label3.setHorizontalAlignment(SwingConstants.RIGHT);
                    panel1.add(label3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                    panel1.add(newPasswordField, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                    //---- label4 ----
                    label4.setText("Repeat password:");
                    label4.setHorizontalAlignment(SwingConstants.RIGHT);
                    panel1.add(label4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                    panel1.add(repeatPasswordField, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));
                    panel1.add(messegeLabel, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                contentPanel.add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //======== questionsPanel ========
                {
                    questionsPanel.setBorder(new TitledBorder("Questions"));
                    questionsPanel.setLayout(new GridBagLayout());
                    ((GridBagLayout)questionsPanel.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)questionsPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
                    ((GridBagLayout)questionsPanel.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                    ((GridBagLayout)questionsPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
                }
                contentPanel.add(questionsPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(585, 430);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        okButton.addActionListener((v) -> {
            String newPassword = new String(newPasswordField.getPassword());
            String repeatPassword = new String(repeatPasswordField.getPassword());
            if (!Objects.equals(newPassword, repeatPassword))
                messegeLabel.setText("Passwords aren't equal");
            else {
                if (!textFieldList.stream().allMatch(text -> !text.getText().isEmpty())) {
                    messegeLabel.setText("Empty field");
                } else {
                    user.changePassword(newPassword);
                    for (int i = 0; i < textFieldList.size(); i++) {
                        user.addQuestions(sys.getQuestions().get(i), textFieldList.get(i).getText());
                    }
                    dispose();
                }
            }
        });
        cancelButton.addActionListener((v) -> dispose());

        setQuestions(sys.getQuestions());
    }

    private void setQuestions(List<String> questions) {
        questionsPanel.setLayout(new GridLayout(questions.size() * 2, 1));
        questions.forEach((question) -> {
            JLabel label = new JLabel(question);
            JTextField textField = new JTextField();
            textFieldList.add(textField);
            questionsPanel.add(label);
            questionsPanel.add(textField);
        });
        questionsPanel.repaint();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Darya Koreneva
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JLabel label3;
    private JPasswordField newPasswordField;
    private JLabel label4;
    private JPasswordField repeatPasswordField;
    private JLabel messegeLabel;
    private JPanel questionsPanel;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
