import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class TabPaneFrame extends JFrame {
	String coletora;// Coletoda da frase escolhida
	int tamanho;
	char[] coletada = new char[tamanho];
	
	GridBagLayout layoutTeclado = new GridBagLayout();
	GridBagConstraints conteiner;
	
	public TabPaneFrame() {
		super("TabPane");
		
		//tab 1
		JTabbedPane tabbedPane = new JTabbedPane(); // create JTabbedPane
		// set up pane11 and add it to JTabbedPane0
		JLabel label1 = new JLabel( "panel um");
		JPanel panel1 = new JPanel(); // create first panel
		JPanel panelText = new JPanel();
		JPanel panelData = new JPanel();
		panel1.setLayout(new BorderLayout());
		conteiner = new GridBagConstraints();
		Box boxVerticalTab2 = Box.createVerticalBox();
		Box boxHorizontal1 = Box.createHorizontalBox();
		Box boxHorizontal2 = Box.createHorizontalBox();
		Box boxHorizontal3 = Box.createHorizontalBox();
		Box boxHorizontal4 = Box.createHorizontalBox();
		
		JTextArea area1 = new JTextArea("Escolha um Pangrama",7,60);
		panelText.add(area1);
		panel1.add(panelText, BorderLayout.NORTH);
		
		JLabel FraseEscolhida = new JLabel("Frase escolhida:");
		JLabel FraseCompleta = new JLabel("Frase Completa:");
		JLabel acertos = new JLabel("Numero de acertos:");
		JLabel erros = new JLabel("Numero de erros:");
		JTextArea areaFrase1 = new JTextArea(" ",1,2);
		JTextArea areaFrase2 = new JTextArea(" ",1,2);
		JTextArea areaFrase3 = new JTextArea(" ",1,2);
		JTextArea areaFrase4 = new JTextArea(" ",1,2);
		
		boxHorizontal1.add(FraseEscolhida);
		boxHorizontal1.add(areaFrase1);
		
		boxHorizontal2.add(FraseCompleta);
		boxHorizontal2.add(areaFrase2);
		
		boxHorizontal3.add(acertos);
		boxHorizontal3.add(areaFrase3);
		
		boxHorizontal4.add(erros);
		boxHorizontal4.add(areaFrase4);
		
		boxVerticalTab2.add(boxHorizontal1);
		boxVerticalTab2.add(boxHorizontal2);
		boxVerticalTab2.add(boxHorizontal3);
		boxVerticalTab2.add(boxHorizontal4);
		panelData.add(boxVerticalTab2);
		panel1.add(panelData, BorderLayout.WEST);
			
		TecladoPanel panelTeclado = new TecladoPanel();
		panel1.add(panelTeclado,BorderLayout.SOUTH);
		tabbedPane.addTab( "Inicio", null, panel1, "Primeiro Panel" );
		
		//tab 2
		JLabel label2 = new JLabel("panel 2");
		JPanel panel2 = new JPanel();
		Box verticalBox = Box.createVerticalBox();
		String[] arrayFrases = {"Um pequeno jabuti xereta viu dez cegonhas felizes","Quem traz CD, LP, fax, engov e whisky JB?","Gazeta publica hoje breve nota de faxina na quermesse.","Jovem craque belga prediz falhas no xote.","Bancos futeis pagavam-lhe queijo, whisky e xadrez."};
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
					coletada = coletora.toCharArray();
					tamanho = 48;
					area1.setText("");
					areaFrase1.setText(coletora);
				}
			}
		});														//Action listener dos botoes
		
		segundo.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(segundo.isSelected()) {
					coletora = segundo.getText();
					coletada = coletora.toCharArray();
					tamanho = 41;
					area1.setText("");
					areaFrase1.setText(coletora);
				}
			}
		});
		
		terceiro.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(terceiro.isSelected()) {
					coletora = terceiro.getText();
					coletada = coletora.toCharArray();
					tamanho = 41;
					area1.setText("");
					areaFrase1.setText(coletora);
				}
			}
		});
		
		quarto.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(quarto.isSelected()) {
					coletora = quarto.getText();
					coletada = coletora.toCharArray();
					tamanho = 41;
					area1.setText("");
					areaFrase1.setText(coletora);
				}
			}
		});
		
		quinto.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(quinto.isSelected()) {
					coletora = quinto.getText();
					coletada = coletora.toCharArray();
					tamanho = 50;
					area1.setText("");
					areaFrase1.setText(coletora);
				}
			}
		});
		
		panel2.setLayout(new BorderLayout());
		panel2.add(verticalBox, BorderLayout.WEST);;
		
		tabbedPane.addTab( "Teste	Pangrama", null, panel2, "Segundo Panel" );
		
		//tab 3
		JPanel panel3 = new JPanel();
		JTextArea area2 = new JTextArea("alo",20,600);
		panelText.add(area2);
		panel3.add( area2, BorderLayout.CENTER );
		tabbedPane.addTab( "Historico", null, panel3, "Terceiro Panel" );
		
		add( tabbedPane ); // add JTabbedPane to frame
	}
	
	public static void main(String[] args) {
		TabPaneFrame tabbedPaneFrame = new TabPaneFrame();
		tabbedPaneFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		tabbedPaneFrame.setSize( 700, 400); // set frame size
		tabbedPaneFrame.setVisible( true ); // display frame
	}
}
