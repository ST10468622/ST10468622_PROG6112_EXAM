/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package productapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class ProductCalculationsTest {
    
    public ProductCalculationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        // Arrange
        ProductCalculations calc = new ProductCalculations(3500.0);
        double expected = 525.0;

        // Act
        double actual = calc.GetVat();

        // Assert
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        // Arrange
        ProductCalculations calc = new ProductCalculations(3500.0);
        double expected = 4200.0;

        // Act
        double actual = calc.GetTotal();

        // Assert
        assertEquals(expected, actual, 0.001);
    }
}
