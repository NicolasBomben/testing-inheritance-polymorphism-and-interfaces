
public class Cliente implements Autenticable{
	
	private String documento;
	private String telefono;
	private String nombre;

	private AutenticacionUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticacionUtil();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	//getter and setter for telephone.
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public void setClave(String clave) {
		this.autenticador.setContraseña(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.autenticador.autenticar(clave);
	}

	
}
