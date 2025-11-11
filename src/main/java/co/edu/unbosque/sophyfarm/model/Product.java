package co.edu.unbosque.sophyfarm.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "elemento")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Coincide con CSV: codigo_elemnto (sin la "e" faltante)
    @Column(name = "codigo_elemnto")
    private String codigo;

    // Coincide con CSV: nmbre_elemnto (sin la "o")
    @Column(name = "nmbre_elemnto")
    private String nombre;

    // Coincide con CSV: dscrpcion_elemnto (sin la "e")
    @Column(name = "dscrpcion_elemnto")
    private String descripcion;

    // Coincide con CSV: ctgria_elemnto (sin la "a")
    @Column(name = "ctgria_elemnto")
    private Short categoria;

    // Coincide con CSV: und_elemnto (sin la "i")
    @Column(name = "und_elemnto")
    private Short unidad;

    // Coincide con CSV: exstncia_elemnto (sin la "i")
    @Column(name = "exstncia_elemnto")
    private Integer existencia;

    // Coincide con CSV: bdga_elemnto (sin las letras completas)
    @Column(name = "bdga_elemnto")
    private Integer bodega;

    @Column(name = "precio_venta_ac")
    private BigDecimal precioActual;

    @Column(name = "precio_venta_an")
    private BigDecimal precioAnterior;

    @Column(name = "costo_venta")
    private BigDecimal costo;

    // Coincide con CSV: mrgen_utldad (sin algunas letras)
    @Column(name = "mrgen_utldad")
    private Double margenUtilidad;

    @Column(name = "tiene_iva")
    private String tieneIva;

    @Column(name = "stock_minimo")
    private Integer stockMinimo;

    @Column(name = "stock_maximo")
    private Integer stockMaximo;

    @Column(name = "estado")
    private String estado;

    // ==========================
    // Getters y Setters
    // ==========================

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Short getCategoria() { return categoria; }
    public void setCategoria(Short categoria) { this.categoria = categoria; }

    public Short getUnidad() { return unidad; }
    public void setUnidad(Short unidad) { this.unidad = unidad; }

    public Integer getExistencia() { return existencia; }
    public void setExistencia(Integer existencia) { this.existencia = existencia; }

    public Integer getBodega() { return bodega; }
    public void setBodega(Integer bodega) { this.bodega = bodega; }

    public BigDecimal getPrecioActual() { return precioActual; }
    public void setPrecioActual(BigDecimal precioActual) { this.precioActual = precioActual; }

    public BigDecimal getPrecioAnterior() { return precioAnterior; }
    public void setPrecioAnterior(BigDecimal precioAnterior) { this.precioAnterior = precioAnterior; }

    public BigDecimal getCosto() { return costo; }
    public void setCosto(BigDecimal costo) { this.costo = costo; }

    public Double getMargenUtilidad() { return margenUtilidad; }
    public void setMargenUtilidad(Double margenUtilidad) { this.margenUtilidad = margenUtilidad; }

    public String getTieneIva() { return tieneIva; }
    public void setTieneIva(String tieneIva) { this.tieneIva = tieneIva; }

    public Integer getStockMinimo() { return stockMinimo; }
    public void setStockMinimo(Integer stockMinimo) { this.stockMinimo = stockMinimo; }

    public Integer getStockMaximo() { return stockMaximo; }
    public void setStockMaximo(Integer stockMaximo) { this.stockMaximo = stockMaximo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}

