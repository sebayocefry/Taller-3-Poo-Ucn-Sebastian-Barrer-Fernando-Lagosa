public abstract class Usuario {
	protected String nombreUsuario;
	protected String password;
	protected String rolUsuario;
	public Usuario(String nombreUsuario, String password, String rolUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.rolUsuario = rolUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRolUsuario() {
		return rolUsuario;
	}
	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}
	
	@Override
	public String toString() {
		return "Usuario\nnombre Usuario: " + nombreUsuario + " | password: " + password + " | rolUsuario:" + rolUsuario
				+ " ";
	}
	
}
