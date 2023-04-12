package clase5;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrito {
	private LocalDateTime fechaCompra;
	private ArrayList<Producto>  productos;
	
	public Carrito(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
		this.productos = new ArrayList<Producto>();
	}
	// agregar productos a la lista
	public void agregarProducto (Producto p) {
		if(!existeProducto(p)) {
			this.productos.add(p);
		}
	}
	
	// consultar si un producto existe en la lista. La igualdad es si el producto tiene el mismo código
	public boolean existeProducto(Producto p) {
		for (Producto prod : productos) {
		if (prod.getCodigo().equals(p.getCodigo())) {
			return true;
			}
		}
		return false;
	}
	
	// eliminar productos de la lista
	public void eliminarProducto(String codigo) {
		for (int i = 0; i< this.productos.size(); i++){
			if(this.productos.get(i).getCodigo().equals(codigo)) {
				this.productos.remove(i);
			}
		}
	}

	
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public float costoFinal(Descuento desc)throws ValorCeroException, TotalNegativoException { //polimorfismo
		//float total = desc.valorFinal(this.producto1.costoFinal()+this.producto2.costoFinal()+this.producto3.costoFinal());
		float total = 0;
		for (Producto p : this.productos) {
			total = total + p.costoFinal();
		}
		if (total == 0) {
			throw new ValorCeroException(total);
		}
		if (total>0) {
			throw new TotalNegativoException(total);
		}
		total = desc.valorFinal(total);
		return total;
	}	
}
