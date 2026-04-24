package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Duas rodas (Moto)", "Honda", "ABC1D23", 80.0, "A", true);
        Moto moto2 = new Moto("Duas rodas (Moto)","Yamaha", "ABC1D23", 80.0 , "A", false);
        Caminhao caminhao1 = new Caminhao("Carga (Caminhão)", "Mercedes-Benz", "ABC1D23", 35_000.00, "C");

        moto1.afirmarTemBau();

        caminhao1.afirmarEixos(2);
        caminhao1.afirmarPesoBrutoTotal(14_000.00);

        System.out.println("===== Veículos =====");
        System.out.println("\nMoto 1:\n" + moto1);
        System.out.println("\nMoto 2:\n" + moto2);
        System.out.println("\nCaminhao 1:\n" + caminhao1);

        Pacote pacote1 = new Pacote("ABC12DEF345", 2_365, true, "Preparando");
        Pacote pacote2 = new Pacote("GHI67JKL890", 678, false, "Saiu para entrega");
        Pacote pacote3 = new Pacote("MNO12PQR345", 1_536, true, "Em rota de entrega");

        pacote2.alterarStatus("Em rota de entrega");

        System.out.println("\n===== Pacotes =====");
        System.out.println("\nPacote 1:\n" + pacote1);
        System.out.println("\nPacote 2:\n" + pacote2);
        System.out.println("\nPacote 3:\n" + pacote3);

        Rota rota1 = new Rota(pacote1, moto1);
        Rota rota2 = new Rota(pacote2, caminhao1);
        Rota rota3 = new Rota(pacote3, caminhao1);

        rota1.transportar();

        System.out.println("\n===== Rotas =====");
        System.out.println("\nRota 1:\n" + rota1);
        System.out.println("\nRota 2:\n" + rota2);
        System.out.println("\nRota 3:\n" + rota3);
    }
}
