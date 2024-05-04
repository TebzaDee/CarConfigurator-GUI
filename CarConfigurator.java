/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mphahlele.TA;

/**
 *
 * @author IC
 */
import java.util.ArrayList;
import java.util.Arrays;


public class CarConfigurator {
    private ArrayList<String> Polos;
    private ArrayList<String> SuvRange;
    private String carModelChoosen;
    private String extras;
    private double priceOfExtra;

    public CarConfigurator(String carModelChoosen, String extras, double priceOfExtra)
    {
    this.carModelChoosen = carModelChoosen;
    this.extras = extras;
    this.priceOfExtra = priceOfExtra;
    Polos = new ArrayList<>();
    SuvRange = new ArrayList<>();
    }


    public void setPolos(ArrayList<String> Polos)
    {
    this.Polos = Polos;
    }

    public void setSuvRange(ArrayList<String> SuvRange) 
    {
        this.SuvRange = SuvRange;
    }


    public void setCarModelChoosen(String carModelChoosen) 
    {
        this.carModelChoosen = carModelChoosen;
    }

    public void setExtras(String extras) 
    {
        this.extras = extras;
    }

    public void setPriceOfExtra(double priceOfExtra) 
    {
        this.priceOfExtra = priceOfExtra;
    }
    
    

    public ArrayList<String> getPolos() 
    {
        return Polos;
    }

    public ArrayList<String> getSuvRange() 
    {
        return SuvRange;
    }

    public String getCarModelChoosen() 
    {
        return carModelChoosen;
    }

    public String getExtras() 
    {
        return extras;
    }

    public double getPriceOfExtra() 
    {
        return priceOfExtra;
    }
    
    public double ExtraPrice(String choosenExtra, String carModel)
    {
        double price = 0;

        if (carModel.equalsIgnoreCase("Polos"))
        {
            for (int i = 0; i < Polos.size(); i++)
            {
                String polo = Polos.get(i);
                String[] model = polo.split("#");

                if (model[0].equalsIgnoreCase("sunroof")) 
                {
                    price += 25000;
                } 
                else if (model[0].equalsIgnoreCase("leatherUpolstrey")) 
                {
                    price += 12000;
                } 
                else if (model[0].equalsIgnoreCase("LowProfileMag"))
                {
                    price += 23000;
                }
                else if (model[0].equalsIgnoreCase("Sunroof")) 
                {
                    price += 29000;
                }
            }

        }
        else if (carModel.equalsIgnoreCase("SUV"))
        {
            for (int i = 0; i < SuvRange.size(); i++) 
            {
                String suv = SuvRange.get(i);
                String[] model = suv.split("#");

                if (model[0].equalsIgnoreCase("sunroof")) 
                {
                    price += 35000; 
                } 
                else if (model[0].equalsIgnoreCase("roofRack"))
                {
                    price += 5000;
                } 
                else if (model[0].equalsIgnoreCase("towBar")) 
                {
                    price += 8000;
                } 
                else if (model[0].equalsIgnoreCase("Navigation"))
                {
                    price += 15000;
                }
            }
        }

        return price;
    }
}



