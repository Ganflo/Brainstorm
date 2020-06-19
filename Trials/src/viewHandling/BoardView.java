/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewHandling;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import trials.Board;

/**
 *
 * @author Devin
 */
public class BoardView {
    
    private ArrayList<ImageView> view;
    
    public BoardView(Board in) {
        view = new ArrayList<>();
        for(int x = 0;x < in.getSize();x++) {
            view.add(new ImageView(new Image(in.getBoard().get(x).getImage())));
        }
    }
    
    
    public ArrayList<ImageView> getView() {
        return view;
    }
}
