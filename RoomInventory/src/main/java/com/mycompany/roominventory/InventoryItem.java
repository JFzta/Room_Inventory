/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.roominventory;

//Interface InventoryItem Para la sobrecarga de los metodos que se usan para el roominventory(por ejemplo los de las clases Couch y BedSheet)

public interface InventoryItem {
    int getQuantity();
    void setQuantity(int quantity);
    String getName();
}
