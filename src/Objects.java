public class Objects {
        public static void main (String[]args) {
            Persona persona = new Persona();
            persona.setNombre("Veronica");
            String nombre = persona.getNombre();
            System.out.println(nombre);

            persona.setEdad(27);
            System.out.println(persona.getEdad());

            persona.setTelefono(3367256);
            System.out.println(persona.getTelefono());

        }

    }
    class Persona {
            private String nombre;
            private int edad;
            private int telefono;

            public void setNombre(String nombre){
                this.nombre = nombre;
            }

            public String getNombre(){
             return this.nombre;
             }

            public void setEdad(int edad){
                this.edad = edad;
            }

            public int getEdad(){
                return this.edad;
            }

            public void setTelefono(int telefono){
                this.telefono = telefono;
            }

            public int getTelefono(){
                return this.telefono;
            }
        }

