/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsales.main;

/**
 *
 * @author Student
 */
public class Product implements IProduct {
    
 
    private String[] products;
    private int[][] sales;

    public Product(String[] products, int[][] sales) {

        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                total += sales[i][j];
            }
        }

        return total;
    }

    @Override
    public double GetAverageProductSold() {

        return (double) GetTotalProductsSold()
                / (sales.length * sales[0].length);
    }

    @Override
    public String GetMostPopularProduct() {

        int highest = 0;
        String popularProduct = "";

        for (int i = 0; i < sales.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {

                total += sales[i][j];
            }

            if (total > highest) {

                highest = total;
                popularProduct = products[i];
            }
        }

        return popularProduct + " (" + highest + ")";
    }
}
