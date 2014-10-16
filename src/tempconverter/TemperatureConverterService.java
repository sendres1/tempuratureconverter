/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tempconverter;

/**
 *
 * @author sendres1
 */
public class TemperatureConverterService throws NumberFormatException(){
    
    public double getCelciusFromFahrenheit(double fahrenheit) {
            return (fahrenheit - 32) *5/9;
            
    }        
            
    public String getCelciusFromFahrenheit(String fahrenheit){
            double f = Double.valueOf(fahrenheit);
            double c = (f-32) * 5/9;
    //        return "" + c;
            return String.valueOf(c);
     }
    
}
