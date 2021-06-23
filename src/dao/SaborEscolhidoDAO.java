package dao;

import model.SaborEscolhido;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaborEscolhidoDAO {
    public void salvar(SaborEscolhido s) {
        String insert = "INSERT INTO sabor (tamanho_pequena, tamanho_media, tamanho_grande, quantidade_pequena, quantidade_media, quantidade_grande, sabor_pequena, sabor_media, sabor_grande)" +
                "VALUES (?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps = null;
        try {
            ps = ConnectionDataBase.getConnection().prepareStatement(insert);

            ps.setObject(1, s.getTamanhoPequena());
            ps.setObject(2, s.getTamanhoMedia());
            ps.setObject(3, s.getTamanhoGrande());
            ps.setObject(4, s.getQuantidadePequena());
            ps.setObject(5, s.getQuantidadeMedia());
            ps.setObject(5, s.getQuantidadeGrande());
            ps.setObject(5, s.getSaborPequena());
            ps.setObject(5, s.getSaborMedia());
            ps.setObject(5, s.getSaborGrande());

            ps.execute();
            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}