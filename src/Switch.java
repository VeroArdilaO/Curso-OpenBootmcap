public class Switch {
    public static void main (String[]args) {
        String Estacion = "Primavera";

        switch(Estacion){
            case"Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno" :
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es ninguna Estación");
        }
    }
}
