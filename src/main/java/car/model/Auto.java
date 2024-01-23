package car.model;

public class Auto {
    private String marca;
    private String modelo;
    private String placa;
    private String cilindraje;
    private String anio;
    private String consumo;

    public Auto() {
    }

    public Auto(String marca, String modelo, String placa, String cilindraje, String anio, String consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.anio = anio;
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", cilindraje='" + cilindraje + '\'' +
                ", anio='" + anio + '\'' +
                ", consumo='" + consumo + '\'' +
                '}';
    }
}
