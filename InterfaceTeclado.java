package projetodia1;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class InterfaceTeclado extends JFrame{
	BorderLayout layout;
	Box boxVertical = Box.createVerticalBox();
	JPanel layoutTeclado;
	GridBagConstraints conteiner;
	JButton[] line1 = new JButton[13];
	String[] line_1 = {"~","1","2","3","4","5","6","7","8","9","0","-","+"};
	JButton BackSpace = new JButton("Backspace");
	
	
	
	//construtor
	public InterfaceTeclado() {
	layout = new BorderLayout(5,5);
	setLayout(layout);
	//Area de texto
	JTextArea area1 = new JTextArea("alo",7,598);
	JPanel panel1 = new JPanel();
	panel1.add(area1);
	add(panel1,BorderLayout.NORTH);
	
	//Panel de erros, acertos
	JLabel label1 = new JLabel("Frase escolhida:");
	JPanel panel2 = new JPanel();
	JLabel FraseCompleta = new JLabel("Frase Completa");
	JLabel acertos = new JLabel("Número de acertos:");
	JLabel erros = new JLabel("Número de erros:");
	boxVertical.add(label1);
	boxVertical.add(FraseCompleta);
	boxVertical.add(acertos);
	boxVertical.add(erros);
	panel2.add(boxVertical);
	add(panel2,BorderLayout.WEST);
	
	
	
	
	//Teclado
	layoutTeclado = new JPanel(new GridBagLayout());
	conteiner = new GridBagConstraints();
	for(int i = 0; i<13;i++) {
		line1[i] = new JButton(line_1[i]);
	}
	for(int i = 0; i<13;i++) {
	addComponent(line1[i],0,i,5,5);
	}
	addComponent(BackSpace,0,13,5,5);
	JPanel panelteclado = new JPanel();
	
	}
	
	
	private void addComponent(Component component, int row, int column,int width,int height) {
		conteiner.gridx = row;
		conteiner.gridy = column;
		conteiner.gridwidth = width;
		conteiner.gridheight = height;
		layoutTeclado.setConstraints(component, conteiner);
		add(component);
		}


	public static void main(String[] args) {
		
		InterfaceTeclado teste = new InterfaceTeclado();
		teste.setDefaultCloseOperation(EXIT_ON_CLOSE);
		teste.setSize(600,400);
		teste.setVisible(true);
	}


}
