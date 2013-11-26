/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontable;

/**
 *
 * @author Wilfredo
 */
public class TipoCuenta {
    private int idTipoCuenta;
    private String nombreCuenta;
    private String naturaleza;
    
    /**
     * @return the idTipoCuenta
     */
    public int getIdTipoCuenta() {
        return idTipoCuenta;
    }

    /**
     * @param idTipoCuenta the idTipoCuenta to set
     */
    public void setIdTipoCuenta(int idTipoCuenta) {
        this.idTipoCuenta = idTipoCuenta;
    }

    /**
     * @return the nombreCuenta
     */
    public String getNombreCuenta() {
        return nombreCuenta;
    }

    /**
     * @param nombreCuenta the nombreCuenta to set
     */
    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    /**
     * @return the naturaleza
     */
    public String getNaturaleza() {
        return naturaleza;
    }

    /**
     * @param naturaleza the naturaleza to set
     */
    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }
}
