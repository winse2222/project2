/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexp.firstproject;

/**
 *
 * @author bagat
 */
public class MedicalOffice {
    
    
    private int id;
    private String name;
    private String address;

    
    
    
    @Override
    public String toString() {
        return "MedicalOffice{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }

    
    
    
    public MedicalOffice() {
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
