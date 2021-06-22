package dao;

import model.Cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    public void salvar(Cliente c){
        String insert = "INSERT INTO pedido (numero_pedido, data_pedido, nome_cliente, endereco, telefone)"+
        "VALUES ('?,?,?,?,?)";

        PreparedStatement ps = null;
        try{
            ps = ConnectionDataBase.getConnection().prepareStatement(insert);

            ps.setObject(1,c.getNumeroPedido());
            ps.setObject(2,c.getDataPedido());
            ps.setObject(3,c.getNomeCliente());
            ps.setObject(4,c.getEndereçoCliente());
            ps.setObject(5,c.getTelefoneCliente());

            ps.execute();
            ps.close();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
