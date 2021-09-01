package webservices;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import webservices.Consumo;
import webservices.Dispositivo;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-08-31T22:37:54")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile SingularAttribute<Usuario, String> tipo;
    public static volatile SingularAttribute<Usuario, String> clave;
    public static volatile CollectionAttribute<Usuario, Dispositivo> dispositivoCollection;
    public static volatile SingularAttribute<Usuario, String> cedula;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile CollectionAttribute<Usuario, Consumo> consumoCollection;
    public static volatile SingularAttribute<Usuario, String> nombres;

}