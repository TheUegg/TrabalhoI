import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoPanelL4 extends JPanel{
	
	String[] line_4 = {"Shift","Z","X","C","V","B","N","M",",",".","?","Up"};
	JButton[] line4 = new JButton[12];
	
	GridBagLayout layoutTeclado = new GridBagLayout();
	GridBagConstraints conteiner = new GridBagConstraints();
	
	public TecladoPanelL4() {
		setLayout(layoutTeclado);
		
		for (int i = 0; i < line4.length; i++) {
			line4[i] = new JButton(line_4[i]);
		}
		
		for (int i = 0; i < line4.length; i++) {
			if(i == 0) {
				addComponent(line4[i],3,i,1,1);
			}
			else if(i == 11) {
				addComponent(line4[i],3,i+1,1,1);
				}
			else {
				addComponent(line4[i],3,i,1,1);
			}
		}
		
		Color color = line4[0].getBackground();
		
		line4[0].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
					line4[0].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {	
				line4[0].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[1].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_Z) {
					line4[1].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[1].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[2].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_X) {
					line4[2].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[2].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[3].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_C) {
					line4[3].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[3].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[4].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_V) {
					line4[4].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[4].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[5].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_B) {
					line4[5].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[5].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[6].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_N) {
					line4[6].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[6].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[7].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_M) {
					line4[7].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[7].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[8].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_COMMA) {
					line4[8].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[8].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[9].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_PERIOD) {
					line4[9].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[9].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[10].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_EXCLAMATION_MARK) {
					line4[10].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[10].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line4[11].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					line4[11].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line4[11].setBackground(color);
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
