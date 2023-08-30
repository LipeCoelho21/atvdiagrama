package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BaseDadosComuns extends BaseIdentificador {

    protected LocalDate dataInsercao;

    public LocalDate getDataInserção() {
        return dataInsercao;
    }

    public void setDataInserção(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;

    }

    public BaseDadosComuns(int codigo, LocalDate dataInsercao) {
        super(codigo);
        this.dataInsercao = dataInsercao;
        
    }









}