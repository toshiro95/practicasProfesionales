
package interfazsolicitudestadosacademicos;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EstadoAcademicoEstudiante", targetNamespace = "http://InterfazSolicitudEstadosAcademicos/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EstadoAcademicoEstudiante {


    /**
     * 
     * @param dtoSolicitarEstadoAcademicoGeneral
     * @return
     *     returns java.util.List<interfazsolicitudestadosacademicos.DtoEstadoAcademicoGeneralFRMUTN>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "solicitarEstadoAcademicoGeneral", targetNamespace = "http://InterfazSolicitudEstadosAcademicos/", className = "interfazsolicitudestadosacademicos.SolicitarEstadoAcademicoGeneral")
    @ResponseWrapper(localName = "solicitarEstadoAcademicoGeneralResponse", targetNamespace = "http://InterfazSolicitudEstadosAcademicos/", className = "interfazsolicitudestadosacademicos.SolicitarEstadoAcademicoGeneralResponse")
    @Action(input = "http://InterfazSolicitudEstadosAcademicos/EstadoAcademicoEstudiante/solicitarEstadoAcademicoGeneralRequest", output = "http://InterfazSolicitudEstadosAcademicos/EstadoAcademicoEstudiante/solicitarEstadoAcademicoGeneralResponse")
    public List<DtoEstadoAcademicoGeneralFRMUTN> solicitarEstadoAcademicoGeneral(
        @WebParam(name = "dtoSolicitarEstadoAcademicoGeneral", targetNamespace = "")
        DtoSolicitarEstadoAcademicoG dtoSolicitarEstadoAcademicoGeneral);

    /**
     * 
     * @param dtoSolicitarEstadoAcademicoDetallado
     * @return
     *     returns java.util.List<interfazsolicitudestadosacademicos.DtoEstadoAcademicoDetalladoFRMUTN>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "solicitarEstadoAcademicoDetallado", targetNamespace = "http://InterfazSolicitudEstadosAcademicos/", className = "interfazsolicitudestadosacademicos.SolicitarEstadoAcademicoDetallado")
    @ResponseWrapper(localName = "solicitarEstadoAcademicoDetalladoResponse", targetNamespace = "http://InterfazSolicitudEstadosAcademicos/", className = "interfazsolicitudestadosacademicos.SolicitarEstadoAcademicoDetalladoResponse")
    @Action(input = "http://InterfazSolicitudEstadosAcademicos/EstadoAcademicoEstudiante/solicitarEstadoAcademicoDetalladoRequest", output = "http://InterfazSolicitudEstadosAcademicos/EstadoAcademicoEstudiante/solicitarEstadoAcademicoDetalladoResponse")
    public List<DtoEstadoAcademicoDetalladoFRMUTN> solicitarEstadoAcademicoDetallado(
        @WebParam(name = "dtoSolicitarEstadoAcademicoDetallado", targetNamespace = "")
        DtoSolicitarEstadoAcademicoD dtoSolicitarEstadoAcademicoDetallado);

}
