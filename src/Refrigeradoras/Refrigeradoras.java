package refrigeradoras;
import entidades.Refri;
import implementacion.ImplRefri;

public class Refrigeradoras {
    public static void main(String[] args) {
        Refri r=new Refri();
        r.setProd_id("1");
        r.setProd_nombre("ultra pro50");
        r.setProd_precio("1500");
        r.setProd_marca("LG");
        
        Refri r2=new Refri();
        r2.setProd_id("2");
        r2.setProd_nombre("master 01");
        r2.setProd_precio("1700");
        r2.setProd_marca("samsung");
        
        ImplRefri ic=new ImplRefri();
        ic.agregarRefri(r);
        ic.agregarRefri(r2);
        ic.reporteRefri();
       
        
        
    }
}
