import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormApp {

    public static void main(String[] args) {
        // Create the frame for the GUI
        JFrame frame = new JFrame("User Info Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Set a background color
        frame.getContentPane().setBackground(new Color(255, 223, 186));  // Soft orange background
        frame.setLayout(new GridBagLayout());  // Use GridBagLayout for neat placement
        
        // Create GridBagConstraints to control the layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Add padding between components

        // Create labels and text fields for name, email, and phone number
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        
        JLabel phoneLabel = new JLabel("Phone Number:");
        JTextField phoneField = new JTextField(20);

        // Create a submit button with a custom color
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(0, 123, 255)); // Blue color
        submitButton.setForeground(Color.WHITE); // White text color

        // Create a label to display the submitted information
        JLabel resultLabel = new JLabel("");
        resultLabel.setForeground(new Color(0, 128, 0));  // Green text for success message
        
        // Arrange components in the frame using GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(phoneLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(phoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;  // Button spans both columns
        frame.add(submitButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        frame.add(resultLabel, gbc);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve the text from the text fields
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();

                // Display the information in the result label
                resultLabel.setText("<html><b>Name:</b> " + name + "<br><b>Email:</b> " + email + "<br><b>Phone:</b> " + phone + "</html>");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}