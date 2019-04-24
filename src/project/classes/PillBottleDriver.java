package project.classes;

import javafx.application.Application;


public class PillBottleDriver {

    
    public static void main(String[] args) {
        try {
            Application.launch(PillBottle.class, args);
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
            System.exit(1);
        } // try                                                                               
    } // main                                                                        
} // GalleryDriver      
