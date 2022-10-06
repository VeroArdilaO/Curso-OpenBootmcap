public class inheritance {
    public static void main (String[]args){
        Cliente cliente = new Cliente();
        cliente.edad = 33;
        cliente.nombre = "Camilo";
        cliente.telefono = 3354879;
        cliente.credito = "Banco";
        System.out.println("Datos del Cliente");
        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);



        Trabajador trabajador = new Trabajador();
        trabajador.edad = 29;
        trabajador.nombre = "Leonardo";
        trabajador.telefono = 3105897;
        trabajador.salario = 20000000;
        System.out.println("Datos del Trabajador");
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}
 class Personaje {
    String nombre;
    int edad;
    int telefono;

 }

 class Cliente extends Personaje {
        String credito;
 }

 class Trabajador extends Personaje{
        int salario;
 }