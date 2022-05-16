package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaDBSqlite {
    String url = "D:\\PR obj\\sqlite-tools-win32-x86-3380500\\refrigeradoras\\";
    Connection connect;
    
    public Connection getConnect(){
    try {
        connect = DriverManager.getConnection("jdbc:sqlite:"+url);
        if (connect!=null) {
            System.out.println("Conectado");
        }
    }catch (SQLException ex) {
        System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
    }
    return connect;
    }
    
    public void close(){
           try {
               connect.close();
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
    }
    public static void main(String[] args) {
        ConectaDBSqlite c=new ConectaDBSqlite();
        c.getConnect();
    }
}
