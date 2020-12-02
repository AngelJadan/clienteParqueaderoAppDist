package ec.ups.edu.appdis.g1.parqueadero.modelo;

public class Administrativo extends Cliente{
	private int id;
	private String usuario;
	private String password;
	
	public Administrativo() {
		// TODO Auto-generated constructor stub
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
