import java.time.LocalDate;
/**
 * 
 * Interfaz sistema
 * @param op
 */
 

public interface ISistema {
	
	/**
	 * @param partes el metodo recibe un string tipo partes para asi cuando creemos el obj
	 * en factory, este podria ser mas flexible ya que lo dvidimos alla
	 */
	public void cargarUsuarios(String[] partes);
	/**
	 * @param partes partes el metodo recibe un string tipo partes para asi cuando creemos el obj
	 * en factory, este podria ser mas flexible ya que lo dvidimos alla
	 */
	public void cargarProyectos(String[] partes);
	/**
	 * @param partes partes el metodo recibe un string tipo partes para asi cuando creemos el obj
	 * en factory, este podria ser mas flexible ya que lo dvidimos alla
	 */
	public void cargarTareas(String[] partes);
	/**
	 * funcion que nos permite ver toda la informacion disponible de proyectos y tareas
	 */
	public void verTodo();
	/**
	 * metodo que nos permite crear y agregar un proyecto a la lista
	 * @param idProyecto id unico de un proyecto
	 * @param nombreProyecto nombre del proyecto 
	 * @param responsable del proyecto
	 */
	public void agregarProyecto(String idProyecto, String nombreProyecto, String responsable);
	/**
	 * metodo que nos permite eliminar un proyecto de la lista
	 * @param idProyecto 
	 */
	public void eliminarProyecto(String idProyecto);
	/**
	 * metodo que nos permite aagregar una tarea a la lista de un proyecto 
	 * @param idProyecto
	 * @param idTarea
	 * @param tipoTarea
	 * @param descripcionTarea
	 * @param estadoTarea
	 * @param responsableTarea
	 * @param complejidadTarea
	 * @param fechaTarea
	 */
	public void agregarTarea(String idProyecto,String idTarea,String tipoTarea, String descripcionTarea, String estadoTarea,
			String responsableTarea, String complejidadTarea, String fechaTarea);
	/**
	 * metodo que recibe un string en formato string y lo pasa a formato LocalDate para facilitar su comparacion
	 * @param fecha tipo string
	 * @return LocalDate
	 * nota: aunque con el txt no necesitamos setear el formato, lo hacemos para manejar errores y darle "robustez"
	 */
	public LocalDate convertirFecha(String fecha);
	/**
	 * metodo que nos permite eliminar una tarea de un proyecto 
	 * @param idProyecto
	 * @param idTarea
	 */
	public void eliminarTarea(String idProyecto, String idTarea);
	/**
	 * metodo que elige el tipo de estraegia elegida por el usuario previamente
	 * @param op variable de tipo entera que nos permite elegir entre 3 opciones enumeradas
	 * previamente del 1 al 3 desde el main
	 * @return retorna un obj tipo strategia 
	 */
	public PrioridadStrategy buscarEstrategia(int op);
	/**
	 * metodo que asigna la estrategia de organizacion (orden) de tareas
	 * @param idProyecto recibe el dato tipo string que le envia a un metodo que devuelve
	 * un obj tipo proyecto
	 * @param op recibe el dato tipo entero que envia a un metodo que busca y devuelve
	 * un obj tipo estrategia
	 * nota: los errores son manejados con null y sysos
	 */
	public void asignarPrioridades(String idProyecto, int op);
	
	/**
	 * metodo que genera un txt de los datos totales de la lista proyectos
	 * nota: aca igual pude haber aplicado un visitor y dejar el programa pensado 
	 * para versiones futuras donde querria generar otro tipo de formato de reporte
	 */
	public void generarTxt();
	/**
	 * metodo que busca un objeto tipo proyecto a base de un string
	 * @param idProyecto nos sirve para buscar el proyecto por su id en la lista
	 * @return retorna un OBJ tipo proyecto, null sino lo encuentra en la lista
	 */
	public Proyecto buscarProyecto(String idProyecto);
	/**
	 * metodo que busca un objeto tipo tarea a base de un string
	 * @param idProyecto nos sirve para buscar la tarea por su id en la lista
	 * @return retorna un OBJ tipo tarea, null sino lo encuentra en la lista
	 */
	public Tarea buscarTarea(String idTarea);
	
	/**
	 * metodo que nos permite ver los proyectos asignados al usuario logueado
	 */
	public void verProyectos();
	/**
	 * muestra informacion limitada de los proyectos y sus tareas
	 */
	public void verLimitado();
	/**
	 * muestra las tareas del usuario logueado actualmente
	 */
	public void verTareas();
	/**
	 * metodo que nos permite actualizar el estado de una tarea de pendiente a en proceso y de proceso a finalizada
	 * @param idTarea
	 * @param estadoActualizar string con el nuevo estadp ej: "Finzalizado"
	 * nota: con los if controlamos que el avance nunca se igual o un retroceso
	 */
	public void actualizarEstadoTarea( String idTarea,String estadoActualizar);
	/**
	 * metodo teorico para aplicar el visitor
	 * nota: se aplica de la misma forma que el libro
	 * nota: aplica sobre todas las tareas de los proyectp
	 */
	public void aplicarVisitorEnTareas();
	
	/**
	 * metodo que busca un usuario a traves de un string para darle el uso que se estime correspondiente
	 * @param name nombre del usurario
	 * @return retonora un obj tipo usuario o null en caso de no encontrarlo
	 */
	public Usuario buscarUsuario(String name);
	/**
	 * metodo que nos permite guardar el usuario logueado en la clase
	 * metodo que nos permite verificar si los datos del usuario son acordes
	 * @param user nombre del usuario
	 * @param pass contrasena del usuario
	 * @return nos retorna ub obj tipo usuario si los datos son correctos y se encuentran registrados 
	 */
	public Usuario login(String user, String pass);
	
}
