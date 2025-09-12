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
public class Read extends Koneksi {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Berikut Data dari Tabel Koleksi_Film : ");

        
        String QUERY = "SELECT * FROM Koleksi_Film ";
        
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {
                //Display values
                System.out.println("Urutan_Film: " + String.valueOf(rs.getObject(1)));
                System.out.println("Nama_Film: " + String.valueOf(rs.getObject(2)));
                System.out.println("Rating: " + String.valueOf(rs.getObject(3)));
                System.out.println("Tahun : " + String.valueOf(rs.getObject(4)));
                System.out.println("                                                     ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Apakah ingin kembali ke menu? (y = ya atau t = tidak)");
            char jwb = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            switch (jwb) {
                case 'y':
                    System.out.println("Kembali Ke Menu Utama");
                    return;
                default :
                    System.out.println("Input tidak valid, kembali ke Menu Utama");
                    return;
            }
    }
}
