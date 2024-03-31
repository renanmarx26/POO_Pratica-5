public class Carro extends Veiculo {
    private int portas;
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public int getportas() {
        return portas;
    }

    public void setportas(int portas) {
        this.portas = portas;
    }

    public String toString() {
        return "Carro{ Marca do carro: " + getMarca() + ", Modelo do carro: " + getModelo() + ", Ano do carro: " + getAno() + ", Número de portas: " + portas + '}';
    }
}