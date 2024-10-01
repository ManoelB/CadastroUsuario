public class Usuario {
    private String nome;
    private int idade;

    public void setNome(String nome) throws NomeInvalidoException{
        if (nome == null || nome.trim().equals("")){
            throw new NomeInvalidoException("Nome inválido! Não pode estar vazio, tente novamente!");
        }
        this.nome = nome;
    }

    public void setIdade(int idade)throws IdadeInvalidaException{
        if (idade < 18 || idade > 100){
            throw new IdadeInvalidaException("Idade inválida! A idade precisa ser de 18 a 100 anos.");
        }
        this.idade = idade;
    }
}