/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trials;

import java.util.ArrayList;

/**
 *
 * @author Devin
 */
public class Board {
    
    private ArrayList<Tile> board;
    private int size;
    
    
    public Board(int in) {
        size = in;
        board = new ArrayList();
        for(int x = 0;x < size;x++) {
            board.add(new Tile(0));
        }
    }
    
    public int getSize() {
        return size;
    }
    public ArrayList<Tile> getBoard() {
        return board;
    }
}
