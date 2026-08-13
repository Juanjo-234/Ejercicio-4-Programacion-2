class Producto{

String nombre;
double precioBase;

public Producto(String nombre, double precioBase){
this.nombre = nombre;
this.precioBase = precioBase;
}

public double calcularPrecioConDescuento(double porcentajeDescuento) {
    double montoDescuento = this.precioBase * (porcentajeDescuento / 100);
    return this.precioBase - montoDescuento;
}


public double calcularPrecioConRecargo(double porcentajeRecargo) {
   
    double montoRecargo = this.precioBase * (porcentajeRecargo / 100);
    return this.precioBase + montoRecargo;
}



void mostrarInformacion(){

    System.out.println("================================================");
    System.out.println("Nombre del producto: " + nombre);
    System.out.println("Precio base del producto: " + precioBase);

}


 public static void main(String[] args) {
    Producto producto1 = new Producto("Libro", 100);
    Producto producto2 = new Producto("Mouse", 500);

producto1.mostrarInformacion();

double descuento = 10.0;
   double precioConDescuento = producto1.calcularPrecioConDescuento(descuento);
   System.out.println("Precio con " + descuento + "% de descuento: $" + precioConDescuento);


 double recargo = 15.0;
  double precioConRecargo = producto1.calcularPrecioConRecargo(recargo);
  System.out.println("Precio con " + recargo + "% de recargo: $" + precioConRecargo);

  System.out.println("================================================");

producto2.mostrarInformacion();

double precioConDescuento1 = producto2.calcularPrecioConDescuento(descuento);
   System.out.println("Precio con " + descuento + "% de descuento: $" + precioConDescuento1);


 double recargo1 = 15.0;
  double precioConRecargo1 = producto2.calcularPrecioConRecargo(recargo1);
  System.out.println("Precio con " + recargo1 + "% de recargo: $" + precioConRecargo1);

  System.out.println("================================================");

}
}
