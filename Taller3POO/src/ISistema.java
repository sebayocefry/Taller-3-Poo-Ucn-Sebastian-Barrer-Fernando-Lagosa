public interface ISistema {
	
	public void cargarUsuarios(String[] partes);
	public void cargarProyectos(String[] partes);
	public void cargarTareas(String[] partes);
	public void verTodo();
	public void agregarProyecto(String idProyecto, String nombreProyecto, String responsable);
	public void eliminarProyecto(String idProyecto);
	public void agregarTarea(String idProyecto,String idTarea,String tipoTarea, String descripcionTarea, String estadoTarea,
			String responsableTarea, String complejidadTarea, String fechaTarea);
	public void eliminarTarea(String idProyecto, String idTarea);
	public void asignarPrioridades();
	
	//esto lo hago normal y sin visitor porque piden guardar proyectos y no tareas
	public void generarTxt();
	
	public void verProyectos();
	public void verTareas();
	public void actualizarEstadoTarea();
	public void aplicarVisitorEnTareas(Usuario colaborador, Visitor visitor);
	
	
	public Usuario buscarUsuario(String name);
}
