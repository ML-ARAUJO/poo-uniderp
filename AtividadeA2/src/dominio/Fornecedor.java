package dominio;

import java.time.LocalDate;

public class Fornecedor extends BasePessoa {

  private int codigo;
  private String razaoSocial;
  private String nomeFantasia;
  private String cnpj;
  private String email;
  private String telefone;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
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
    super();
  }

  public Fornecedor(String endereco, LocalDate dataDeInclusao, int codigo, String razaoSocial, String nomeFantasia,
      String cnpj, String email, String telefone) {
    super(endereco, dataDeInclusao);
    this.codigo = codigo;
    this.razaoSocial = razaoSocial;
    this.nomeFantasia = nomeFantasia;
    this.cnpj = cnpj;
    this.email = email;
    this.telefone = telefone;
  }

}
