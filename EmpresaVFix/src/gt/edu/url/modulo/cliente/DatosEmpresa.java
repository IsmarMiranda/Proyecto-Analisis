/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.modulo.cliente;

/**
 *
 * @author IsmarMiranda
 */
public class DatosEmpresa {
    
    private String correoEmpresa;
    private String contrasena;

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
    
    
    public void obtenerDatos(){}
    
    public void enviarCorreo(CorreoElectronico correo, DatosEmpresa correoEmpresa){}
    
    
}
