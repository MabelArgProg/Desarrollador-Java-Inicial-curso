package clase5;

public class ValorCeroException extends Exception{
	private float valorDeCarrito;

	public ValorCeroException(float valorDeCarrito) {
		super();
		this.valorDeCarrito = valorDeCarrito;
	}

	public float getValorDeCarrito() {
		return valorDeCarrito;
	}
	
	@Override
	public String getMessage() {
		return "El valor del carrito es cero, No se puede aplicar descuento";
	}
}
