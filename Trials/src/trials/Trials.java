/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trials;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import viewHandling.BoardView;

/**
 *
 * @author Devin
 */
public class Trials extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        TilePane root = new TilePane();
        root.setMaxHeight(100);
        root.setMaxWidth(100);
        
        Board board = new Board(100);
        BoardView view = new BoardView(board);
        
        for(int x = 0;x < board.getSize();x++) {
            root.getChildren().add(view.getView().get(x));
        }
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
