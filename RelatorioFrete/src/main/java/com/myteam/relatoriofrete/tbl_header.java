package com.myteam.relatoriofrete;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class tbl_header implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "TBL_HEADER_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "TBL_HEADER_ID_GENERATOR", sequenceName = "TBL_HEADER_ID_SEQ")
   private java.lang.Long id;

   private java.lang.Integer chave_controle;

   private java.lang.Integer cd_empresa;

   private java.lang.String cd_roteiro;

   private java.lang.Integer ano_roteiro;

   private java.lang.Integer nr_pedido;

   private java.lang.String cliente_follow;

   private java.lang.Integer nr_fatura;

   private java.lang.Integer nota_fiscal;

   private java.util.Date dt_eta;

   private char flag_fatura;

   private java.lang.Integer dias_de_atraso;

   private java.lang.String filial_operac;

   private java.util.Date data_criacao;

   private java.util.Date data_processamento;

   private char status;

   public tbl_header()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.Integer getChave_controle()
   {
      return this.chave_controle;
   }

   public void setChave_controle(java.lang.Integer chave_controle)
   {
      this.chave_controle = chave_controle;
   }

   public java.lang.Integer getCd_empresa()
   {
      return this.cd_empresa;
   }

   public void setCd_empresa(java.lang.Integer cd_empresa)
   {
      this.cd_empresa = cd_empresa;
   }

   public java.lang.String getCd_roteiro()
   {
      return this.cd_roteiro;
   }

   public void setCd_roteiro(java.lang.String cd_roteiro)
   {
      this.cd_roteiro = cd_roteiro;
   }

   public java.lang.Integer getAno_roteiro()
   {
      return this.ano_roteiro;
   }

   public void setAno_roteiro(java.lang.Integer ano_roteiro)
   {
      this.ano_roteiro = ano_roteiro;
   }

   public java.lang.Integer getNr_pedido()
   {
      return this.nr_pedido;
   }

   public void setNr_pedido(java.lang.Integer nr_pedido)
   {
      this.nr_pedido = nr_pedido;
   }

   public java.lang.String getCliente_follow()
   {
      return this.cliente_follow;
   }

   public void setCliente_follow(java.lang.String cliente_follow)
   {
      this.cliente_follow = cliente_follow;
   }

   public java.lang.Integer getNr_fatura()
   {
      return this.nr_fatura;
   }

   public void setNr_fatura(java.lang.Integer nr_fatura)
   {
      this.nr_fatura = nr_fatura;
   }

   public java.lang.Integer getNota_fiscal()
   {
      return this.nota_fiscal;
   }

   public void setNota_fiscal(java.lang.Integer nota_fiscal)
   {
      this.nota_fiscal = nota_fiscal;
   }

   public java.util.Date getDt_eta()
   {
      return this.dt_eta;
   }

   public void setDt_eta(java.util.Date dt_eta)
   {
      this.dt_eta = dt_eta;
   }

   public char getFlag_fatura()
   {
      return this.flag_fatura;
   }

   public void setFlag_fatura(char flag_fatura)
   {
      this.flag_fatura = flag_fatura;
   }

   public java.lang.Integer getDias_de_atraso()
   {
      return this.dias_de_atraso;
   }

   public void setDias_de_atraso(java.lang.Integer dias_de_atraso)
   {
      this.dias_de_atraso = dias_de_atraso;
   }

   public java.lang.String getFilial_operac()
   {
      return this.filial_operac;
   }

   public void setFilial_operac(java.lang.String filial_operac)
   {
      this.filial_operac = filial_operac;
   }

   public java.util.Date getData_criacao()
   {
      return this.data_criacao;
   }

   public void setData_criacao(java.util.Date data_criacao)
   {
      this.data_criacao = data_criacao;
   }

   public java.util.Date getData_processamento()
   {
      return this.data_processamento;
   }

   public void setData_processamento(java.util.Date data_processamento)
   {
      this.data_processamento = data_processamento;
   }

   public char getStatus()
   {
      return this.status;
   }

   public void setStatus(char status)
   {
      this.status = status;
   }

   public tbl_header(java.lang.Long id, java.lang.Integer chave_controle,
         java.lang.Integer cd_empresa, java.lang.String cd_roteiro,
         java.lang.Integer ano_roteiro, java.lang.Integer nr_pedido,
         java.lang.String cliente_follow, java.lang.Integer nr_fatura,
         java.lang.Integer nota_fiscal, java.util.Date dt_eta, char flag_fatura,
         java.lang.Integer dias_de_atraso, java.lang.String filial_operac,
         java.util.Date data_criacao, java.util.Date data_processamento,
         char status)
   {
      this.id = id;
      this.chave_controle = chave_controle;
      this.cd_empresa = cd_empresa;
      this.cd_roteiro = cd_roteiro;
      this.ano_roteiro = ano_roteiro;
      this.nr_pedido = nr_pedido;
      this.cliente_follow = cliente_follow;
      this.nr_fatura = nr_fatura;
      this.nota_fiscal = nota_fiscal;
      this.dt_eta = dt_eta;
      this.flag_fatura = flag_fatura;
      this.dias_de_atraso = dias_de_atraso;
      this.filial_operac = filial_operac;
      this.data_criacao = data_criacao;
      this.data_processamento = data_processamento;
      this.status = status;
   }

}