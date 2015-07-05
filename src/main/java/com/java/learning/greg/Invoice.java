
package com.java.learning.greg;


public class Invoice
{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice (String partNumber, String partDescription, int quantity, double price)
    {
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPrice(price);
    }

    public void setPartNumber(String partNum)
    {
        partNumber = partNum;
    }

    public String getPartNumber()
    {
        return partNumber;
    }

    public void setPartDescription(String partDscrpt)
    {
        partDescription = partDscrpt;
    }

    public String getPartDescription()
    {
        return partDescription;
    }

    public void setQuantity(int total)
    {
        if(total>=0) {
            this.quantity = total;
        }
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setPrice(double cost)
    {
        if(cost >= 0.0) {
            price = cost;
        }
    }

    public double getPrice()
    {
        return price;
    }

    public double getInvoiceAmount()
    {
        double totalBill = price * quantity;
        return totalBill;
    }
}
