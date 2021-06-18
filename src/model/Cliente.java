package model;

import java.util.Date;

public class Cliente {
    private int numeroPedido;
    private Date dataPedido;
    private String nomeCliente;
    private String endereçoCliente;
    private int telefoneCliente;

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereçoCliente() {
        return endereçoCliente;
    }

    public void setEndereçoCliente(String endereçoCliente) {
        this.endereçoCliente = endereçoCliente;
    }

    public int getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(int telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
}
