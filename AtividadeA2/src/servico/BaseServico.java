package servico;

import java.util.ArrayList;

public abstract class BaseServico<TDominio> {
  // ação a ser executada.
  // BREAD - NAVERGAR, LER, EDITAR, ADICIONAR E Deletar
  public abstract ArrayList<TDominio> Navegar();// ReadAll

  public abstract TDominio Ler(int chave);// Read

  public abstract TDominio Editar(TDominio obj);// Update

  public abstract TDominio Adicionar(TDominio obj);// Create

  public abstract TDominio Deletar(int chave);// Delete

}
