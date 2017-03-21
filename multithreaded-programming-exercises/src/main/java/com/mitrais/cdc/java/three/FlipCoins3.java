package com.mitrais.cdc.java.three;
import java.awt.*;
import java.util.concurrent.*;
import javax.swing.*;


/**
 * Print heads result counter on the JFrame
 * @author Egi
 * @version 1.0
 */
public class FlipCoins3 extends JFrame {
  /**
   * FlipCoins3 constructor
   */
  public FlipCoins3() {
    super("Flipping Coins");
    getContentPane().setLayout(new GridLayout(5, 1));
    
    int poolSize = 10;
    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    ExecutorService taskList = Executors.newFixedThreadPool(poolSize);
    
    for(int i=0; i<5; i++) {
      JLabel label = new JLabel();
      label.setFont(new Font("SansSerif", Font.PLAIN, 60));
      
      //TODO: add line to instantiate labelling coin flipper and execute it.
      taskList.execute(new LabelingCoinFlipper(label));
      
      add(label);
    }
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  /**
   * FlipCoins3 main method
   * @param args
   */
  public static void main(String[] args) {
    new FlipCoins3();
  }
}