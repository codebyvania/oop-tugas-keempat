/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo4;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Falaq
 */
public class Create extends Koneksi{
    public static void createTable(){
        System.out.println("Membuat Table Koleksi_Film. . . ");

        String QUERY = "CREATE TABLE Koleksi_Film ("
                + "Urutan_Film VARCHAR(10) PRIMARY KEY, "
                + "Nama_Film VARCHAR(100), "
                + "Rating_Film VARCHAR(10), "
                + "Tahun CHAR(10));";
        
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(QUERY);
            System.out.println("Tabel berhasil dibuat");
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
