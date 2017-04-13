package com.mitrais.cdc.java.three;
import java.awt.*;

/** A Frame that you can actually quit. Used as the starting
 *  point for most AWT-based graphical applications.
 */

public class CloseableFrame extends Frame {
  public CloseableFrame(String title) {
    super(title);
    addWindowListener(new ExitListener());
  }
}