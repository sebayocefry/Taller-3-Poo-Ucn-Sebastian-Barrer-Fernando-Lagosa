
import java.util.ArrayList;

public class Sistema implements ISistema {
	private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
	private ArrayList<Proyecto> listaProyectos = new ArrayList<>();
	
	@Override
	public void cargarUsuarios(String[] partes) {
		// TODO Auto-generated method stub
		Usuario nuevoUsuario = UsuarioFactory.crearUsuario(partes[0], partes[1], partes[2]);
		if(nuevoUsuario!=null) {
			this.listaUsuarios.add(nuevoUsuario);
		}

	}

	@Override
	public void cargarProyectos(String[] partes) {
		// TODO Auto-generated method stub
		listaProyectos.add(new Proyecto(partes[0],partes[1], partes[2]));
		
	}

	@Override
	public void cargarTareas(String[] partes) {
		// TODO Auto-generated method stub
		String idProyecto = partes[0];
		Usuario nUsario = buscarUsuario(partes[5]);
		for (Proyecto p : listaProyectos) {
			if(p.getIdProyecto().equalsIgnoreCase(idProyecto)) {
				Tarea nuevaTarea = TareasFactory.crearTrea(idProyecto, partes[1], partes[2],partes[3], partes[4], nUsario, partes[6],partes[7]);
			}
		}

	}

	@Override
	public void verTodo() {
		// TODO Auto-generated method stub
		for (Proyecto proyecto : listaProyectos) {
			System.out.println(proyecto.toString());
		}

	}
	//  metodo de prueba
	public void verU() {
		for (Usuario u : listaUsuarios) {
			System.out.println(u.toString());
		}
	}
	

	@Override
	public void agregarProyecto(String idProyecto, String nombreProyecto, String responsable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarProyecto(String idProyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarTarea(String idProyecto, String idTarea, String tipoTarea, String descripcionTarea,
			String estadoTarea, String responsableTarea, String complejidadTarea, String fechaTarea) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarTarea(String idProyecto, String idTarea) {
		// TODO Auto-generated method stub

	}

	@Override
	public void asignarPrioridades() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generarTxt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verProyectos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verTareas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarEstadoTarea() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aplicarVisitorEnTareas(Usuario colaborador, Visitor visitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario buscarUsuario(String name) {
		// TODO Auto-generated method stub
		for (Usuario u : listaUsuarios) {
			if(u.getNombreUsuario().equals(name)) {
				return u;
			}
		}
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
