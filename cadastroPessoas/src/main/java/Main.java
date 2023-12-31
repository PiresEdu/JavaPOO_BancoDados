import javax.swing.JOptionPane;

public class Main {
    
    static int menu() {
        int opcao;
        do {
            String msg = """
                         Escolha sua opcao:
                         1 - cadastrar
                         2 - atualizar
                         3 - apagar uma pessoa
                         4 - exibir pessoas
                         0 - sair""";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
        } while (opcao < 0 || opcao > 4);
        return opcao;
    }

    public static void main (String args[]) {
        int op;
        do {
            op = menu();
            switch (op) {
                case 1 -> { 
                    String nome = JOptionPane.showInputDialog(" Digite o nome");
                    String email = JOptionPane.showInputDialog(" Digite email");
                    String fone = JOptionPane.showInputDialog(" Digite fone");
                    Pessoa p = new Pessoa(nome, fone, email);
                    if (p.cadastrar()) {
                        JOptionPane.showMessageDialog(null, " Cadastro realizado com sucesso :) ");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, " Cadastro falhou :( ");
                    }
                }
                case 2 -> {
                    String nome = JOptionPane.showInputDialog(" Digite o nome");
                    Pessoa p = new Pessoa(nome);
                    if (p.buscarPessoa()){
                     
                   } 
                    else {
                        JOptionPane.showMessageDialog(null, " Usuario nao encontrado");
                    }
                   
                }
                case 3 -> {
                }
                case 4 -> {
                    Pessoa p = new Pessoa();
                    JOptionPane.showMessageDialog(null, p.listarPessoas());
                }
                case 0 -> JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
            }
        }while (op != 0);
    }
    
}