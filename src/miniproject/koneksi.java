package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    private String url="jdbc:mysql://localhost/saladmoy";
    private String username_xampp="root";
    private String password_xampp="";
    Connection conDB;
    
    private static java.sql.Connection koneksi;
    
    public void connect(){
        try {
            conDB=DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
    }    
    public Connection getCon() {
        return conDB;
    }
    
    public static java.sql.Connection getKoneksi(){
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost/saladmoy";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
                
            }catch(Exception e){
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    public static void main(String args []){getKoneksi();
    }
}

