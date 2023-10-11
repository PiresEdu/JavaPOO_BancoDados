import javax.swing.JOptionPane;

public class Main {

    static int menu() {
        String msg = " Escolha sua opcao:\n 1 - Cadastrar\n 2 - Atualizar\n 3 - Apagar\n 4 - Exibir pessoas\n 0 - Sair";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));

        return opcao;
    }

    public static void main(String args[]) {
        int op = menu();
        do {
            switch (op) {
                case 1:
                    String nome = JOptionPane.showInputDialog(" Digite o nome: ");
                    String email = JOptionPane.showInputDialog(" Digite o email: ");
                    String fone = JOptionPane.showInputDialog(" Digite o fone:");
                    Pessoa p = new Pessoa(nome, fone, email);
                    if (p.cadastrar()) {
                        JOptionPane.showMessageDialog(null, " Cadastro realizado com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, " Cadastro falhou");
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado, Volte Sempre");

            }
        } while (op != 0);
    }
}
