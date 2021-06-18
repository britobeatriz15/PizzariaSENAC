package controller;

import model.Cliente;
import model.SaborEscolhido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class PizzaPedido {
    private JLabel jLabelPedido;
    private JTextField jTextFieldNumeroPedido;
    private JTextField jTextFieldDataPedido;
    private JTextField jTextFieldNomeCliente;
    private JTextField jTextFieldEndereçoCompleto;
    private JTextField jTextFieldTelefoneCliente;
    private JButton jButtonCadastrar;
    private JButton jButtonLimpar;
    private JLabel jLabelCardapio;
    private JRadioButton jRadioButtonTamanhoPequeno;
    private JRadioButton jRadioButtonTamanhoMedia;
    private JRadioButton jRadioButtonGrande;
    private JLabel jLabelTamanhoPizza;
    private JLabel jLabelSabores;
    private JRadioButton jRadioButtonCalabresa;
    private JRadioButton jRadioButtonQuatroQueijos;
    private JRadioButton jRadioButtonChocolate;
    private JRadioButton jRadioButtonPrestigio;
    private JButton jButtonAdicionar;
    private JButton jButtonFinalizar;
    private JLabel jLabelSaborQuatroQueijo;
    private JLabel jLabelSaborChocolate;
    private JLabel jLabelSaborPrestigio;
    private JLabel jLabelSaborCalabresa;
    private JLabel jLabelNomePedido;
    private JLabel jLabelDataPedido;
    private JLabel jLabelNomeCliente;
    private JLabel jLabelEndereço;
    private JLabel jLabelTelefone;
    private JPanel JPanelPizzaria;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(800, 800));
        frame.setJMenuBar(menuBar);
        frame.pack();
    }

    public  PizzaPedido() {
        jButtonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNumeroPedido(Integer.parseInt(jTextFieldNumeroPedido.getText()));
                try {
                    cliente.setDataPedido(new SimpleDateFormat("dd/MM/yyyy").parse(jTextFieldDataPedido.getText()));
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }
                cliente.setNomeCliente(jTextFieldNomeCliente.getText());
                cliente.setEndereçoCliente(jTextFieldEndereçoCompleto.getText());
                cliente.setTelefoneCliente(Integer.parseInt(jTextFieldTelefoneCliente.getText()));
            }
        });

        jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextFieldNumeroPedido.setText("");
                jTextFieldDataPedido.setText("");
                jTextFieldNomeCliente.setText("");
                jTextFieldEndereçoCompleto.setText("");
                jTextFieldTelefoneCliente.setText("");
            }
        });

        jButtonAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaborEscolhido sabor = new SaborEscolhido();
                sabor.setTamanhoPequena(jRadioButtonTamanhoPequeno.isSelected());
                sabor.setTamanhoMedia(jRadioButtonTamanhoMedia.isSelected());
                sabor.setTamanhoGrande(jRadioButtonGrande.isSelected());
                sabor.setPizzaCalabresa(jRadioButtonCalabresa.isSelected());
                sabor.setPizzaQuatroQueijos(jRadioButtonQuatroQueijos.isSelected());
                sabor.setPizzaChocolate(jRadioButtonChocolate.isSelected());
                sabor.setPizzaPrestigio(jRadioButtonPrestigio.isSelected());
            }
        });
        jButtonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



    }
}

