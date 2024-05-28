import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;


public class ToDoList extends JFrame implements ActionListener {

  private JTextField taskField;
  private JButton addButton, removeButton;
  private DefaultListModel<String> listModel;
  private JList<String> taskList;

  public ToDoList() {
    super("To-Do List");

    // Create components
    taskField = new JTextField(20);
    addButton = new JButton("Add Task");
    removeButton = new JButton("Remove Task");
    listModel = new DefaultListModel<>();
    taskList = new JList<>(listModel);

    // Add action listeners
    addButton.addActionListener(this);
    removeButton.addActionListener(this);

    // Layout components
    JPanel panel = new JPanel();
    panel.add(taskField);
    panel.add(addButton);
    panel.add(removeButton);

    JScrollPane scrollPane = new JScrollPane(taskList);

    add(panel, BorderLayout.NORTH);
    add(scrollPane, BorderLayout.CENTER);

    // Set window properties
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null); // Center the window
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addButton) {
      String task = taskField.getText().trim();
      if (!task.isEmpty()) {
        listModel.addElement(task);
        taskField.setText(""); // Clear the text field
      }
    } else if (e.getSource() == removeButton) {
      int selectedIndex = taskList.getSelectedIndex();
      if (selectedIndex != -1) {
        listModel.remove(selectedIndex);
      }
    }
  }

  public static void main(String[] args) {
    new ToDoList();
  }
}
