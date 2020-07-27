/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIRs  Family
 */
public class TesSuara {
     public static void main(String[] args)
    {
        Hewan hewan1 = new Hewan();
        hewan1.nama = "Binatang Abstrak";
        hewan1.mengeluarkanSuara();
 
        kucing kucing1 = new kucing();
        kucing1.nama = "Kitten";
        kucing1.mengeluarkanSuara();
 
        Hewan hewan2 = new kucing();
        hewan2.nama = "Mew";
 
    }
}
