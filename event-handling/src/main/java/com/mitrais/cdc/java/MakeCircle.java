package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MakeCircle extends JPanel {
    private static final long serialVersionUID = 1L;
    private ArrayList<Point> points;
    public boolean inCircle(double x1,double x2, double y1, double y2) {
    	double d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
    	if (d<20) {
    		return true;
		} else {
			return false;
		}	
	}
    public MakeCircle() {
        points = new ArrayList<Point>();
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            	if (e.getButton()==MouseEvent.BUTTON1) {
            		points.add(new Point(e.getX(), e.getY()));
                    repaint();
				}
            	else if (e.getButton()==MouseEvent.BUTTON3) {
            		for (int i = 0; i < points.size(); i++) {
            			if (inCircle(points.get(i).getX(),e.getX(), points.get(i).getY(),e.getY())==true) {
							points.remove(i);
						}
					}
            		repaint();
				}
                
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        for (Point point : points) {
            g.fillOval(point.x, point.y, 20, 20);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.add(new MakeCircle());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 400);
                frame.setVisible(true);
            }
        });
    }

}