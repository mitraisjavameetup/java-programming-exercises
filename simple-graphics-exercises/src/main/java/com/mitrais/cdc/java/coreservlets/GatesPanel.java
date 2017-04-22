package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

public class GatesPanel extends JPanel {
	private Image image;

	public GatesPanel(String relativePath) {
		// get image from relativePath, and store it into variable
		try {
			image = ImageIO.read(new File(relativePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, getParent().getWidth(), getParent().getHeight(), this);
		// add mustache under here. PS: use simple line as his mustache
		 g.drawLine((getParent().getWidth() / 2 - 20),
		 (getParent().getHeight() / 2), (getParent().getWidth() / 2 + 20),
		 (getParent().getWidth() / 2));
	}
}
