/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaskalkulator_123210179;
import bangunbidang.PersegiPanjang;
import bangunruang.Balok;
import javax.swing.*; 
import java.awt.event.*;


/**
 *
 * @author M S I
 */ 

public class GUI extends JFrame implements ActionListener {
 JLabel labeljudul = new JLabel("Cuboid Calculator");

    JLabel labelpanjang = new JLabel("Length");
    JTextField txtfpanjang = new JTextField(20); 
    JLabel spasi= new JLabel("");
    JTextField txtfspasi = new JTextField(20); 
    JLabel labellebar = new JLabel("Width");
    JTextField txtflebar = new JTextField(20); 
    JLabel labeltinggi = new JLabel("Higth");
    JTextField txtftinggi = new JTextField(20);
       
    JLabel labelhasil = new JLabel("Result");
    JLabel labelluas = new JLabel();
    JLabel labelkeliling = new JLabel();
    JLabel labelluaspermukaan = new JLabel();
    JLabel labelvolume = new JLabel();
       
    JButton btnhitung = new JButton("Hitung");
    JButton btnreset = new JButton("Reset");

    public GUI() {
        setTitle("Cuboid Kalkulator");
           
        setSize(350, 400);
        setLayout(null);
        add(labeljudul);
        add(labelpanjang);
        add(txtfpanjang); 
        add(spasi);
        add(txtfspasi);
        add(labellebar);
        add(txtflebar);
        add(labeltinggi);
        add(txtftinggi);
        
        add(labelhasil);
        add(labelluas);
        add(labelkeliling);
        add(labelluaspermukaan);
        add(labelvolume);
        
        add(btnhitung);
        add(btnreset);
           
    
        labeljudul.setBounds(110,3,200,40);
        labelpanjang.setBounds(30,40,100,25);
        txtfpanjang.setBounds(140,40,170,25);  
        labellebar.setBounds(30,70,100,25);
        txtflebar.setBounds(140,70,170,25);
        labeltinggi.setBounds(30,100,100,25);
        txtftinggi.setBounds(140,100,170,25);
       
        labelhasil.setBounds(150,130,100,35);
        labelluas.setBounds(40,160,215,35);
        labelkeliling.setBounds(40,185,215,35);
        labelluaspermukaan.setBounds(40,215,200,35);
        labelvolume.setBounds(40,235,200,35);
        
        btnhitung.setBounds(80,290,90,25);
        btnreset.setBounds(180,290,80,25);
           
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       
        btnhitung.addActionListener(this);
        btnreset.addActionListener(this);
       }

    @Override
    public void actionPerformed(ActionEvent e) {
         int panjang, lebar, tinggi;
           
        if (e.getSource() == btnhitung) {
            if (txtfpanjang.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "input Panjangnya");
            } else if (txtflebar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "input lebar");
            } else if (txtftinggi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "input tinggi");
            } else {
                try {
                    panjang = Integer.parseInt(txtfpanjang.getText());
                    lebar = Integer.parseInt(txtflebar.getText());
                    tinggi = Integer.parseInt(txtftinggi.getText());
                    
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    
                    labelluas.setText("Luas Persegi Panjang       : " + balok.hitungluas());
                    labelkeliling.setText("Keliling Persegi panjang     : " + balok.hitungkeliling());
                    labelluaspermukaan.setText("Luas Permukaan Balok : " + balok.hitungluaspermukan());
                    labelvolume.setText("Volume Balok         : " + balok.hitungvolume());
                } catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(this, "inputan Harus  Angka!");
                }
            }
        }
           
        if (e.getSource() == btnreset) {
            labelluas.setText(" ");
            labelkeliling.setText(" ");
            labelluaspermukaan.setText(" ");
            labelvolume.setText(" ");
            txtfpanjang.setText("");
            txtflebar.setText("");
            txtftinggi.setText("");
        }
    }
}

