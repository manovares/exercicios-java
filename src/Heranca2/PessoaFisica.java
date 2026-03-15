package Heranca2;

public class PessoaFisica extends Pessoa {
    private String rg;
    private String cpf;

    public PessoaFisica(int id, String nome, String rg, String cpf) {
        super(id, nome);
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
