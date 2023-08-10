package com.Realms_of_the_Skullasaurus.Realms;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Realms_Main {
    public static void main(String[] args) {

        Institute_of_MonsterlordAxis_Technology institute = new Institute_of_MonsterlordAxis_Technology();
        institute.fundIncrease("small");
        institute.projectStart("small");

        // Get the URL of the HTML file
        URL htmlFileURL = Realms_Main.class.getResource("Realms_index.html");

        // Check if Desktop is supported on this platform
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();

            // Check if the specified file URL is valid
            if (htmlFileURL != null) {
                try {
                    // Open the HTML file in the default web browser
                    desktop.browse(htmlFileURL.toURI());
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("The specified file does not exist or is not a file.");
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }
}

