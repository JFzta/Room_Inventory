/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roominventory;

/**
 *
 * @author dcrio
 */
import java.util.ArrayList;
import java.util.List;

//Clase para el arreglo de items del inventario
public final class RoomType {

    //definimos un arreglo con la interface InventoryItem que nos permitira modificar(nombre y cantidad) los item
    protected List<InventoryItem> inventoryItems;

    //constructores
    public RoomType() {
        this.inventoryItems = new ArrayList<>();
        setDefaultInventory(0, 0);
    }

    public RoomType(int towelQuantity, int bedSheetQuantity) {
        this.inventoryItems = new ArrayList<>();
        setDefaultInventory(towelQuantity, bedSheetQuantity);
    }

    //metodo para dar un inventario por defecto(lo que normalmente tienen todas) a una habitacion
    public void setDefaultInventory(int towelQuantity, int bedSheetQuantity) {
        inventoryItems.add(new Towel(towelQuantity));
        inventoryItems.add(new BedSheet(bedSheetQuantity));
        inventoryItems.add(new Television());
        inventoryItems.add(new Couch());
    }

    //metodo para obtener el inventario(items)
    public List<InventoryItem> getInventory() {
        return inventoryItems;
    }
}
