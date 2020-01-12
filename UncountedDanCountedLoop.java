/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uncounted.dan.counted.loop;

/**
 *
 * @author HP
 */
public class UncountedDanCountedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== counted loop for ===");
        for(int x = 1; x<8; x++){
            System.out.println("#####");
            
        System.out.println("=== counted loop for ke 2 ===");    
        for(int y = 4; y < 10; y++){
            System.out.println("ke"+y);
            
            
        System.out.println(" ===counted loop for ke 3 ===");
        for (int z = 2; z<=20; z+=3){
            System.out.println(z); // z+=3 (nilai z akan ditambah tiga (+3) di setiap pengulangan)
            
            
        System.out.println(" ===counted loop for each ===");
        //untuk membuat array
        int angka []={01,03,1995};
        
        // menggunakan perulangan For each untuk menampilkan angka
        for ( int k : angka){
        System.out.println(k);  
        
        //Perulangan uncounted loop terdirid dari perulangan While dan Do/While.
        System.out.println(" ===uncounted loop while ===");
        int a = 10;
        while (a <= 14){
            System.out.println("perulangan ke" + a); a++;
            
            
        System.out.println(" ===uncounted do while ===");
        int b = 10;
        do {
            System.out.println("perulangan ke-" + b); b++;  
        } while (b <=14);
        }
        }
        }
        }
            
        }
    }
    
}
