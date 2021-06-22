package dao;

import model.SaborEscolhido;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaborEscolhidoDAO {
    public void salvar(SaborEscolhido s) {
        String insert = "INSERT INTO pedido (tamanho_pequena, tamanho_media, tamanho_grande, sabor_calabresa, sabor_quatro_queijos, sabor_chocolate, sabor_prestigio)" +
                "VALUES ('?,?,?,?,?,?,?)";

        PreparedStatement ps = null;
        try {
            ps = ConnectionDataBase.getConnection().prepareStatement(insert);

            ps.setObject(1, s.getTamanhoPequena());
            ps.setObject(2, s.getTamanhoMedia());
            ps.setObject(3, s.getTamanhoGrande());
            ps.setObject(4, s.getPizzaCalabresa());
            ps.setObject(5, s.getPizzaQuatroQueijos());
            ps.setObject(5, s.getPizzaChocolate());
            ps.setObject(5, s.getPizzaPrestigio());

            ps.execute();
            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}