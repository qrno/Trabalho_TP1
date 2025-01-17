package handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener { 

	public boolean upPressed, downPressed, leftPressed, rightPressed, kPressed, anyPressed;

	public KeyHandler() {
	}

	public void keyTyped(KeyEvent event) {

	}

	public void keyPressed(KeyEvent event) {
		int keyCode = event.getKeyCode();

		switch (keyCode) {
			case KeyEvent.VK_W:
				upPressed = true;
				break;
			case KeyEvent.VK_S:
				downPressed = true;
				break;
			case KeyEvent.VK_A:
				leftPressed = true;
				break;
			case KeyEvent.VK_D:
				rightPressed = true;
				break;
			case KeyEvent.VK_K:
				kPressed = true;
				break;
			default:
				anyPressed = true;
				break;	
		}

	}

	public void keyReleased(KeyEvent event) {
		int keyCode = event.getKeyCode();

		switch (keyCode) {
			case KeyEvent.VK_W:
				upPressed = false;
				break;
			case KeyEvent.VK_S:
				downPressed = false;
				break;
			case KeyEvent.VK_A:
				leftPressed = false;
				break;
			case KeyEvent.VK_D:
				rightPressed = false;
				break;
			case KeyEvent.VK_K:
				kPressed = false;
				break;
			default:
				anyPressed = false;
				break;
		}
	}

}