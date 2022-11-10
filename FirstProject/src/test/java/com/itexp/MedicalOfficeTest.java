/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.itexp;

import com.itexp.firstproject.MedicalOffice;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bagat
 */
public class MedicalOfficeTest {
    MedicalOffice med;
    
    public MedicalOfficeTest() {
    }

    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        med = new MedicalOffice();
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void idCheck(){
    med.setId(101);
    assertEquals(101, med.getId());
    }
    
    @Test
    public void nameCheck(){
        med.setName("Amigos");
        assertEquals ("Amigos", med.getName());
    }
    
}
