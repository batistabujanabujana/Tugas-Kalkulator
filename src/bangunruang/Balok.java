/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

import bangunbidang.PersegiPanjang;

/**
 *
 * @author M S I
 */
public class Balok extends PersegiPanjang implements Ruang{ 
     int tinggi;   

    public Balok(int tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

  

    @Override
    public double hitungluaspermukan() {
        
     return 2*((this.panjang*this.panjang)+(this.panjang*this.tinggi)+(this.lebar+this.tinggi));   
    }

    @Override
    public double hitungvolume() {
        
     return this.panjang*this.lebar*this.tinggi;   
    }

  
     

}

    