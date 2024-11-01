package dominio;

import java.time.LocalDate;

public class Fornecedor extends BasePessoa {

  protected int codigoForn;
  protected String razaoSocial;
  protected String nomeFantasia;
  protected String cnpj;
  protected String email;
  protected String telefone;

  public int getCodigoForn() {
    return codigoForn;
  }

  public void setCodigo(int codigoForn) {
    this.codigoForn = codigoForn;
  }

  public String getRazaoSocial() {
    return razaoSocial;
  }

  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  public String getNomeFantasia() {
    return nomeFantasia;
  }

  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public Fornecedor() {

  }

  public Fornecedor(int codigo, String endereco, LocalDate dataDeInclusao, String descricao, int codigoForn,
      String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone) {
    this.codigoForn = codigoForn;
    this.razaoSocial = razaoSocial;
    this.nomeFantasia = nomeFantasia;
    this.cnpj = cnpj;
    this.email = email;
    this.telefone = telefone;
  }

}
