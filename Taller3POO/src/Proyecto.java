import java.util.ArrayList;
/**
 * nota: Declaramos el atributo estrategia en esta clase para convertirla en el contexto
 * ya que queremos aplicar estrategoias por proyecto y no a todos
 * 
 * nota: Cada proyecto tiene su lista de tareas
 */
public class Proyecto {
	private String idProyecto;
	private String nombreProyecto;
	private Usuario responsableProyecto;
	private ArrayList<Tarea> listaTareas;
	
	private PrioridadStrategy miEstrategia;
	
	public Proyecto(String idProyecto, String nombreProyecto, Usuario responsableProyecto) {
		super();
		this.idProyecto = idProyecto;
		this.nombreProyecto = nombreProyecto;
		this.responsableProyecto = responsableProyecto;
		this.listaTareas = new ArrayList<>();
	}
	
	
	public void aplicarEstrategia() {
		if(miEstrategia!=null) {
			miEstrategia.ordenarTareas(listaTareas);
		}
	}
	
	
	
	public void setMiEstrategia(PrioridadStrategy miEstrategia) {
		this.miEstrategia = miEstrategia;
	}


	public void agregarTarea(Tarea t) {
		listaTareas.add(t);
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
	public Usuario getResponsableProyecto() {
		return responsableProyecto;
	}
	public void setResponsableProyecto(Usuario responsableProyecto) {
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
		return "Proyecto\n id Proyecto: " + idProyecto + " Nombre Proyecto: " + nombreProyecto + " responsable Proyecto: "
				+ responsableProyecto + "";
	}
	
	
}
