
package com.emendas.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Emenda {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String autor;
    private String destino;
    private double valorTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Uso> usos = new ArrayList<>();

    public double getValorUsado() { return usos.stream().mapToDouble(Uso::getValor).sum(); }
    public double getSaldo() { return valorTotal - getValorUsado(); }
    public List<Uso> getUsos() { return usos; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }
    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
}
