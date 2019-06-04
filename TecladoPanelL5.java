import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoPanelL5 extends JPanel{

	String[] line_5 = {" ","Left","Down","Right"};
	JButton[] line5 = new JButton[4];
	
	GridBagLayout layoutTeclado = new GridBagLayout();
	GridBagConstraints conteiner = new GridBagConstraints();
	
	public TecladoPanelL5() {
		setLayout(layoutTeclado);
		
		for (int i = 0; i < line5.length; i++) {
			line5[i] = new JButton(line_5[i]);
		}
		
		addComponent(line5[0],0,0,5,1);
		addComponent(line5[1],0,10,1,1);
		addComponent(line5[2],0,12,1,1);
		addComponent(line5[3],0,13,1,1);

		Color color = line5[0].getBackground();
		
		line5[0].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					line5[0].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line5[0].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line5[1].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					line5[1].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line5[1].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line5[2].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					line5[2].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line5[2].setBackground(color);			
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line5[3].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					line5[3].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line5[3].setBackground(color);
			}
				
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
			
	}
	
	public void addComponent(Component component, int row, int column,int width,int height) {
		conteiner.gridy = row;
		conteiner.gridx = column;
		conteiner.gridwidth = width;
		conteiner.gridheight = height;
		layoutTeclado.setConstraints(component, conteiner);
		add(component);
	}
}
