package pacote3;


public class Carro{
    private String letrasPlaca;
    private int numerosPlaca;
    private int numChassi;
    private int velocidadeAtual;

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Carro() {}

    public Carro(String placa, int numChassi){
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    public String getPlaca() {
        if ("ERRO!!!".equals(letrasPlaca)) {
            return letrasPlaca;
        } else {
            return letrasPlaca + numerosPlaca;
        }
    }

    public void setPlaca(String placa) {
        if (placa != null && placa.length() == 7 &&
            placa.matches("[A-Z]{3}\\d{4}")) {
            this.letrasPlaca = placa.substring(0, 3);
            this.numerosPlaca = Integer.parseInt(placa.substring(3));
        } else {
            this.letrasPlaca = "ERRO!!!";
        }
    }
    

    

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public void acelerar() {
        this.velocidadeAtual++;
    }

    public void acelerar(int limite) {
        for (int i = velocidadeAtual; i < limite; i++) {
            acelerar();
        }
    }

    public  boolean frear(){
        return false;

    }
}
