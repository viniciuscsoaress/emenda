
package com.emendas.model;
import jakarta.persistence.*;

@Entity
public class Uso {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;
    private String local;
    private String descricao;
    private double valor;

    public double getValor() { return valor; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setValor(double valor) { this.valor = valor; }
}
