package data;

public class Medicamento {
    String nombreMedicamento;
    int cantidadAsignada;
    String fechaVencimiento;
    int dosisPorDia;

    public Medicamento(String nombreMedicamento, int cantidadAsignada, String fechaVencimiento, int dosisPorDia) {
        this.nombreMedicamento = nombreMedicamento;
        this.cantidadAsignada = cantidadAsignada;
        this.fechaVencimiento = fechaVencimiento;
        this.dosisPorDia = dosisPorDia;
    }

    // Getters
    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public int getCantidadAsignada() {
        return cantidadAsignada;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getDosisPorDia() {
        return dosisPorDia;
    }

    // Setters
    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public void setCantidadAsignada(int cantidadAsignada) {
        this.cantidadAsignada = cantidadAsignada;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setDosisPorDia(int dosisPorDia) {
        this.dosisPorDia = dosisPorDia;
    }
}
