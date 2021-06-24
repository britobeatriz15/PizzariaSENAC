package controller;

import dao.ClienteDAO;
import dao.SaborEscolhidoDAO;
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
    private JLabel jLabelTamanhoPizza;
    private JLabel jLabelSabores;
    private JButton jButtonAdicionar;
    private JButton jButtonFinalizar;
    private JLabel jLabelSaborQuatroQueijo;
    private JLabel jLabelSaborChocolate;
    private JLabel jLabelSaborPrestigio;
    private JLabel jLabelSaborCalabresa;
    private JLabel jLabelDataPedido;
    private JLabel jLabelNomeCliente;
    private JLabel jLabelEndereço;
    private JLabel jLabelTelefone;
    private JPanel JPanelPizzaria;
    private JTextField jTextFieldTamanho;
    private JTextField jTextFieldSaborPizzaMedia;
    private JLabel jLabelPrestigio;
    private JLabel jLabelChocolate;
    private JLabel jLabelQuatroQueijo;
    private JLabel jLabelCalabresa;
    private JTextField jTextFieldQuantidadePizzaPequena;
    private JTextField jTextFieldQuantidadePizzaGrande;
    private JTextField jTextFieldSaborPizzaPequena;
    private JTextField jTextFieldSaborPizzaGrande;
    private JRadioButton jRadioButtonPequena;
    private JRadioButton jRadioButtonMedia;
    private JLabel jLabelSaborP;
    private JLabel jLabelSaborM;
    private JLabel jLabelSaborG;
    private JRadioButton jButtonPequena;
    private JRadioButton jButtonMedia;
    private JRadioButton jButtonGrande;
    private JTextField jTextFieldQuantidade;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new PizzaPedido().JPanelPizzaria);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(800, 800));
        frame.pack();
    }

    public  PizzaPedido() {
        jButtonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                 try {
                    cliente.setDataPedido(new SimpleDateFormat("dd/MM/yyyy").parse(jTextFieldDataPedido.getText()));
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }
                cliente.setNomeCliente(jTextFieldNomeCliente.getText());
                cliente.setEndereçoCliente(jTextFieldEndereçoCompleto.getText());
                cliente.setTelefoneCliente(Integer.parseInt(jTextFieldTelefoneCliente.getText()));

                ClienteDAO dao = new ClienteDAO();
                dao.salvar(cliente);
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
                if (jButtonPequena.isSelected()){
                    sabor.setTamanho("Pequeno");
                } else if (jButtonMedia.isSelected())
                    sabor.setTamanhoPizza("Medio");
                else
                    sabor.setTamanhoPizza("Grande");

                sabor.setQuantidadePequena(Integer.parseInt(jTextFieldQuantidadePizzaPequena.getText()));
                sabor.getSaborPizza(jTextFieldSaborPizzaPequena.getText());


                SaborEscolhidoDAO dao = new SaborEscolhidoDAO();
                dao.salvar(sabor);
            }
        });
        jButtonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog((Component)null,"Pedido realizado com sucesso");

            }
        });



    }
}

