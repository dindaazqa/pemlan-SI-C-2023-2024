import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    private JFrame frame;
    private JTextField nameField, dobField, regNumberField, phoneField, addressField, emailField;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                RegistrationForm window = new RegistrationForm();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public RegistrationForm() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(7, 2, 10, 10));

        JLabel nameLabel = new JLabel("Nama");
        nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel dobLabel = new JLabel("Tanggal Lahir");
        dobField = new JTextField();
        panel.add(dobLabel);
        panel.add(dobField);

        JLabel regNumberLabel = new JLabel("Nomor Registrasi");
        regNumberField = new JTextField();
        panel.add(regNumberLabel);
        panel.add(regNumberField);

        JLabel phoneLabel = new JLabel("Nomor Telpon");
        phoneField = new JTextField();
        panel.add(phoneLabel);
        panel.add(phoneField);

        JLabel addressLabel = new JLabel("Alamat");
        addressField = new JTextField();
        panel.add(addressLabel);
        panel.add(addressField);

        JLabel emailLabel = new JLabel("Email");
        emailField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailField);

        JButton submitButton = new JButton("Submit");
        panel.add(new JLabel());
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmit();
            }
        });
    }

    private void handleSubmit() {
        if (nameField.getText().isEmpty() || dobField.getText().isEmpty() || regNumberField.getText().isEmpty() ||
                phoneField.getText().isEmpty() || addressField.getText().isEmpty() || emailField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Harap isi semua kolom!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            int response = JOptionPane.showConfirmDialog(frame, "Anda Yakin Data yang Anda Isi Sudah Benar?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                displayData();
            }
        }
    }


    private void displayData() {
        JFrame dataFrame = new JFrame("Submitted Data");
        dataFrame.setBounds(100, 100, 450, 400);
        dataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dataFrame.getContentPane().setLayout(new GridLayout(7, 2, 10, 10));

        dataFrame.getContentPane().add(new JLabel("Nama"));
        dataFrame.getContentPane().add(new JLabel("\f\f:"));
        dataFrame.getContentPane().add(new JLabel(nameField.getText()));

        dataFrame.getContentPane().add(new JLabel("Tanggal Lahir"));
        dataFrame.getContentPane().add(new JLabel("\f\f:"));
        dataFrame.getContentPane().add(new JLabel(dobField.getText()));

        dataFrame.getContentPane().add(new JLabel("Nomor Registrasi"));
        dataFrame.getContentPane().add(new JLabel("\f\f:"));
        dataFrame.getContentPane().add(new JLabel(regNumberField.getText()));

        dataFrame.getContentPane().add(new JLabel("Nomor Telpon"));
        dataFrame.getContentPane().add(new JLabel("\f\f:"));
        dataFrame.getContentPane().add(new JLabel(phoneField.getText()));

        dataFrame.getContentPane().add(new JLabel("Alamat"));
        dataFrame.getContentPane().add(new JLabel("\f\f:"));
        dataFrame.getContentPane().add(new JLabel(addressField.getText()));

        dataFrame.getContentPane().add(new JLabel("Email"));
        dataFrame.getContentPane().add(new JLabel("\f\f:"));
        dataFrame.getContentPane().add(new JLabel(emailField.getText()));

        dataFrame.setVisible(true);
    }
}
