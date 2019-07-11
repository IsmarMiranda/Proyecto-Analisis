package url.modulo.controladoresBD;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2019-07-10T10:49:18", comments="EclipseLink-2.7.4.v20190115-rNA")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Short> venta;
    public static volatile SingularAttribute<Factura, Double> descuento;
    public static volatile SingularAttribute<Factura, String> direccion;
    public static volatile SingularAttribute<Factura, String> nombre;
    public static volatile SingularAttribute<Factura, Short> garantia;
    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile SingularAttribute<Factura, Double> total;
    public static volatile SingularAttribute<Factura, Short> eliminado;
    public static volatile SingularAttribute<Factura, Integer> idFactura;
    public static volatile SingularAttribute<Factura, String> nit;
    public static volatile SingularAttribute<Factura, Short> efectivo;
    public static volatile SingularAttribute<Factura, Integer> usuariosId;
    public static volatile SingularAttribute<Factura, Short> tarjeta;

}