package kamil;

import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calc {
	public static void main(String[] args) throws ScriptException {
		JFrame frame = new JFrame();
		frame.setSize(200, 300);
		frame.setLocation(250, 250);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField tf = new JTextField();
		tf.setBounds(10, 10, 170, 30);
		frame.setLayout(null);
		frame.add(tf);
		tf.setHorizontalAlignment(JTextField.RIGHT);

		JButton button7 = new JButton("7");
		button7.setBounds(10, 50, 30, 40);
		frame.add(button7);
		button7.setBorder(null);
		button7.addActionListener(new ButtonTextActionListener(tf, "7"));
		JButton but2 = new JButton("8");
		but2.setBounds(50, 50, 30, 40);
		frame.add(but2);
		but2.setBorder(null);
		but2.addActionListener(new ButtonTextActionListener(tf, "8"));

		JButton but3 = new JButton("9");
		but3.setBounds(90, 50, 30, 40);
		frame.add(but3);
		but3.setBorder(null);
		but3.addActionListener(new ButtonTextActionListener(tf, "9"));

		JButton but4 = new JButton("4");
		but4.setBounds(130, 50, 30, 40);
		frame.add(but4);
		but4.setBorder(null);
		but4.addActionListener(new ButtonTextActionListener(tf, "4"));
		JButton but5 = new JButton("5");
		but5.setBounds(10, 90, 30, 40);
		frame.add(but5);
		but5.setBorder(null);
		but5.addActionListener(new ButtonTextActionListener(tf, "5"));
		JButton but6 = new JButton("6");
		but6.setBounds(50, 90, 30, 40);
		frame.add(but6);
		but6.setBorder(null);
		but6.addActionListener(new ButtonTextActionListener(tf, "6"));

		JButton but7 = new JButton("1");
		but7.setBounds(90, 90, 30, 40);
		frame.add(but7);
		but7.setBorder(null);
		but7.addActionListener(new ButtonTextActionListener(tf, "1"));

		JButton but8 = new JButton("2");
		but8.setBounds(130, 90, 30, 40);
		frame.add(but8);
		but8.setBorder(null);
		but8.addActionListener(new ButtonTextActionListener(tf, "2"));

		JButton but9 = new JButton("3");
		but9.setBounds(10, 130, 30, 40);
		frame.add(but9);
		but9.setBorder(null);
		but9.addActionListener(new ButtonTextActionListener(tf, "3"));
		JButton but0 = new JButton("0");
		but0.setBounds(50, 130, 30, 40);
		frame.add(but0);
		but0.setBorder(null);
		but0.addActionListener(new ButtonTextActionListener(tf, "0"));

		JButton butAdd = new JButton("+");
		butAdd.setBounds(90, 130, 40, 80);
		frame.add(butAdd);
		butAdd.setBorder(null);
		butAdd.addActionListener(new ButtonTextActionListener(tf, "+"));

		JButton butSub = new JButton("-");
		butSub.setBounds(135, 130, 40, 80);
		frame.add(butSub);
		butSub.setBorder(null);
		butSub.addActionListener(new ButtonTextActionListener(tf, "-"));

		JButton butmulti = new JButton("*");
		butmulti.setBounds(90, 215, 40, 60);
		frame.add(butmulti);
		butmulti.setBorder(null);
		butmulti.addActionListener(new ButtonTextActionListener(tf, "*"));

		JButton butdiv = new JButton("/");
		butdiv.setBounds(135, 215, 40, 60);
		frame.add(butdiv);
		butdiv.setBorder(null);
		butdiv.addActionListener(new ButtonTextActionListener(tf, "/"));
		JButton buteq = new JButton("=");
		buteq.setBounds(5, 180, 75, 88);
		frame.add(buteq);
		buteq.setBorder(null);
		buteq.addActionListener(new ButtonEqualActionListener(tf));
	}

}
