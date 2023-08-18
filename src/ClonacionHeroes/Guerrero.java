package ClonacionHeroes;

public class Guerrero implements Personaje {

    private String nombre;

    private String Poder;

    private String color;

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
        this.Poder = c;
    }

    @Override
    public String GetPoderEspecial() {
        return Poder;
    }


    @Override
    public void color(String verde) {
        this.color = verde;
    }

    @Override
    public Personaje clonar() {
        Personaje personaje = new Guerrero();
        personaje.setNombre(this.nombre);
        personaje.SetPoderEspecial(this.Poder);
        personaje.color(this.color);
        return personaje;
    }
}
