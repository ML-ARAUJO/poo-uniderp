package servico;

import java.util.ArrayList;

public abstract class BaseServico<TDominio> {
  // ação a ser executada.
  // BREAD - NAVERGAR, LER, EDITAR, ADICIONAR E Deletar
  public abstract ArrayList<TDominio> Navegar();

  public abstract TDominio Ler(int chave);

  public abstract TDominio Editar(TDominio obj);

  public abstract TDominio Adicionar(TDominio obj);

  public abstract TDominio Deletar(int chave);

}
