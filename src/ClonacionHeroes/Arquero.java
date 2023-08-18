package ClonacionHeroes;

public class Arquero implements Personaje{

    private String nombre;

    private String Poder;

    private String Color;


    @Override
    public void setNombre(String n) {
        this.nombre = n;

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void SetPoderEspecial(String c) {
        this.Poder= c;

    }

    @Override
    public String GetPoderEspecial() {
        return Poder;
    }


    @Override
    public void color(String amarillo) {
        ;
    }

    @Override
    public Personaje clonar() {

        Personaje personaje = new Arquero();
        personaje.setNombre(this.nombre);
        personaje.SetPoderEspecial(this.Poder);
        personaje.color(this.Color);
        return personaje;
    }
}
