package kamil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButtonTextActionListener implements ActionListener {

	private final JTextField textField;
	private final String text;

	public ButtonTextActionListener(JTextField textField, String text) {
		this.textField = textField;
		this.text = text;
		System.out.println(text);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(textField.getText());
		System.out.println(text);
		textField.setText(textField.getText() + text);
		System.out.println(textField.getText());
	}

}
