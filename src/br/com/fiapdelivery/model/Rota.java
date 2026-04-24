package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void transportar() {
        pacote.alterarStatus("Saiu para entrega");

        System.out.println("\n**Pedido saiu para entrega!**");
        System.out.println("\nCódigo do pacote: " + pacote.getCodigo());
        System.out.println("Veículo de transporte: " + "tipo:" + veiculo.getTipoVeiculo() + ", placa:" + veiculo.getPlacaVeiculo());
        System.out.println("Status: " + pacote.getStatus());
    }

    @Override
    public String toString() {
        return "Código do pacote: " + pacote.getCodigo() + "\nVeículo de transporte: " + "tipo:" + veiculo.getTipoVeiculo() + ", placa:" + veiculo.getPlacaVeiculo() + "\nStatus: " + pacote.getStatus();
    }
}
