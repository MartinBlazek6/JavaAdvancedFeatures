package org.example.fileManipulation.images;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class DisplayPhotos extends JFrame {

    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;
    private static final int DELAY_MS = 5000; // 5 seconds

    private ArrayList<File> photoFiles;
    private int currentPhotoIndex = 0;

    public DisplayPhotos() {
        setTitle("Photo Viewer");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        photoFiles = new ArrayList<>();
        String directoryPath = "src/main/java/org/example/fileManipulation/images/imagesBank";
        File directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println("The provided path is not a valid directory.");
            return;
        }

        exploreDirectory(directory);
        displayPhoto();

        Timer timer = new Timer(DELAY_MS, e -> {
            currentPhotoIndex = (currentPhotoIndex + 1) % photoFiles.size();
            displayPhoto();
        });
        timer.start();
    }

    private void exploreDirectory(File directory) {
        File[] files = directory.listFiles();

        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                // Recursively explore subdirectories
                exploreDirectory(file);
            } else {
                // Check if the file is an image (.png or .jpg)
                String fileName = file.getName().toLowerCase();
                if (fileName.endsWith(".png") || fileName.endsWith(".jpg")) {
                    photoFiles.add(file);
                }
            }
        }
    }

    private void displayPhoto() {
        if (photoFiles.isEmpty()) {
            return;
        }

        File currentPhotoFile = photoFiles.get(currentPhotoIndex);
        try {
            BufferedImage image = ImageIO.read(currentPhotoFile);
            if (image != null) {
                getContentPane().removeAll();
                JLabel imageLabel = new JLabel(new ImageIcon(image));
                getContentPane().add(imageLabel, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DisplayPhotos().setVisible(true);
        });
    }
}
