/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Feature to edit this template
 */
package model;

/**
 *
 * @author sohamchavan
 */
public class Feature {
    private Product owner;
    private String name;
    private Object value;
    
    public Feature (Product owner){
    this.owner = owner;
    }
    
    public Feature (Product owner,String name, Object value){
    this.name = name;
    this.value = value;
    }
    
}
