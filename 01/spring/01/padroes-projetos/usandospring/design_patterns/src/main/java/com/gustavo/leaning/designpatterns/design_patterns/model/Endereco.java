package com.gustavo.leaning.designpatterns.design_patterns.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Os atributos desse modelo foram gerados automaticamente pelo site
 * jsonschema2pojo.org. Para isso, usamos o JSON de retorno da API do ViaCEP.
 * 
 * @see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo.org</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author gustavo
 */

@Entity
@Table (name = "tb_endereco")
public class Endereco {

    @Id
    private String cep;

    private String lougradouro;

    private String complemento;

    private String bairro;

    private String uf;

    private String ibge;

    private String gia;

    private String ddd;

    private String siafi;

    public Endereco(){
        //
    }

    

    /**
     * @return String return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return String return the lougradouro
     */
    public String getLougradouro() {
        return lougradouro;
    }

    /**
     * @param lougradouro the lougradouro to set
     */
    public void setLougradouro(String lougradouro) {
        this.lougradouro = lougradouro;
    }

    /**
     * @return String return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return String return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return String return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return String return the ibge
     */
    public String getIbge() {
        return ibge;
    }

    /**
     * @param ibge the ibge to set
     */
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    /**
     * @return String return the gia
     */
    public String getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(String gia) {
        this.gia = gia;
    }

    /**
     * @return String return the ddd
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * @param ddd the ddd to set
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * @return String return the siafi
     */
    public String getSiafi() {
        return siafi;
    }

    /**
     * @param siafi the siafi to set
     */
    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

}
