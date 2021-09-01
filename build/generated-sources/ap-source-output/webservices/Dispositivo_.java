package webservices;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import webservices.Consumo;
import webservices.Usuario;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-08-31T22:37:54")
@StaticMetamodel(Dispositivo.class)
public class Dispositivo_ { 

    public static volatile SingularAttribute<Dispositivo, Integer> idDispositivo;
    public static volatile SingularAttribute<Dispositivo, Usuario> idUsuario;
    public static volatile CollectionAttribute<Dispositivo, Consumo> consumoCollection;
    public static volatile SingularAttribute<Dispositivo, String> mac;
    public static volatile SingularAttribute<Dispositivo, String> observacion;

}