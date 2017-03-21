package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;
import javax.tools.Tool;

public class GatesPanel extends JPanel {
	private Image image;

	public GatesPanel(String relativePath) {
		//get image from relativePath, and store it into variable
		this.image = Toolkit.getDefaultToolkit().getImage(relativePath);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this);
		//add mustache under here. PS: use simple line as his mustache
		g.setColor(Color.RED);
		g.drawLine(500, 300, 550, 300);
		g.drawLine(500, 400, 550, 400);
		g.setColor(Color.YELLOW);
		g.drawString("HELLO GUYS !!!", this.getWidth()/2, this.getHeight()/2);
		g.drawRoundRect(250, 10, 250, 250, 20, 20);

	}
}
