package implementacion;
import conexion.ConectaDBSqlite;
import entidades.Refri;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ImplRefri {
    ConectaDBSqlite rr=new ConectaDBSqlite();
    Refri cli=new Refri();
    
    ArrayList<Refri>listaRefrigeradoras = new ArrayList<>();
    
    public void agregarRefri(Refri ref){
        try {
            String query="insert into refrigeradoras values('"+ref.getProd_id()+"','"+ref.getProd_nombre()+"','"+ref.getProd_precio()+"','"+ref.getProd_marca()+"')";
            Statement st = rr.getConnect().createStatement();
            st.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void reporteRefri(){
        try {
            String query="select * from refrigeradoras";
            Statement st = rr.getConnect().createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                Refri ref = new Refri();
                ref.setProd_id(rs.getString(1));
                ref.setProd_nombre(rs.getString(2));
                ref.setProd_precio(rs.getString(3));
                ref.setProd_marca(rs.getString(4));
                listaRefrigeradoras.add(ref);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
            
        }
    }
}