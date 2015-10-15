package infoprotect.lab5;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

/**
 * Created by darya on 13.10.15.
 */
public class GUI extends JFrame {
    public static void main(String[] args) throws FileNotFoundException {
        Sys sys = new Sys();
        sys.readUsers();
        sys.readQuestions();

        AskPasswordDialog askPasswordDialog = new AskPasswordDialog((Dialog) null, sys);
        askPasswordDialog.setVisible(true);
    }
}
