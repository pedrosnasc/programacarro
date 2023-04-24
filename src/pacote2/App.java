package pacote2;

import pacote3.Carro;

public class App{
    public static void main(String[] args) throws Exception {
        /*limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /*limpa o terminal */

        Carro carro = new Carro("ABC1234", 123456789);
        System.out.println("Velocidade do carro: " + carro.getVelocidadeAtual());
        System.out.println("ACELERANDO O CARRO...");
        for (int i = 0; i < 10; i++) {
            carro.acelerar();
        }
        System.out.println("ACELERANDO ATÉ 50 KM/H");
        carro.acelerar(50);
        System.out.println("Velocidade do carro: " + carro.getVelocidadeAtual());

        Carro carro2 = new Carro();
        carro2.setPlaca("POO4321");
        carro2.setNumChassi(987654321);

        System.out.printf("Carro contém a placa %s e o número do chassi %d\n", carro.getPlaca(), carro.getNumChassi());
        System.out.printf("Carro contém a placa %s e o número do chassi %d\n", carro2.getPlaca(), carro2.getNumChassi());
    }
}
