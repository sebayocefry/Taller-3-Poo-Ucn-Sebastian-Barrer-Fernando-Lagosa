public class UsuarioFactory {
	public static Usuario crearUsuario(String nombre, String password, String rol) {
		if(rol.equalsIgnoreCase("Administrador")) {
			return new Admi(nombre, password, rol);
		}else if(rol.equalsIgnoreCase("Colaborador")){
			return new Colaborador(nombre, password, rol);
		}else {
			System.out.println("Rol incorrecto");
			return null;
		}
	}
}
