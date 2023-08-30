package uniderp.poo.escola.dominio;

import java.time.LocalDate; 

public class Professor extends BaseFuncionario {
    
    private String registro;
    private String cadeira;
    
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getCadeira() {
        return cadeira;
    }
    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }
    
    public Professor(int codigo, LocalDate dataInsercao, String endereço, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String registro2, String cadeira) {
        super(codigo, dataInsercao, endereço, telefone, nome, rg, cpf, dataNascimento, cracha, registro,
                dataVinculoInicial, dataVinculoFinal);
        this.registro = registro;
        this.cadeira = cadeira;
    } 
}
