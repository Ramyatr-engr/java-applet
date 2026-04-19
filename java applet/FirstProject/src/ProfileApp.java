import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProfileApp extends JFrame implements ActionListener {

    JTextField nameField;
    JComboBox<String> deptBox;
    JRadioButton male, female;
    JCheckBox music, sports;
    JButton createBtn;

    ProfileApp() {
        setTitle("Mini Profile Creator");
        setSize(400, 400);
        setLayout(null);

        // Background color
        getContentPane().setBackground(new Color(200, 230, 255));

        // Title
        JLabel title = new JLabel("Create Your Profile");
        title.setBounds(80, 10, 250, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 60, 100, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 60, 150, 25);
        add(nameField);

        // Department
        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(50, 100, 100, 25);
        add(deptLabel);

        String dept[] = {"CSE", "ECE", "ISE"};
        deptBox = new JComboBox<>(dept);
        deptBox.setBounds(150, 100, 150, 25);
        add(deptBox);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 140, 100, 25);
        add(genderLabel);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(150, 140, 70, 25);
        female.setBounds(220, 140, 80, 25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        add(male);
        add(female);

        // Hobbies
        JLabel hobbyLabel = new JLabel("Hobbies:");
        hobbyLabel.setBounds(50, 180, 100, 25);
        add(hobbyLabel);

        music = new JCheckBox("Music");
        sports = new JCheckBox("Sports");
        music.setBounds(150, 180, 80, 25);
        sports.setBounds(230, 180, 80, 25);

        add(music);
        add(sports);

        // Button
        createBtn = new JButton("Create Profile");
        createBtn.setBounds(120, 240, 150, 30);
        createBtn.setBackground(Color.BLUE);
        createBtn.setForeground(Color.WHITE);
        createBtn.setFocusPainted(false);
        createBtn.addActionListener(this);
        add(createBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String dept = (String) deptBox.getSelectedItem();

        String gender = male.isSelected() ? "Male" : "Female";

        String hobbies = "";
        if (music.isSelected()) hobbies += "Music ";
        if (sports.isSelected()) hobbies += "Sports ";

        JOptionPane.showMessageDialog(this,
                "Profile Created!\n\nName: " + name +
                "\nDept: " + dept +
                "\nGender: " + gender +
                "\nHobbies: " + hobbies);
    }

    public static void main(String[] args) {
        new ProfileApp();
    }
}