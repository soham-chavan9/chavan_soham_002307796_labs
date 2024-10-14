/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author sohamchavan
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon prodImage;
    
    private ArrayList<Feature> features;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<Feature>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public ImageIcon getProdImage() {
        return prodImage;
    }

    public void setProdImage(ImageIcon prodImage) {
        this.prodImage = prodImage;
    }
    
    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
    
    public Feature addNewFeature(Product owner) {
        Feature f = new Feature(owner);
        features.add(f);
        return f;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
}

