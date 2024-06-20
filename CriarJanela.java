import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;

public class CriarJanela {
    public static void main(String[]args){
        JFrame janela = new JFrame();
        janela.setVisible(true);
        janela.setSize(800,500);
        janela.setTitle("Minha primeira janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setLayout(null);
        JButton botao = new JButton();
        botao.setText("Clique Aqui");
        botao.setBounds(100, 200, 200,70);
        janela.add(botao);

        JButton botaoOk= new JButton();
        botaoOk.setText("Você clicou em ok!");
        botaoOk.setBounds(400, 200, 200, 70);
        janela.add(botaoOk);

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(janela,"Deu tudo certo");
            }
        });
        

        botaoOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(janela,"Você clicou ok!");
            }
        });

    }            
}
