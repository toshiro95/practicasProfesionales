
package SistemaPersistencia;

import java.sql.Date;

/* @author MACROSOFT:
  
   * CARO, Erica
   * FERREYRA, Cristian
   * MENDOZA, Erick
   * PONCE, Vanesa
  
*/

public interface Cargo {
    
    /* SET */
    
    abstract public void setNroCargo(int nroCargo);
    abstract public void setNombreCargo(String nombreCargo);
    abstract public void setFechaInicioVigencia(Date fechaInicioVigencia);
    abstract public void setFechaFinVigencia(Date fechaFinVigencia);
    abstract public void setUniversidadDeCargo(Universidad universidadDecargo);
    
    /* GET */
    
    abstract public int getNroCargo();
    abstract public String getNombreCargo();
    abstract public Date getFechaInicioVigencia();
    abstract public Date getFechaFinVigencia();
    abstract public Universidad getUniversidadDeCargo();
}
