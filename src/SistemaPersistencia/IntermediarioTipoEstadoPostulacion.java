
package SistemaPersistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/* @author MACROSOFT:
  
   * CARO, Erica
   * FERREYRA, Cristian
   * MENDOZA, Erick
   * PONCE, Vanesa
  
*/

public class IntermediarioTipoEstadoPostulacion extends IntermediarioRelacional{

     @Override
    protected String generarSQLBuscar(Vector<Criterio> criterios) {
        
       
        String sql = "SELECT * FROM tipo_estado_postulacion WHERE "+generarSQLCriterios(criterios.get(0));
        
        
        if(criterios.size()>1){
            
            
            for(int i=1; i < criterios.size(); i++){
                sql = sql+ "AND "+generarSQLCriterios(criterios.get(i));
            }
        }
        
        sql=sql+";";
        return sql;
        
    }

    @Override
    protected String generarSQLBuscar(String oid) {
        
        String sql = "SELECT * FROM tipo_estado_postulacion WHERE OIDTipoEstadoPostulacion ="+oid+" ;";
        return sql;
        
    }
    
    @Override
    protected String generarSQLGuardar(Object entidad) {
        
        TipoEstadoPostulacionAgente tipEstPost = (TipoEstadoPostulacionAgente) entidad;
        String sql = "INSERT INTO tipo_estado_postulacion (OIDTipoEstadoPostulacion, nombreTipoEstadoPostulacion) VALUE ('"+tipEstPost.getOID()+"', '"+tipEstPost.getNombreTipoEstadoPostulacion()+"');";
        return sql;
        
    }

    @Override
    protected String generarSQLActualizar(Object entidad) {
        
        TipoEstadoPostulacionAgente tipEstPost = (TipoEstadoPostulacionAgente) entidad;
        String sql = "UPDATE tipo_estado_postulacion SET nombreTipoEstadoPostulacion='"+tipEstPost.getNombreTipoEstadoPostulacion()+"' WHERE OIDTipoEstadoPostulacion="+tipEstPost.getOID()+" ;";
        return sql;
        
    }

    @Override
    protected String generarSQLEliminar(Object entidad) {
        
        TipoEstadoPostulacionAgente tipEstPost = (TipoEstadoPostulacionAgente) entidad;
        String sql = "DELETE FROM tipo_estado_postulacion WHERE OIDTipoEstadoPostulacion="+tipEstPost.getOID()+" ;";
        return sql;
        
    }

    @Override
    protected Vector convertirRegistroAObjeto(ResultSet rs) {
        
        Vector resultados = new Vector();
        try {
            while(rs.next()){
                TipoEstadoPostulacionAgente agente = new  TipoEstadoPostulacionAgente();
                TipoEstadoPostulacionImplementacion implementacion = new TipoEstadoPostulacionImplementacion();
                agente.setTipoEstadoPostulacion(implementacion);
                
                try{
                    agente.setOID(rs.getString("OIDTipoEstadoPostulacion"));
                }
                catch(SQLException e){
                    agente.setOID(null);
                }
                try{
                    agente.setNombreTipoEstadoPostulacion(rs.getString("nombreTipoEstadoPostulacion"));
                }
                catch(SQLException e){
                    agente.setNombreTipoEstadoPostulacion(null);
                }
                try{
                    agente.setNroTipoEstadoPostulacion(rs.getInt("nroTipoEstadoPostulacion"));
                }
                catch(SQLException e){
                    agente.setNroTipoEstadoPostulacion(0);
                }
                
                agente.setModificado(false);
                agente.setNuevo(false);
                resultados.add(agente);
            }
        } catch (SQLException ex) {
            System.out.println("Error en while de rs.next");
            
        }
        return resultados;
        
    }


    @Override
    protected Object convertirRegistroAObjetoOID(ResultSet rs) {
        Vector v=this.convertirRegistroAObjeto(rs);
        return v.get(0);
        
    }
   
    private String generarSQLCriterios (Criterio criterio){
        String sqlCriterio;
        String c = criterio.getAtributo();
        switch (c){
            default:
                sqlCriterio = criterio.getAtributo()+" "+criterio.getOperador()+" '"+criterio.getValor()+"' ";
                break;
                
        }
        return sqlCriterio;
    }
    
}
