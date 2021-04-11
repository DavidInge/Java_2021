
package dominio;

import java.util.Date;

/**
 *
 * @author David Morales
 */
public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

 public Cliente(Date fechaRegistro,boolean vip,String nombre, char genero, int edad, String direccion) {
        // llama al constructor de la clase padre 
        super(nombre,genero,edad,direccion);
        this.idCliente=++Cliente.contadorCliente;
        this.fechaRegistro=fechaRegistro;
        this.vip=vip;
      }    

    public int getIdCliente() {
        return idCliente;
    }
 // se quita el setCliente ya que se esta obteniendo de manera automatica en la linea de codigo this.idCliente=++Cliente.contadorCliente; 
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        //imprime la direccion de memoria de la  clase padre Persona en este caso
        //e imprime el metodo toString 
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
