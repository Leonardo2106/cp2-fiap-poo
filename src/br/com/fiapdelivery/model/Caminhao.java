package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
    private int eixos;
    private double pesoBrutoTotal;

    public Caminhao(String tipoVeiculo, String fabricante, String placaVeiculo, double capacidadeLitros, String categoriaCnh){
        super(tipoVeiculo, fabricante, placaVeiculo, capacidadeLitros, categoriaCnh);
        this.setEixos(0);
        this.setPesoBrutoTotal(3500);
    }

    public int getEixos() {
        return eixos;
    }

    private void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    private void setPesoBrutoTotal(double pesoBrutoTotal) {
        this.pesoBrutoTotal = pesoBrutoTotal;
    }

    public void afirmarEixos(int eixos) {
        if (eixos < 0) {
            System.out.println("\n[ALERTA - eixos] Este campo não pode ser menor que zero (0)");
            return;
        }

        this.setEixos(eixos);
    }

    public void afirmarPesoBrutoTotal(double pesoBrutoTotal) {
        if (pesoBrutoTotal < 0) {
            System.out.println("\n[ALERTA - pesoBrutoTotal] Este campo não pode ser menor que zero (0)");
            return;
        }

        this.setPesoBrutoTotal(pesoBrutoTotal);
    }

    @Override
    public String toString() {
        return super.toString() + "\nEixos: " + eixos + "\nPeso Bruto: " + pesoBrutoTotal + " Kg";
    }
}
