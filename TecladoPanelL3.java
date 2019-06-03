import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoPanelL3 extends JPanel{

	String[] line_3 = {"Caps","A","S","D","F","G","H","J","K","L",":","*","Enter"};
	JButton[] line3 = new JButton[13];
	
	GridBagLayout layoutTeclado = new GridBagLayout();
	GridBagConstraints conteiner = new GridBagConstraints();
	
	public TecladoPanelL3() {
		setLayout(layoutTeclado);
		
		for (int i = 0; i < line3.length; i++) {
			line3[i] = new JButton(line_3[i]);				
		}
		
		for (int i = 0; i < line3.length; i++) {
			if (i == 0) {
				addComponent(line3[i],2,i,1,1);
			}
			else if (i == 12) {
				addComponent(line3[i],2,i,1,1);
				}
			else {
				addComponent(line3[i],2,i,1,1);
			}
		}
		
		Color color = line3[0].getBackground();
		
		line3[0].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
					line3[0].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[0].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[1].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_A) {
					line3[1].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[1].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[2].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_S) {
					line3[2].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[2].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[3].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_D) {
					line3[3].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[3].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[4].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_F) {
					line3[4].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[4].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[5].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_G) {
					line3[5].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[5].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[6].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_H) {
					line3[6].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[6].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[7].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_J) {
					line3[7].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[7].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[8].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_K) {
					line3[8].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[8].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[9].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_L) {
					line3[9].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[9].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[10].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_COLON) {
					line3[10].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[10].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[11].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
					line3[11].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[11].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line3[12].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					line3[12].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line3[12].setBackground(color);
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
