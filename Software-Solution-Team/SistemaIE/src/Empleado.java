//primera clase empleado 
public class Empleado {
    String nombre;
    String correo;
    String entidad;
    String cargo;
    Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    // Main

    /** //Segunda parte: Creacion de Getters y Setters 
     * @param empresa
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();

        Empleado empleado1 = new Empleado();
        empleado1.setEmpresa(empresa1);
        System.out.println(empleado1.getEmpresa().getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
