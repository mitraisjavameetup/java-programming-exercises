package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class GatesPanel extends JPanel {
	private Image image;

	public GatesPanel(String relativePath) {
		// get image from relativePath, and store it into variable
		this.image = Toolkit.getDefaultToolkit().getImage(relativePath);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this);
		g.setColor(Color.BLACK);
		g.drawLine(472, 216, 500, 217);
		g.drawLine(472, 217, 500, 218);
		g.drawLine(472, 218, 500, 219);
		g.drawLine(472, 219, 500, 220);

		// add mustache under here. PS: use simple line as his mustache

	}
}
