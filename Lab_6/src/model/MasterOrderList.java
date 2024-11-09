/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sohamchavan
 */
class MasterOrderList {
    ArrayList<Order> OrderList;
    
    public MasterOrderList(){
        OrderList = new ArrayList<Order>(); 
    }

    public ArrayList<Order> getOrderList() {
        return OrderList;
    }

    public void setOrderList(ArrayList<Order> OrderList) {
        this.OrderList = OrderList;
    }
    
    public void addNewOrder(Order order)
    {
        this.OrderList.add(order);
    }
}
