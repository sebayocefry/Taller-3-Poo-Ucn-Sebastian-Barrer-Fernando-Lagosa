// este factory lo hare con switch para varias un poco y porque como son mas opciones me es mas  comodo


public class TareasFactory {
	public static Tarea crearTrea(String idProyecto,String idTarea,String tipo, String descripcion, String estado, 
            Usuario responsable, String complejidad, String fecha) {
		switch (tipo.toLowerCase()) {
		case "bug":
			return new Bug(idProyecto, idTarea, tipo, descripcion, estado, responsable, complejidad, fecha);
		case "feature":
			return new Feature(idProyecto, idTarea, tipo, descripcion, estado, responsable, complejidad, fecha);
		case "documentacion":
			return new Documentacion(idProyecto, idTarea, tipo, descripcion, estado, responsable, complejidad, fecha);
		default:
			return null;
		}
	}
}
