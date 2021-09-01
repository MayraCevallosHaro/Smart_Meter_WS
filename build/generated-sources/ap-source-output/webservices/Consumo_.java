package webservices;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import webservices.Dispositivo;
import webservices.Usuario;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-08-31T22:37:54")
@StaticMetamodel(Consumo.class)
public class Consumo_ { 

    public static volatile SingularAttribute<Consumo, Date> fecha;
    public static volatile SingularAttribute<Consumo, String> medida;
    public static volatile SingularAttribute<Consumo, Dispositivo> idDispositivo;
    public static volatile SingularAttribute<Consumo, Usuario> idUsuario;
    public static volatile SingularAttribute<Consumo, Short> idConsumo;
    public static volatile SingularAttribute<Consumo, String> mac;
    public static volatile SingularAttribute<Consumo, String> observacion;

}