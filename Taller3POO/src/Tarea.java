import java.time.LocalDate;
/**
 * clase tarea
 * nota: tiene atributos de tipo objeto para facilitar comparacion de datos y por gusto
 * 
 */
public abstract class Tarea {
	protected String idProyecto;
	protected String idTarea;
	protected String tipoTarea;
	protected String descripcionTarea;
	protected String estadoTarea;
	protected Usuario responsableTarea;
	protected String complejidadTarea;
	protected LocalDate fechaTarea;
	public Tarea(String idProyecto, String idTarea, String tipoTarea, String descripcionTarea, String estadoTarea,
			Usuario responsableTarea, String complejidadTarea, LocalDate fechaTarea) {
		super();
		this.idProyecto = idProyecto;
		this.idTarea = idTarea;
		this.tipoTarea = tipoTarea;
		this.descripcionTarea = descripcionTarea;
		this.estadoTarea = estadoTarea;
		this.responsableTarea = responsableTarea;
		this.complejidadTarea = complejidadTarea;
		this.fechaTarea = fechaTarea;
	}
	public String getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(String idTarea) {
		this.idTarea = idTarea;
	}
	public String getTipoTarea() {
		return tipoTarea;
	}
	public void setTipoTarea(String tipoTarea) {
		this.tipoTarea = tipoTarea;
	}
	public String getDescripcionTarea() {
		return descripcionTarea;
	}
	public void setDescripcionTarea(String descripcionTarea) {
		this.descripcionTarea = descripcionTarea;
	}
	public String getEstadoTarea() {
		return estadoTarea;
	}
	public void setEstadoTarea(String estadoTarea) {
		this.estadoTarea = estadoTarea;
	}
	public Usuario getResponsableTarea() {
		return responsableTarea;
	}
	public void setResponsableTarea(Usuario responsableTarea) {
		this.responsableTarea = responsableTarea;
	}
	public String getComplejidadTarea() {
		return complejidadTarea;
	}
	public void setComplejidadTarea(String complejidadTarea) {
		this.complejidadTarea = complejidadTarea;
	}
	public LocalDate getFechaTarea() {
		return fechaTarea;
	}
	public void setFechaTarea(LocalDate fechaTarea) {
		this.fechaTarea = fechaTarea;
	}
	
	public abstract int getPrioridadImpacto();
	
	public abstract void aceptar(Visitor v);
	
	@Override
	public String toString() {
		return "Tarea\n id del Proyecto: " + idProyecto + "| id Tarea: " + idTarea + "| tipo Tarea: " + tipoTarea
				+ "| descripcion Tarea:\n" + descripcionTarea + "\n Estado Tarea: " + estadoTarea + "| responsable Tarea: "
				+ responsableTarea + "\n complejidad de la Tarea: " + complejidadTarea + "| fecha de la Tarea: " + fechaTarea + " ";
	}
	
}
