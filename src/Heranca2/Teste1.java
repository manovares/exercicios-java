package Heranca2;

public class Teste1 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Nome da Pessoa");

        PessoaJuridica p_juridica = new PessoaJuridica(2, "Nome da Pessoa Juridica", "1111111111");

        PessoaFisica p_fisica = new PessoaFisica(3, "Nome da Pessoa Fisica", "222222222", "333333333");


        System.out.println(pessoa1.getId());
        System.out.println(pessoa1.getNome());
        System.out.println(p_juridica.getId());
        System.out.println(p_juridica.getNome());
        System.out.println(p_juridica.getCnpj());

        System.out.println(p_fisica.getId());
        System.out.println(p_fisica.getNome());
        System.out.println(p_fisica.getCpf());
        System.out.println(p_fisica.getRg());

    }
}
