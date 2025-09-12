/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo4;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Falaq
 */
public class Insert extends Koneksi {

    Scanner sc = new Scanner(System.in);

    public void inputData() {
        // TODO code application logic here
        
            System.out.println("Input Urutan_Film");
            String urutan = sc.nextLine();
            System.out.println("Input Nama_Film");
            String nama = sc.nextLine();
            System.out.println("Input Rating_Film");
            String rating = sc.nextLine();
            System.out.println("Input Tahun");
            String tahun = sc.nextLine();

            String QUERY = "INSERT INTO Koleksi_Film VALUES ('" + urutan + "', '" + nama + "', '"
                    + rating + "', '" + tahun + "') ";
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(QUERY);
                System.out.println("Data Berhasil Ditambahkan");
            } catch (SQLException ex) {
                Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Apakah ingin menambahkan data lagi? (y = ya atau t = tidak)");
            char jwb = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            switch (jwb) {
                case 'y':
                    break;
                case 't':
                    System.out.println("Kembali Ke Menu Utama");
                    return;
                default:
                    System.out.println("Input tidak valid, kembali ke Menu Utama");
                    return;
            }
        }
    
}
