package bean;
// Generated 04/12/2023 10:11:15 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GasFornecedor generated by hbm2java
 */
@Entity
@Table(name = "gas_fornecedor",
         catalog = "db_geovane_silva"
)
public class GasFornecedor implements java.io.Serializable {

    private int gasIdfornecedor;
    private String gasNome;
    private String gasCidade;
    private String gasCpf;
    private String gasRg;
    private String gasApelido;
    private Date gasDataNascimento;
    private String gasSexo;
    private String gasEmail;
    private String gasEstado;
    private Date gasDataCadastro;
    private String gasIdade;
    private String gasCep;
    private String gasTelefone;
    private String gasCnpj;

    public GasFornecedor() {
    }

    public GasFornecedor(int gasIdfornecedor) {
        this.gasIdfornecedor = gasIdfornecedor;
    }

    public GasFornecedor(int gasIdfornecedor, String gasNome, String gasCidade, String gasCpf, String gasRg, String gasApelido, Date gasDataNascimento, String gasSexo, String gasEmail, String gasEstado, Date gasDataCadastro, String gasIdade, String gasCep, String gasTelefone, String gasCnpj) {
        this.gasIdfornecedor = gasIdfornecedor;
        this.gasNome = gasNome;
        this.gasCidade = gasCidade;
        this.gasCpf = gasCpf;
        this.gasRg = gasRg;
        this.gasApelido = gasApelido;
        this.gasDataNascimento = gasDataNascimento;
        this.gasSexo = gasSexo;
        this.gasEmail = gasEmail;
        this.gasEstado = gasEstado;
        this.gasDataCadastro = gasDataCadastro;
        this.gasIdade = gasIdade;
        this.gasCep = gasCep;
        this.gasTelefone = gasTelefone;
        this.gasCnpj = gasCnpj;
    }

    @Id

    @Column(name = "gas_idfornecedor", unique = true, nullable = false)
    public int getGasIdfornecedor() {
        return this.gasIdfornecedor;
    }

    public void setGasIdfornecedor(int gasIdfornecedor) {
        this.gasIdfornecedor = gasIdfornecedor;
    }

    @Column(name = "gas_nome", length = 45)
    public String getGasNome() {
        return this.gasNome;
    }

    public void setGasNome(String gasNome) {
        this.gasNome = gasNome;
    }

    @Column(name = "gas_cidade", length = 45)
    public String getGasCidade() {
        return this.gasCidade;
    }

    public void setGasCidade(String gasCidade) {
        this.gasCidade = gasCidade;
    }

    @Column(name = "gas_cpf", length = 45)
    public String getGasCpf() {
        return this.gasCpf;
    }

    public void setGasCpf(String gasCpf) {
        this.gasCpf = gasCpf;
    }

    @Column(name = "gas_rg", length = 45)
    public String getGasRg() {
        return this.gasRg;
    }

    public void setGasRg(String gasRg) {
        this.gasRg = gasRg;
    }

    @Column(name = "gas_apelido", length = 45)
    public String getGasApelido() {
        return this.gasApelido;
    }

    public void setGasApelido(String gasApelido) {
        this.gasApelido = gasApelido;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "gas_dataNascimento", length = 10)
    public Date getGasDataNascimento() {
        return this.gasDataNascimento;
    }

    public void setGasDataNascimento(Date gasDataNascimento) {
        this.gasDataNascimento = gasDataNascimento;
    }

    @Column(name = "gas_sexo", length = 45)
    public String getGasSexo() {
        return this.gasSexo;
    }

    public void setGasSexo(String gasSexo) {
        this.gasSexo = gasSexo;
    }

    @Column(name = "gas_email", length = 45)
    public String getGasEmail() {
        return this.gasEmail;
    }

    public void setGasEmail(String gasEmail) {
        this.gasEmail = gasEmail;
    }

    @Column(name = "gas_estado", length = 45)
    public String getGasEstado() {
        return this.gasEstado;
    }

    public void setGasEstado(String gasEstado) {
        this.gasEstado = gasEstado;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "gas_data_cadastro", length = 10)
    public Date getGasDataCadastro() {
        return this.gasDataCadastro;
    }

    public void setGasDataCadastro(Date gasDataCadastro) {
        this.gasDataCadastro = gasDataCadastro;
    }

    @Column(name = "gas_idade", length = 45)
    public String getGasIdade() {
        return this.gasIdade;
    }

    public void setGasIdade(String gasIdade) {
        this.gasIdade = gasIdade;
    }

    @Column(name = "gas_cep", length = 45)
    public String getGasCep() {
        return this.gasCep;
    }

    public void setGasCep(String gasCep) {
        this.gasCep = gasCep;
    }

    @Column(name = "gas_telefone", length = 45)
    public String getGasTelefone() {
        return this.gasTelefone;
    }

    public void setGasTelefone(String gasTelefone) {
        this.gasTelefone = gasTelefone;
    }

    @Column(name = "gas_cnpj", length = 45)
    public String getGasCnpj() {
        return this.gasCnpj;
    }

    public void setGasCnpj(String gasCnpj) {
        this.gasCnpj = gasCnpj;
    }

    @Override
    public String toString() {
        return getGasNome();
    }

    public boolean equals(Object object) {
        if (object instanceof GasFornecedor) {
            GasFornecedor gasFornecedor = (GasFornecedor) object;
            if (this.getGasIdfornecedor() == gasFornecedor.getGasIdfornecedor()) {
                return true;
            }
        }
        return false;

    }

}
