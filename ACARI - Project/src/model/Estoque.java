 package model;
// Generated 08/08/2018 15:24:22 by Hibernate Tools 4.3.1



/**
 * Estoque generated by hbm2java
 */
public class Estoque  implements java.io.Serializable {


     private int idMaterial;
     private Materiais materiais;
     private Double quantidadeTotalkg;

    public Estoque() {
    }

	
    public Estoque(Materiais materiais) {
        this.materiais = materiais;
    }
    public Estoque(Materiais materiais, Double quantidadeTotalkg) {
       this.materiais = materiais;
       this.quantidadeTotalkg = quantidadeTotalkg;
    }
   
    public int getIdMaterial() {
        return this.idMaterial;
    }
    
    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }
    public Materiais getMateriais() {
        return this.materiais;
    }
    
    public void setMateriais(Materiais materiais) {
        this.materiais = materiais;
    }
    public Double getQuantidadeTotalkg() {
        return this.quantidadeTotalkg;
    }
    
    public void setQuantidadeTotalkg(Double quantidadeTotalkg) {
        this.quantidadeTotalkg = quantidadeTotalkg;
    }




}


