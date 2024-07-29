package com.work.graphics;

import javax.swing.SwingUtilities;

/**
 *
 * @author linux
 */
public class Main {

    public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> Julia.createWin("Julia", 640, 480));
    }
}
