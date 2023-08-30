package uniderp.poo.escola.dominio;

import java.time.LocalDate; 

public abstract class BaseAluno extends BasePessoaFisica {
    
    private String matricula;
    private LocalDate dataMatricula;
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    
    public BaseAluno(int codigo, LocalDate dataInsercao, String endereço, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String matricula, LocalDate dataMatricula) {
        super(codigo, dataInsercao, endereço, telefone, nome, rg, cpf, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
}
