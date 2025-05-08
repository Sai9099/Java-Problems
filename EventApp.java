import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List; // Explicit import to avoid ambiguity

public class EventApp {
    private Map<String, List<Participant>> eventMap = new HashMap<>();

    private JFrame frame;
    private JComboBox<String> eventComboBox;
    private JTextArea displayArea;
    private JTextField eventNameField, nameField, emailField, phoneField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EventApp().createGUI());
    }

    private void createGUI() {
        frame = new JFrame("Event Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        eventNameField = new JTextField(10);
        JButton registerEventBtn = new JButton("Register Event");

        registerEventBtn.addActionListener(e -> {
            String eventName = eventNameField.getText();
            if (!eventName.isEmpty()) {
                registerEvent(eventName);
                eventComboBox.addItem(eventName);
                JOptionPane.showMessageDialog(frame, "Event Registered!");
            }
        });

        topPanel.add(new JLabel("Event:"));
        topPanel.add(eventNameField);
        topPanel.add(registerEventBtn);

        JPanel formPanel = new JPanel(new GridLayout(5, 2));
        nameField = new JTextField();
        emailField = new JTextField();
        phoneField = new JTextField();

        formPanel.add(new JLabel("Select Event:"));
        eventComboBox = new JComboBox<>();

        // Default events
        String[] defaultEvents = {"Tech Talk", "Hackathon", "Workshop"};
        for (String evt : defaultEvents) {
            registerEvent(evt);
            eventComboBox.addItem(evt);
        }

        formPanel.add(eventComboBox);
        formPanel.add(new JLabel("Participant Name:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(new JLabel("Phone:"));
        formPanel.add(phoneField);

        JButton addBtn = new JButton("Add Participant");
        JButton viewBtn = new JButton("View Participants");

        addBtn.addActionListener(e -> {
            String event = (String) eventComboBox.getSelectedItem();
            if (event == null) return;

            Participant p = new Participant(nameField.getText(), emailField.getText(), phoneField.getText());
            addParticipant(event, p);
            JOptionPane.showMessageDialog(frame, "Participant added!");
        });

        viewBtn.addActionListener(e -> {
            String event = (String) eventComboBox.getSelectedItem();
            if (event == null) return;

            List<Participant> list = getParticipants(event);
            displayArea.setText("");
            for (Participant p : list) {
                displayArea.append(p.getName() + " | " + p.getEmail() + " | " + p.getPhone() + "\n");
            }
        });

        formPanel.add(addBtn);
        formPanel.add(viewBtn);

        displayArea = new JTextArea(10, 50);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(scrollPane, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private void registerEvent(String eventName) {
        if (!eventMap.containsKey(eventName)) {
            eventMap.put(eventName, new ArrayList<>());
        }
    }

    private void addParticipant(String event, Participant p) {
        if (!eventMap.containsKey(event)) {
            registerEvent(event);
        }
        eventMap.get(event).add(p);
    }

    private List<Participant> getParticipants(String event) {
        return eventMap.getOrDefault(event, new ArrayList<>());
    }

    class Participant {
        private String name;
        private String email;
        private String phone;

        public Participant(String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
        }

        public String getName() { return name; }
        public String getEmail() { return email; }
        public String getPhone() { return phone; }
    }
}
