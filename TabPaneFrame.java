import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class TabPaneFrame extends JFrame {
	String coletora;// Coletoda da frase escolhida
	public TabPaneFrame() {
		super("TabPane");
		
		//tab 1
		JTabbedPane tabbedPane = new JTabbedPane(); // create JTabbedPane
		// set up pane11 and add it to JTabbedPane0
		JLabel label1 = new JLabel( "panel um");
		JPanel panel1 = new JPanel(); // create first panel
		tabbedPane.addTab( "Inicio", null, panel1, "Primeiro Panel" );
		
		//tab 2
		JLabel label2 = new JLabel("panel 2");
		JPanel panel2 = new JPanel();
		Box verticalBox = Box.createVerticalBox();
		String[] arrayFrases = {"Um pequeno jabuti xereta viu dez cegonhas felizes","Quem traz CD, LP, fax, engov e whisky JB?","Gazeta publica hoje breve nota de faxina na quermesse.","Jovem craque belga prediz falhas no xote.","Bancos fúteis pagavam-lhe queijo, whisky e xadrez."};
		ButtonGroup buttonGroup = new ButtonGroup();
		
		
		JRadioButton primeiro = new JRadioButton(arrayFrases[0]);
		JRadioButton segundo = new JRadioButton(arrayFrases[1]);
		JRadioButton terceiro = new JRadioButton(arrayFrases[2]);
		JRadioButton quarto = new JRadioButton(arrayFrases[3]);   //Criando os botoes
		JRadioButton quinto = new JRadioButton(arrayFrases[4]);
		
		buttonGroup.add(primeiro);
		buttonGroup.add(segundo);
		buttonGroup.add(terceiro); //Setando os botoes para o grupo
		buttonGroup.add(quarto);
		buttonGroup.add(quinto);
		
		verticalBox.add(primeiro);
		verticalBox.add(segundo);  //Setando os botoes para serem verticais
		verticalBox.add(terceiro);
		verticalBox.add(quarto);
		verticalBox.add(quinto);
		
		primeiro.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(primeiro.isSelected()) {
					coletora = primeiro.getText();
				}
			}
		});														//Action listener dos botoes
		
		segundo.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(segundo.isSelected()) {
					coletora = segundo.getText();
				}
			}
		});
		
		terceiro.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(terceiro.isSelected()) {
					coletora = terceiro.getText();
				}
			}
		});
		
		quarto.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(quarto.isSelected()) {
					coletora = quarto.getText();
				}
			}
		});
		
		quinto.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(quinto.isSelected()) {
					coletora = quinto.getText();
				}
			}
		});
		
		panel2.setLayout(new BorderLayout());
		panel2.add(verticalBox, BorderLayout.WEST);;
		
		tabbedPane.addTab( "Teste	Pangrama", null, panel2, "Segundo Panel" );
		
		//tab 3
		JLabel label3 = new JLabel( "panel tres" );
		JPanel panel3 = new JPanel(); // create third panel
		panel3.setLayout( new BorderLayout() ); // use borderlayout
		panel3.add( new JButton( "North" ), BorderLayout.NORTH );
		panel3.add( new JButton( "West" ), BorderLayout.WEST );	
		panel3.add( new JButton( "East" ), BorderLayout.EAST );
		panel3.add( new JButton( "South" ), BorderLayout.SOUTH );
		panel3.add( label3, BorderLayout.CENTER );
		tabbedPane.addTab( "Histórico", null, panel3, "Terceiro Panel" );
		
		add( tabbedPane ); // add JTabbedPane to frame
	}
	public static void main(String[] args) {
		TabPaneFrame tabbedPaneFrame = new TabPaneFrame();
		tabbedPaneFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		tabbedPaneFrame.setSize( 800, 300); // set frame size
		tabbedPaneFrame.setVisible( true ); // display frame
	}
}
