package view;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Layout {

	public Layout() {
		
//		Frameset
		JFrame trframe = new JFrame("Calculator");
		JPanel panelwrapper =  new JPanel();
		JPanel panelout = new JPanel();
		JPanel panelin = new JPanel();
//		Output
		JTextField output = new JTextField("0");
		JButton cancel = new JButton("C");
//		Input	numbers	
		JButton eins = new JButton("1");
		JButton zwei = new JButton("2");
		JButton drei = new JButton("3");
		JButton vier = new JButton("4");
		JButton fünf = new JButton("5");
		JButton sechs = new JButton("6");
		JButton sieben = new JButton("7");
		JButton acht = new JButton("8");
		JButton neun = new JButton("9");
		JButton dnull = new JButton("0");
//		Input operations
		JButton geteilt = new JButton("/");
		JButton mal = new JButton("*");
		JButton minus = new JButton("-");
		JButton plus = new JButton("+");
		JButton gleich = new JButton("=");
		JButton komma = new JButton(",");
		
//		Set Layouts	
		panelwrapper.setLayout(new BorderLayout());
		panelout.setLayout(new BorderLayout());
		panelin.setLayout(new GridLayout(4,4,10,10));
//		Add elements to Panelwrapper
		panelwrapper.add(panelout, BorderLayout.NORTH);
		panelwrapper.add(panelin, BorderLayout.CENTER);
//		Add elements to panelout
		panelout.add(output, BorderLayout.CENTER);
		panelout.add(cancel, BorderLayout.EAST);
//		Add elements to panel in
		panelin.add(sieben);
		panelin.add(acht);
		panelin.add(neun);
		panelin.add(geteilt);
		panelin.add(vier);
		panelin.add(fünf);
		panelin.add(sechs);
		panelin.add(mal);
		panelin.add(eins);
		panelin.add(zwei);
		panelin.add(drei);
		panelin.add(minus);	
		panelin.add(dnull);
		panelin.add(komma);
		panelin.add(gleich);
		panelin.add(plus);
		
		
//	add Panel to trframe
		trframe.add(panelwrapper);
//		Frame options
		initTrFrame(trframe);
		
		
	}

	private void initTrFrame(JFrame trframe) {
		trframe.setLocation(300, 200);
		trframe.setVisible(true);
		trframe.setSize(400, 500);
	}
}
