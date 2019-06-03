import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoPanelL2 extends JPanel{
	
	String[] line_2 = {"Tab","Q","W","E","R","T","Y","U","I","O","P","[","]","/"};
	JButton[] line2 = new JButton[14];
	
	GridBagLayout layoutTeclado = new GridBagLayout();
	GridBagConstraints conteiner = new GridBagConstraints();
	
	public TecladoPanelL2() {
		setLayout(layoutTeclado);
		
		for (int i = 0; i < line2.length; i++) {
			line2[i] = new JButton(line_2[i]);
		}
		
		for (int i = 0; i < line2.length; i++) {
			if (i == 0) {
				addComponent(line2[i],1,i,1,1);
			}
			else {
				addComponent(line2[i],1,i,1,1);
			}
		}
		
		Color color = line2[0].getBackground();
		
		line2[0].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_TAB) {
					line2[0].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {
				line2[0].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[1].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_Q) {
					line2[1].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[1].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[2].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_W) {
					line2[2].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {	
				line2[2].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[3].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_E) {
					line2[3].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {	
				line2[3].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[4].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_R) {
					line2[4].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[4].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[5].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_T) {
					line2[5].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[5].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[6].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_Y) {
					line2[6].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[6].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[7].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_U) {
					line2[7].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[7].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[8].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_I) {
					line2[8].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[8].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[9].addKeyListener( new KeyListener(){ 
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_O) {
					line2[9].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[9].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[10].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_P) {
					line2[10].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[10].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[11].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_OPEN_BRACKET) {
					line2[11].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[11].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[12].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET) {
					line2[12].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[12].setBackground(color);
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		
		line2[13].addKeyListener( new KeyListener(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_SLASH) {
					line2[13].setBackground(Color.GREEN);
				}	
			}
			@Override
			public void keyReleased(KeyEvent e) {		
				line2[13].setBackground(color);
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
