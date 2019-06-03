import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ColorModel;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoPanelL1 extends JPanel {

	String[] line_1 = {"~","1","2","3","4","5","6","7","8","9","0","-","+"};
	
	JButton backspace = new JButton("Backspace");
	JButton[] line1 = new JButton[13];
	GridBagLayout layoutTeclado = new GridBagLayout();
	GridBagConstraints conteiner = new GridBagConstraints();
	
	public TecladoPanelL1() {
		setLayout(layoutTeclado);
	
		for(int i = 0; i<13;i++) {
			line1[i] = new JButton(line_1[i]);
		}
		
		for (int i = 0; i < line1.length; i++) {
			addComponent(line1[i],0, i, 1, 1);
		}														
		addComponent(backspace,0, 13, 1, 1);
		
		Color color = line1[0].getBackground();
		
		line1[0].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_DEAD_TILDE) {
					line1[0].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {
				line1[0].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[1].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_1) {
					line1[1].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[1].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[2].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_2) {
					line1[2].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[2].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[3].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_3) {
					line1[3].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[3].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[4].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_4) {
					line1[4].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[4].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[5].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_5) {
					line1[5].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[5].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[6].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_6) {
					line1[6].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[6].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[7].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_7) {
					line1[7].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[7].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[8].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_8) {
					line1[8].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[8].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[9].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_9) {
					line1[9].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[9].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[10].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_0) {
					line1[10].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[10].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[11].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_MINUS) {
					line1[11].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[11].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line1[12].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_ADD) {
					line1[12].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line1[12].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		backspace.addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					backspace.setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				backspace.setBackground(color);
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
