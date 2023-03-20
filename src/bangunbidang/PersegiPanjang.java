/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunbidang;

/**
 *
 * @author M S I
 */
public class PersegiPanjang implements Bidang{
   public double panjang,lebar; 

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    } 

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    

    @Override
    public double hitungluas() { 
        return this.panjang*this.lebar;
        
    }

    @Override
    public double hitungkeliling() { 
        return 2*(this.panjang+this.lebar); 
    
    }
    
    
}
