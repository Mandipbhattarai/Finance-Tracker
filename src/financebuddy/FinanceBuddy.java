 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package financebuddy;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author nepal
 */
public class FinanceBuddy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Database linking here
        try {
             Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= null;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
            if(con!=null){
                System.out.println("Connected to the database successfully");
                MainUi main_ui = new MainUi();
                main_ui.pack();
                main_ui.setLocationRelativeTo(null);
                main_ui.setVisible(true);
            }else{
                System.out.println("Error in connecting the database");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        
        
        
       
        // TODO code application logic here
    }
    
}
