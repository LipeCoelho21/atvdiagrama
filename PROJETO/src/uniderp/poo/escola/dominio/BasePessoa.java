package uniderp.poo.escola.dominio;

import java.time.LocalDate;    

public abstract class BasePessoa extends BaseDadosComuns {
   
    protected String endereço;
    protected String telefone;
    
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public BasePessoa(int codigo, LocalDate dataInsercao, String endereço, String telefone) {
        super(codigo, dataInsercao);
        this.endereço = endereço;
        this.telefone = telefone;
    }
}
