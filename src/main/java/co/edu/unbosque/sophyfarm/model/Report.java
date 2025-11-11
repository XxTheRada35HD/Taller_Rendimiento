package co.edu.unbosque.sophyfarm.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reporteventa")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reporte_id")
    private Long id;

    @Column(name = "codigo_elemento")
    private String  codigoElemento;

    private Integer cantidad;

    @Column(name = "fecha_venta")
    private LocalDate fechaVenta;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String  getCodigoElemento() { return codigoElemento; }
    public void setCodigoElemento(String  codigoElemento) { this.codigoElemento = codigoElemento; }

    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }

    public LocalDate getFechaVenta() { return fechaVenta; }
    public void setFechaVenta(LocalDate fechaVenta) { this.fechaVenta = fechaVenta; }
}