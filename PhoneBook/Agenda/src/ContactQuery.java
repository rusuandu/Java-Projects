
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public class ContactQuery {
    
    public void insertContact(contactPrivate cnt) {
        boolean contactIsCreated = true;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        
            try {
                ps = con.prepareStatement("INSERT INTO contacte(Nume, Prenume, DataNasterii, Sex, NumarDeTelefon, TipTelefon) VALUES(?, ?, ?, ?, ?, ?)");
                ps.setString(1, cnt.getFnume());
                ps.setString(2, cnt.getLnume());
                ps.setString(3, cnt.getBdate());
                ps.setString(4, cnt.getSex());
                ps.setString(5, cnt.getPhone());
                ps.setString(6, cnt.getTipTel());
                
                if(ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Un nou contact a fost adaugat");
                    contactIsCreated = true;
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Contactul nu a fost creat. Incercati din nou.");
                    contactIsCreated = false;
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(contactPrivate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    public void updateContact(contactPrivate cnt) {
        boolean contactIsCreated = true;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String updateQuery = "UPDATE contacte SET Nume= ?, Prenume= ?, DataNasterii= ?, Sex= ?, NumarDeTelefon= ?, TipTelefon= ? WHERE id= ?";
        
            try {
                ps = con.prepareStatement(updateQuery);
                ps.setString(1, cnt.getFnume());
                ps.setString(2, cnt.getLnume());
                ps.setString(3, cnt.getBdate());
                ps.setString(4, cnt.getSex());
                ps.setString(5, cnt.getPhone());
                ps.setString(6, cnt.getTipTel());
                ps.setInt(7, cnt.getCid());
                if(ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Contactul a fost editat");
                    contactIsCreated = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Contactul nu a fost creat. Incercati din nou.");
                    contactIsCreated = false;
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(contactPrivate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        public void deleteContact(int cid) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String updateQuery = "DELETE FROM contacte WHERE id= ?";
        
            try {
                ps = con.prepareStatement(updateQuery);
                ps.setInt(1, cid);
                
                if(ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Contactul a fost sters");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Contactul nu a fost creat. Incercati din nou.");
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(contactPrivate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    public ArrayList<contactPrivate> contactList() {
        ArrayList<contactPrivate> cList = new ArrayList<>();
        
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        String executeQuery = "SELECT * FROM contacte";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(executeQuery);
            
            contactPrivate cnt;
            
            while(rs.next()) {
                cnt = new contactPrivate (rs.getInt("id"),
                                          rs.getString("Nume"),
                                          rs.getString("Prenume"),
                                          rs.getString("DataNasterii"),
                                          rs.getString("Sex"),
                                          rs.getString("NumarDeTelefon"),
                                          rs.getString("TipTelefon"));
                cList.add(cnt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(contactPrivate.class.getName()).log(Level.SEVERE, null, ex);   
    }
        return cList;
    
    }
    
    
    
    public ArrayList<contactPrivate> cautareCnt(String valToSearch) {
        ArrayList<contactPrivate> cList = new ArrayList<contactPrivate>();
        
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        String searchQuery = "SELECT * FROM contacte WHERE CONCAT (Nume, Prenume, Sex, NumarDeTelefon, TipTelefon) LIKE '%"+valToSearch +"%'";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(searchQuery);
            
            contactPrivate cnt;
            
            while(rs.next()) {
                cnt = new contactPrivate (rs.getInt("id"),
                                          rs.getString("Nume"),
                                          rs.getString("Prenume"),
                                          rs.getString("DataNasterii"),
                                          rs.getString("Sex"),
                                          rs.getString("NumarDeTelefon"),
                                          rs.getString("TipTelefon"));
            
           cList.add(cnt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(contactPrivate.class.getName()).log(Level.SEVERE, null, ex);   
    }
        return cList;
    
    }
    
    public ArrayList<contactPrivate> filtrareNrFix() {
        ArrayList<contactPrivate> cList = new ArrayList<contactPrivate>();
        
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        String searchQuery = "SELECT * FROM contacte WHERE CONCAT (Nume, Prenume, Sex, NumarDeTelefon, TipTelefon) LIKE '%Fix%'";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(searchQuery);
            
            contactPrivate cnt;
            
            while(rs.next()) {
                cnt = new contactPrivate (rs.getInt("id"),
                                          rs.getString("Nume"),
                                          rs.getString("Prenume"),
                                          rs.getString("DataNasterii"),
                                          rs.getString("Sex"),
                                          rs.getString("NumarDeTelefon"),
                                          rs.getString("TipTelefon"));
            
           cList.add(cnt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(contactPrivate.class.getName()).log(Level.SEVERE, null, ex);   
    }
        return cList;
    
    }
    
    public ArrayList<contactPrivate> filtrareMobil() {
        ArrayList<contactPrivate> cList = new ArrayList<contactPrivate>();
        
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        String searchQuery = "SELECT * FROM contacte WHERE CONCAT (Nume, Prenume, Sex, NumarDeTelefon, TipTelefon) LIKE '%Mobil%'";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(searchQuery);
            
            contactPrivate cnt;
            
            while(rs.next()) {
                cnt = new contactPrivate (rs.getInt("id"),
                                          rs.getString("Nume"),
                                          rs.getString("Prenume"),
                                          rs.getString("DataNasterii"),
                                          rs.getString("Sex"),
                                          rs.getString("NumarDeTelefon"),
                                          rs.getString("TipTelefon"));
            
           cList.add(cnt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(contactPrivate.class.getName()).log(Level.SEVERE, null, ex);   
    }
        return cList;
    
    }
    
    public ArrayList<contactPrivate> filtrareLunaCurenta() {
        ArrayList<contactPrivate> cList = new ArrayList<contactPrivate>();
        
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        String searchQuery = "SELECT * FROM contacte WHERE MONTH(DataNasterii) = MONTH(CURDATE())";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(searchQuery);
            
            contactPrivate cnt;
            
            while(rs.next()) {
                cnt = new contactPrivate (rs.getInt("id"),
                                          rs.getString("Nume"),
                                          rs.getString("Prenume"),
                                          rs.getString("DataNasterii"),
                                          rs.getString("Sex"),
                                          rs.getString("NumarDeTelefon"),
                                          rs.getString("TipTelefon"));
            
           cList.add(cnt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(contactPrivate.class.getName()).log(Level.SEVERE, null, ex);   
    }
        return cList;
    
    }
    
    public ArrayList<contactPrivate> filtrareZiCurenta() {
        ArrayList<contactPrivate> cList = new ArrayList<contactPrivate>();
        
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        String searchQuery = "SELECT * FROM contacte WHERE DAY(DataNasterii) = DAY(CURDATE())";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(searchQuery);
            
            contactPrivate cnt;
            
            while(rs.next()) {
                cnt = new contactPrivate (rs.getInt("id"),
                                          rs.getString("Nume"),
                                          rs.getString("Prenume"),
                                          rs.getString("DataNasterii"),
                                          rs.getString("Sex"),
                                          rs.getString("NumarDeTelefon"),
                                          rs.getString("TipTelefon"));
            
           cList.add(cnt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(contactPrivate.class.getName()).log(Level.SEVERE, null, ex);   
    }
        return cList;
    
    }
}

