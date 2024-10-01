import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        try {
            System.out.println("Informe o nome: ");
            String nome = scanner.nextLine();
            usuario.setNome(nome);
            System.out.println("Informe a idade: ");
            int idade = scanner.nextInt();
            usuario.setIdade(idade);

            System.out.println("O usuário " + nome + " foi cadastrado!");
        } catch (NomeInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }

        scanner.close();

    }
}
