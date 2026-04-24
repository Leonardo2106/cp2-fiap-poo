package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
    private boolean temBau;

    public Moto(String tipoVeiculo, String fabricante, String placaVeiculo, double capacidadeLitros, String categoriaCnh, boolean temBau) {
        super(tipoVeiculo, fabricante, placaVeiculo, temBau ? capacidadeLitros : 0, categoriaCnh);
        this.temBau = temBau;
    }

    public boolean isTemBau() {
        return temBau;
    }

    public void afirmarTemBau() {
        this.temBau = true;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTem baú: " + temBau;
    }
}
