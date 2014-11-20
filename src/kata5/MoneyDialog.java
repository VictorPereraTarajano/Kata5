package kata5;

import javax.swing.JPanel;
import javax.swing.JTextField;

class MoneyDialog extends JPanel {

    private final int SIZE = 10;
    
    public MoneyDialog() {
        super();
        add(createTextField());
        add(new CurrencyDialog());
    }

    private JTextField createTextField() {
        return new JTextField(SIZE);
    }
    
}
