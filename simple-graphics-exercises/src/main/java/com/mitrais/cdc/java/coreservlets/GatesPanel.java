package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class GatesPanel extends JPanel {
	private Image image;

	public GatesPanel(String relativePath) {
		// get image from relativePath, and store it into variable
		image = Toolkit.getDefaultToolkit().getImage(relativePath);
		setBackground(Color.BLUE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		
		// add mustache under here. PS: use simple line as his mustache
		// edit : it's word bubble
		int imgWidth = image.getWidth(this);
		int imgHeight = image.getHeight(this);
		g.setColor(Color.red);
		g.fillRoundRect(imgWidth*3/4, imgHeight/2, imgWidth*3/4+10, imgHeight/2, 30, 30);

	}
}
