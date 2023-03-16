// Author: Henok Haile
// Date: 2023-03-16
// Email: konehus@gmail.com

package aries;

import java.awt.*;
import java.awt.event.*;

// SplashScreenDemo class, which extends Frame and implements ActionListener
public class SplashScreenDemo extends Frame implements ActionListener{

    // Constructor for SplashScreenDemo
    public SplashScreenDemo(){
        super("SplashScreen demo");

        setSize(350, 200);
        setLayout(new BorderLayout());

        // Create File menu with Exit menu item
        Menu m1 = new Menu("File");
        MenuItem mi1 = new MenuItem("Exit");
        m1.add(mi1);
        mi1.addActionListener(this);

        // Add window listener to handle window closing events
        this.addWindowListener(closeWindow);

        // Create menu bar and add File menu to it
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        mb.add(m1);

        // Get SplashScreen instance
        final SplashScreen splash = SplashScreen.getSplashScreen();

        // Check if splash is null
        if (splash == null) {
            System.out.println("SplashScreen.getSplashScreen() returned null");
            return;
        }

        // Create Graphics2D instance for drawing
        Graphics2D g = splash.createGraphics();

        // Check if g is null
        if (g == null) {
            System.out.println("g is null");
            return;
        }

        // Update the splash screen during loading
        for(int i=0; i<100; i++) {
            renderSplashFrame(g, i);
            splash.update();
            try {
                Thread.sleep(90);
            }
            catch(InterruptedException e) {
            }
        }

        // Close the splash screen and show the main window
        splash.close();
        setVisible(true);
        toFront();
    }
    
    // Main method
    public static void main (String args[]) {
        SplashScreenDemo test = new SplashScreenDemo();
    }

    // Method to render the splash screen frame
    static void renderSplashFrame(Graphics2D g, int frame) {
        final String[] data = { "hade", "kilite", "seleste"};
        g.setComposite(AlphaComposite.Clear);
        g.fillRect(120,140,200,40);
        g.setPaintMode();
        g.setColor(Color.BLACK);
        g.drawString("Loading "+data[(frame/5)%3]+"...", 120, 150);
    }

    // ActionPerformed method to handle exit action
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
    
    // WindowListener to handle window closing events
    private static WindowListener closeWindow = new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            e.getWindow().dispose();
        }
    };
}
