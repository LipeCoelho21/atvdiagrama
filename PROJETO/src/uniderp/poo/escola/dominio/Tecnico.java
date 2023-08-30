package uniderp.poo.escola.dominio;

import java.time.LocalDate; 

public class Tecnico extends BaseFuncionario {
    
    private String cracha;
    private String setor;
    
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public Tecnico(int codigo, LocalDate dataInsercao, String endereço, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String cracha2, String setor) {
        super(codigo, dataInsercao, endereço, telefone, nome, rg, cpf, dataNascimento, cracha, registro,
                dataVinculoInicial, dataVinculoFinal);
        this.cracha = cracha;
        this.setor = setor;
    }
}
