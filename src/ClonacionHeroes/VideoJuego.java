package ClonacionHeroes;
 import java.util.Scanner;
public class VideoJuego {
    public static void main(String[]args) {


        Scanner sc = new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);

        int opcion;
        String cambio;



        Magoo magoo = new Magoo();
        Arquero arquero = new Arquero();
        Guerrero guerrero = new Guerrero();

        Personaje personaje = null;

        magoo.setNombre("Malzahar");
        magoo.SetPoderEspecial("Rayo");
        arquero.setNombre("ashe");
        arquero.SetPoderEspecial("Ataque lejano");
        guerrero.setNombre("Akali");
        guerrero.SetPoderEspecial("Sombra");

        System.out.println("Digite la opcion que desea clonar:");
        System.out.println("1 = Mago");
        System.out.println("2 = Arquero");
        System.out.println("3 = Guerrero");





        opcion = sc.nextInt();


        if (opcion == 1) {
            System.out.println("Este es el nombre de tu personaje " + magoo.getNombre());
            System.out.println("Este es tu poner especial " + magoo.GetPoderEspecial());
            personaje = magoo.clonar();
        } if(opcion == 2) {
            System.out.println("Este es el nombre de tu personaje " + arquero.getNombre());
            System.out.println("Este es tu poner especial " + arquero.GetPoderEspecial());
            personaje = arquero.clonar();
        } if(opcion == 3) {
            System.out.println("Este es el nombre de tu personaje " + guerrero.getNombre());
            System.out.println("Este es tu poner especial " + guerrero.GetPoderEspecial());
            personaje = guerrero.clonar();

        }


        personaje.setNombre(personaje.getNombre()+ "clonado");
        System.out.println("Digite el nuevo poder");
        cambio = sc2.nextLine();

        System.out.println(cambio);
        personaje.SetPoderEspecial(cambio);

        System.out.println("Esta es la figura clonada");
        System.out.println(personaje.getNombre());
        System.out.println("Este es el poder del clon");
        System.out.println(personaje.GetPoderEspecial());


    }
}
