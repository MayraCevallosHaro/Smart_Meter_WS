/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import clases.Conexion_bd;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import javax.json.JsonArray;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.sql.rowset.WebRowSet;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
/**
 *
 * @author mayra
 */
@WebService(serviceName = "ws_Procesar")
public class ws_Procesar {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "procesar")
    public String procesar(@WebParam(name = "sentencia") String sentencia) {
        try {
            // No olvidar configurar con su bd local
            Conexion_bd con = new Conexion_bd();
            // Transformación a UTF para que se muestren los acentos
            byte[] setencia_byte = sentencia.getBytes();
            String utf = new String(setencia_byte, StandardCharsets.UTF_8);
            con.ejecutar(utf);
        } catch (Exception e) {
            return "Error, " + e.toString();
        }
        return "OK";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultar")
    public String consultar(@WebParam(name = "sentencia") String sentencia) {
        WebRowSet wrs = null;
        try {
            // No olvidar configurar con su bd local
            Conexion_bd con = new Conexion_bd();
            // Transformación a UTF para que se muestren los acentos
            byte[] setencia_byte = sentencia.getBytes();
            String utf = new String(setencia_byte, StandardCharsets.UTF_8);
            ResultSet rs = con.consultar(sentencia);
            String res = "";
            while (rs.next()) {
                res = rs.getString(1);
            }
            if(res==null)return "Usuario o clave incorrecta";      
            else return res;
        } catch (Exception e) {
            return "Error";
        }
    }

    @WebMethod(operationName = "cerrar")
    public String cerrar(@WebParam(name = "sentencia") String sentencia) {
        WebRowSet wrs = null;
        try {
            // No olvidar configurar con su bd local
            Conexion_bd con = new Conexion_bd();
            // Transformación a UTF para que se muestren los acentos
            con.cerrarConexion();
            return "Listo";
        } catch (Exception e) {
            return "Error";
        }
    }

    @WebMethod(operationName = "Obtener")
    public String Obtener(@WebParam(name = "sentencia") String sentencia) {
        WebRowSet wrs = null;
        try {
            // No olvidar configurar con su bd local
            Conexion_bd con = new Conexion_bd();
            // Transformación a UTF para que se muestren los acentos
            byte[] setencia_byte = sentencia.getBytes();
            String utf = new String(setencia_byte, StandardCharsets.UTF_8);
            ResultSet rs = con.consultar(sentencia);
            String res = "";
            while (rs.next()) {
                res += rs.getString(1) + "-";
                res += rs.getString(2) + "-";
                res += rs.getString(3) + "-";
                res += rs.getString(4) + "-";
                res += rs.getString(5) + "-";
                res += rs.getString(6);
            }
            return res;
        } catch (Exception e) {
            return "Error";
        }
    }

    @WebMethod(operationName = "ObtenerDisp")
    public String ObtenerDisp(@WebParam(name = "sentencia") String sentencia) {
        WebRowSet wrs = null;
        try {
            // No olvidar configurar con su bd local
            Conexion_bd con = new Conexion_bd();
            // Transformación a UTF para que se muestren los acentos
            byte[] setencia_byte = sentencia.getBytes();
            String utf = new String(setencia_byte, StandardCharsets.UTF_8);
            ResultSet rs = con.consultar(sentencia);
            
            JSONArray jsa = new JSONArray();
            while (rs.next()) {
            JSONObject res = new JSONObject();
            res.put("id_dispositivo", rs.getString(1));
            res.put("id_usuario", rs.getString(2));
            res.put("mac", rs.getString(3));
            res.put("observacion", rs.getString(4));
            jsa.add(res);
            }
            String resultado = jsa.toString();
            return resultado;
        } catch (Exception e) {
            return "Error";
        }
    }
    
     @WebMethod(operationName = "ConsumoUsuario")
    public String ConsumoUsuario(@WebParam(name = "sentencia") String sentencia) {
        WebRowSet wrs = null;
        try {
            // No olvidar configurar con su bd local
            Conexion_bd con = new Conexion_bd();
            // Transformación a UTF para que se muestren los acentos
            byte[] setencia_byte = sentencia.getBytes();
            String utf = new String(setencia_byte, StandardCharsets.UTF_8);
            ResultSet rs = con.consultar(sentencia);
            JSONArray jsa = new JSONArray();
            while (rs.next()) {
            JSONObject res = new JSONObject();
            res.put("dispositivo", rs.getString(1));
            res.put("fecha", rs.getString(2));
            res.put("consumo", rs.getString(3));
           

            jsa.add(res);
            }
            String resultado = jsa.toString();
            return resultado;
        } catch (Exception e) {
            return "Error";
        }
    }
}
