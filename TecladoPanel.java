import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoPanel extends JPanel{
	
	String[] line_1 = {"~","1","2","3","4","5","6","7","8","9","0","-","+"};
	String[] line_2 = {"Tab","Q","W","E","R","T","Y","U","I","O","P","[","]","/"};
	String[] line_3 = {"Caps","A","S","D","F","G","H","J","K","L",":","*","Enter"};
	String[] line_4 = {"Shift","Z","X","C","V","B","N","M",",",".","?","Up"};
	String[] line_5 = {" ","Left","Down","Right"};
	JButton backspace = new JButton("Backspace");
	JButton[] line1 = new JButton[13];
	JButton[] line2 = new JButton[14];
	JButton[] line3 = new JButton[13];//Buttons
	JButton[] line4 = new JButton[12];
	JButton[] line5 = new JButton[4];
	
	GridBagLayout layoutTeclado = new GridBagLayout();
	GridBagConstraints conteiner = new GridBagConstraints();
	
	public TecladoPanel() {
		setLayout(layoutTeclado);	
  
    TecladoPanelL1 firstLine = new TecladoPanelL1();
		TecladoPanelL2 secondLine = new TecladoPanelL2();
		TecladoPanelL3 thirdLine = new TecladoPanelL3();
		TecladoPanelL4 fourthLine = new TecladoPanelL4();
		TecladoPanelL5 fifthLine = new TecladoPanelL5();
		
		addComponent(firstLine,0);
		addComponent(secondLine,1);
		addComponent(thirdLine,2);
		addComponent(fourthLine,3);
		addComponent(fifthLine,4);
	}
	
	public void addComponent(Component component, int row) {
		conteiner.gridy = row;
		layoutTeclado.setConstraints(component, conteiner);
		add(component);
		}
}
