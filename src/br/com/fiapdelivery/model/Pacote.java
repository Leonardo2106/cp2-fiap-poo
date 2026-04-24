package br.com.fiapdelivery.model;

public class Pacote {
    private String codigo;
    private double peso;
    private boolean eFragil;
    private String status;

    public Pacote(String codigo, double peso, boolean eFragil, String status) {
        this.setCodigo(codigo);
        this.setPeso(peso);
        this.eFragil = eFragil;
        this.setStatus(status);
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            System.out.println("\n[ALERTA - codigo] Este campo não pode ser vazio");
            return;
        } else if (!codigo.matches("^[A-Z]{3}[0-9]{2}[A-Z]{3}[0-9]{3}")){
            System.out.println("\n[ALERTA - codigo] O codigo do pacote precisa estar de acordo com o padrão (AAA00AAA000)");
        }

        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        if (peso < 0) {
            System.out.println("\n[ALERTA - peso] Este campo não pode ser menor que zero (0)");
            return;
        }

        this.peso = peso;
    }

    public boolean iseFragil() {
        return eFragil;
    }

    public void afirmarFragil(){
        this.eFragil = true;
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        if (status == null || status.isBlank()) {
            System.out.println("\n[ALERTA - status] Este campo não pode ser vazio");
            return;
        }

        this.status = status;
    }

    public void alterarStatus(String statusAlterado) {
        status = statusAlterado;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nPeso: " + peso + " Kg" + "\nStatus: " + status;
    }
}
