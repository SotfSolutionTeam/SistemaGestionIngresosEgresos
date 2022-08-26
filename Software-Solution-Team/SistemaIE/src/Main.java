public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.nombre = "Empresa 1";
        empresa.direccion = "Calle 1";
        empresa.telefono = "123456789";
        empresa.nit = 123456789;
        System.out.println("Nombre: " + empresa.nombre);
        System.out.println("Direccion: " + empresa.direccion);
        System.out.println("Telefono: " + empresa.telefono);
        System.out.println("Nit: " + empresa.nit);
        Empleado empleado = new Empleado();
        empleado.nombre = "Leonardo";
        empleado.correo = " lejhubo01@hotmail.com";
        empleado.entidad = "Universidad Nacional de Colombia";
        empleado.cargo = "Administrador";
        MovimientoDinero movimiento = new MovimientoDinero();
        movimiento.ModificarMovimiento = "ModificarMovimiento";
        movimiento.CrearMovimientoNegativo = "CrearMovimientoNegativo";
        movimiento.CrearMovimientoPositivo = "CrearMovimientoPositivo";
        movimiento.ConceptoDelMovimiento = "ConceptoDelMovimiento";
        movimiento.UsuarioMovimiento = "UsuarioMovimiento";
        System.out.println("ModificarMovimiento: " + movimiento.ModificarMovimiento);
        System.out.println("CrearMovimientoNegativo: " + movimiento.CrearMovimientoNegativo);
        System.out.println("CrearMovimientoPositivo: " + movimiento.CrearMovimientoPositivo);
        System.out.println("ConceptoDelMovimiento: " + movimiento.ConceptoDelMovimiento);
        System.out.println("UsuarioMovimiento: " + movimiento.UsuarioMovimiento);
    }

}
