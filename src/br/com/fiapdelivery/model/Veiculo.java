package br.com.fiapdelivery.model;

public class Veiculo {
    private String tipoVeiculo;
    private String fabricante;
    private String placaVeiculo;
    private double capacidadeLitros;
    private String categoriaCnh;

    public Veiculo(String tipoVeiculo, String fabricante, String placaVeiculo, double capacidadeLitros, String categoriaCnh) {
        this.setTipoVeiculo(tipoVeiculo);
        this.setFabricante(fabricante);
        this.setPlacaVeiculo(placaVeiculo);
        this.setCapacidadeLitros(capacidadeLitros);
        this.setCategoriaCnh(categoriaCnh);
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    private void setTipoVeiculo(String tipoVeiculo) {
        if (tipoVeiculo == null || tipoVeiculo.isBlank()) {
            System.out.println("\n[ALERTA - tipoVeiculo] Este campo não pode ser vazio");
            return;
        }

        this.tipoVeiculo = tipoVeiculo;
    }

    public String getFabricante() {
        return fabricante;
    }

    private void setFabricante(String fabricante) {
        if (fabricante == null || fabricante.isBlank()) {
            System.out.println("\n[ALERTA - fabricante] Este campo não pode ser vazio");
            return;
        }

        this.fabricante = fabricante;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    private void setPlacaVeiculo(String placaVeiculo) {
        if (placaVeiculo == null || placaVeiculo.isBlank()) {
            System.out.println("\n[ALERTA - placaVeiculo] Este campo não pode ser vazio");
            return;
        } else if (!placaVeiculo.matches("^[A-Z]{3}[0-9]{1}[A-Z]{1}[0-9]{2}")){
            System.out.println("\n[ALERTA - placaVeiculo] A placa do veículo precisa estar de acordo com o padrão (AAA0A00)");
        }

        this.placaVeiculo = placaVeiculo;
    }

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    protected void setCapacidadeLitros(double capacidadeLitros) {
        if (capacidadeLitros < 0) {
            System.out.println("\n[ALERTA - capacidadeLitros] Este campo não pode ser menor que zero (0)");
            return;
        }

        this.capacidadeLitros = capacidadeLitros;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    private void setCategoriaCnh(String categoriaCnh) {
        if (categoriaCnh == null || categoriaCnh.isBlank()) {
            System.out.println("\n[ALERTA - categoriaCnh] Este campo não pode ser vazio");
            return;
        }

        this.categoriaCnh = categoriaCnh;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipoVeiculo + "\nFabricante: " + fabricante + "\nPlaca: " + placaVeiculo + "\nCapacidade: " + capacidadeLitros + " L | " + capacidadeLitros / 1000 + " m³" + "\nCategoria: " + categoriaCnh;
    }
}
