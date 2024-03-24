/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roominventory;

/**
 *
 * @author dcrio
 */
//Clase Para el Inventario de toallas
public class Towel implements InventoryItem {

    private int quantity;

    //constructor 
    public Towel(int quantity) {
        this.quantity = quantity;
    }

    //Sobrecarga del metodo getQuantity de la interface InventoryItem(Para obtener la cantidad) en este caso para obtener cantidad de Toallas
    @Override
    public int getQuantity() {
        return quantity;
    }

    //Sobrecarga del metodo setQuantity de la interface InventoryItem(Para establecer la cantidad) en este caso para hacer SET a la cantidad de Toallas
    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Sobrecarga del metodo getName de la interface InventoryItem(Para obtener el Nombre) en este caso para las Toallas
    @Override
    public String getName() {
        return "Toalla";
    }
}
