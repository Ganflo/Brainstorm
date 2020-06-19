/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trials;

/**
 *
 * @author Devin
 */
public class Tile {
    
    private String[] tileTypes = {"dirt","stone","copper","iron"};
    private String[] imageUrl = {"dirt.png","stone.png","copper.png","iron.png"};
    
    private int type;
    
    public Tile(int x) {
        type = x;
    }
    
    public String getImage() {
        return imageUrl[type];
    }
    public String toString() {
        return tileTypes[type];
    }
}
