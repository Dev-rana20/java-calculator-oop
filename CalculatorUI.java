import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame implements ActionListener {

  private JTextField num1Field, num2Field, resultField;
  private Calculator calculator;

  public CalculatorUI() {
    calculator = new Calculator();

    setTitle("Java Calculator UI");
    setSize(350, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    setLayout(new GridLayout(5, 2, 10, 10));

    add(new JLabel("Number 1:"));
    num1Field = new JTextField();
    add(num1Field);

    add(new JLabel("Number 2:"));
    num2Field = new JTextField();
    add(num2Field);

    JButton addBtn = new JButton("Add");
    JButton subBtn = new JButton("Subtract");
    JButton mulBtn = new JButton("Multiply");
    JButton divBtn = new JButton("Divide");

    addBtn.addActionListener(this);
    subBtn.addActionListener(this);
    mulBtn.addActionListener(this);
    divBtn.addActionListener(this);

    add(addBtn);
    add(subBtn);
    add(mulBtn);
    add(divBtn);

    add(new JLabel("Result:"));
    resultField = new JTextField();
    resultField.setEditable(false);
    add(resultField);

    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    try {
      double a = Integer.parseInt(num1Field.getText());
      double b = Integer.parseInt(num2Field.getText());
      double result = 0;

      switch (e.getActionCommand()) {
        case "Add":
          result = calculator.add(a, b);
          break;
        case "Subtract":
          result = calculator.subtract(a, b);
          break;
        case "Multiply":
          result = calculator.multiply(a, b);
          break;
        case "Divide":
          result = calculator.divide(a, b);
          break;
      }

      resultField.setText(String.valueOf(result));

    } catch (Exception ex) {
      JOptionPane.showMessageDialog(this, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

  public static void main(String[] args) {
    new CalculatorUI();
  }
}
