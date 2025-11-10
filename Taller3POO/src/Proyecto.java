import java.util.ArrayList;

public class Proyecto {
	private String idProyecto;
	private String nombreProyecto;
	private String responsableProyecto;
	private ArrayList<Tarea> listaTareas;
	public Proyecto(String idProyecto, String nombreProyecto, String responsableProyecto) {
		super();
		this.idProyecto = idProyecto;
		this.nombreProyecto = nombreProyecto;
		this.responsableProyecto = responsableProyecto;
		this.listaTareas = new ArrayList<>();
	}
	public String getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public String getResponsableProyecto() {
		return responsableProyecto;
	}
	public void setResponsableProyecto(String responsableProyecto) {
		this.responsableProyecto = responsableProyecto;
	}
	public ArrayList<Tarea> getListaTareas() {
		return listaTareas;
	}
	public void setListaTareas(ArrayList<Tarea> listaTareas) {
		this.listaTareas = listaTareas;
	}
	@Override
	public String toString() {
		return "Proyecto [idProyecto=" + idProyecto + ", nombreProyecto=" + nombreProyecto + ", responsableProyecto="
				+ responsableProyecto + "]";
	}
	
	
}
