package ClonacionHeroes;

public interface Personaje {
    public void setNombre(String n);
    public String getNombre();
    public void SetPoderEspecial(String C);
    public String GetPoderEspecial();

    public void color(String rojo);
    public Personaje clonar();
}
