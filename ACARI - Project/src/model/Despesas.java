package model;
// Generated 08/08/2018 15:24:22 by Hibernate Tools 4.3.1



/**
 * Despesas generated by hbm2java
 */
public class Despesas  implements java.io.Serializable {


     private int idDespesa;
     private TiposDespesas tiposDespesas;
     private String titulo;
     private Integer valor;

    public Despesas() {
    }

	
    public Despesas(int idDespesa) {
        this.idDespesa = idDespesa;
    }
    public Despesas(int idDespesa, TiposDespesas tiposDespesas, String titulo, Integer valor) {
       this.idDespesa = idDespesa;
       this.tiposDespesas = tiposDespesas;
       this.titulo = titulo;
       this.valor = valor;
    }
   
    public int getIdDespesa() {
        return this.idDespesa;
    }
    
    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }
    public TiposDespesas getTiposDespesas() {
        return this.tiposDespesas;
    }
    
    public void setTiposDespesas(TiposDespesas tiposDespesas) {
        this.tiposDespesas = tiposDespesas;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getValor() {
        return this.valor;
    }
    
    public void setValor(Integer valor) {
        this.valor = valor;
    }




}


