/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roominventory;

/**
 *
 * @author dcrio
 */

//Clase Para el Inventario de sabanas

public class BedSheet implements InventoryItem {
    private int quantity;

    //Constructor con el atributo cantidad de sabanas
    
    public BedSheet(int quantity) {
        this.quantity = quantity;
    }

    //Sobrecarga del metodo getQuantity de la interface InventoryItem(Para obtener la cantidad) en este caso para obtener cantidad de sabanas
  
    @Override
    public int getQuantity() {
        return quantity;
    }

    //Sobrecarga del metodo setQuantity de la interface InventoryItem(Para establecer la cantidad) en este caso para hacer SET a la cantidad de sabanas
    
    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Sobrecarga del metodo getName de la interface InventoryItem(Para obtener el Nombre) en este caso para las sabanas
    
    @Override
    public String getName() {
        return "Sábana";
    }
}
