package bean;
// Generated 20/11/2023 16:14:59 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GasUsuarios generated by hbm2java
 */
@Entity
@Table(name="gas_usuarios"
    ,catalog="db_geovane_silva"
)
public class GasUsuarios  implements java.io.Serializable {


     private int gasIdusuarios;
     private String gasApelido;
     private String gasNome;
     private Date gasDataNasc;
     private String gasSenha;
     private int gasNivel;
     private String gasAtivo;
     private String gasCpf;

    public GasUsuarios() {
    }

	
  
    public GasUsuarios(int gasIdusuarios, String gasApelido, String gasNome, Date gasDataNasc, String gasSenha, Integer gasNivel, String gasAtivo, String gasCpf) {
       this.gasIdusuarios = gasIdusuarios;
       this.gasApelido = gasApelido;
       this.gasNome = gasNome;
       this.gasDataNasc = gasDataNasc;
       this.gasSenha = gasSenha;
       this.gasNivel = gasNivel;
       this.gasAtivo = gasAtivo;
       this.gasCpf = gasCpf;
    }
   
     @Id 

    
    @Column(name="gas_idusuarios", unique=true, nullable=false)
    public int getGasIdusuarios() {
        return this.gasIdusuarios;
    }
    
    public void setGasIdusuarios(int gasIdusuarios) {
        this.gasIdusuarios = gasIdusuarios;
    }

    
    @Column(name="gas_apelido", length=45)
    public String getGasApelido() {
        return this.gasApelido;
    }
    
    public void setGasApelido(String gasApelido) {
        this.gasApelido = gasApelido;
    }

    
    @Column(name="gas_nome", length=45)
    public String getGasNome() {
        return this.gasNome;
    }
    
    public void setGasNome(String gasNome) {
        this.gasNome = gasNome;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="gas_dataNasc", length=10)
    public Date getGasDataNasc() {
        return this.gasDataNasc;
    }
    
    public void setGasDataNasc(Date gasDataNasc) {
        this.gasDataNasc = gasDataNasc;
    }

    
    @Column(name="gas_senha", length=45)
    public String getGasSenha() {
        return this.gasSenha;
    }
    
    public void setGasSenha(String gasSenha) {
        this.gasSenha = gasSenha;
    }

    
    @Column(name="gas_nivel")
    public int getGasNivel() {
        return this.gasNivel;
    }
    
    public void setGasNivel(int gasNivel) {
        this.gasNivel = gasNivel;
    }

    
    @Column(name="gas_ativo", length=45)
    public String getGasAtivo() {
        return this.gasAtivo;
    }
    
    public void setGasAtivo(String gasAtivo) {
        this.gasAtivo = gasAtivo;
    }

    
    @Column(name="gas_cpf", length=45)
    public String getGasCpf() {
        return this.gasCpf;
    }
    
    public void setGasCpf(String gasCpf) {
        this.gasCpf = gasCpf;
    }




}


