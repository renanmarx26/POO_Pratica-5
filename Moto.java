public class Moto extends Veiculo {
    private boolean eletrico;
    public Moto(String marca, String modelo, int ano, boolean eletrico) {
        super(marca, modelo, ano);
        this.eletrico = eletrico;
    }
    public boolean isEletrico() {
        return eletrico;
    }
    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }

    public String toString() {
        return "Moto{ Marca da moto: " + getMarca() + ", Modelo da moto: " + getModelo() + ", Ano da moto:" + getAno() + ", É eletrico?: " + eletrico + '}';
    }
}