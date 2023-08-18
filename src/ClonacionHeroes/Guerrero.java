package ClonacionHeroes;

public class Guerrero implements Personaje {

    private String nombre;

    private String Poder;

    private String Color;
    @Override
    public void setNombre(String n) {

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void SetPoderEspecial(String c) {

    }

    @Override
    public String GetPoderEspecial() {
        return null;
    }


    @Override
    public void color(String verde) {
        ;
    }

    @Override
    public Personaje clonar() {
        return null;
    }
}
