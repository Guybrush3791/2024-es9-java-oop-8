public abstract class Veicolo {

    private int peso;
    private String marca;
    private String modello;

    public Veicolo(int peso, String marca, String modello) {

        setPeso(peso);
        setMarca(marca);
        setModello(modello);
    }

    abstract void turnOn();

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {

        return getMarca() + " " + getModello() + " - peso: " + getPeso();
    }
}