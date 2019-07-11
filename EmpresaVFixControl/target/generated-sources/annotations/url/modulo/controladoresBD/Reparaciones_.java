package url.modulo.controladoresBD;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2019-07-10T10:49:18", comments="EclipseLink-2.7.4.v20190115-rNA")
@StaticMetamodel(Reparaciones.class)
public class Reparaciones_ { 

    public static volatile SingularAttribute<Reparaciones, String> descripcion;
    public static volatile SingularAttribute<Reparaciones, Short> bateria;
    public static volatile SingularAttribute<Reparaciones, String> servicio;
    public static volatile SingularAttribute<Reparaciones, Short> cargador;
    public static volatile SingularAttribute<Reparaciones, String> nombre;
    public static volatile SingularAttribute<Reparaciones, String> marca;
    public static volatile SingularAttribute<Reparaciones, Date> fecha;
    public static volatile SingularAttribute<Reparaciones, Double> precio;
    public static volatile SingularAttribute<Reparaciones, Integer> idReparacion;
    public static volatile SingularAttribute<Reparaciones, Short> micro;
    public static volatile SingularAttribute<Reparaciones, Short> sim;
    public static volatile SingularAttribute<Reparaciones, String> accesorios;
    public static volatile SingularAttribute<Reparaciones, String> imei;

}