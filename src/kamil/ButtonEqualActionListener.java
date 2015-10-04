package kamil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JTextField;

public class ButtonEqualActionListener implements ActionListener {

	private final JTextField textField;
	private final ScriptEngineManager mgr = new ScriptEngineManager();
	private final ScriptEngine engine = mgr.getEngineByName("JavaScript");

	public ButtonEqualActionListener(JTextField textField) {
		this.textField = textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			textField.setText(engine.eval(textField.getText()).toString());
		} catch (ScriptException e1) {
			System.out.println("Error " + e1);
		}
	}

}
