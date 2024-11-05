/*
 * package visao;
 * 
 * import java.util.ArrayList;
 * 
 * import dominio.ClasseFornecedor;
 * import servico.ClasseFornecedorServ;
 * 
 * public class ClasseFornecedorVisao {
 * 
 * private ClasseFornecedorServ srv;
 * 
 * public ClasseFornecedorVisao() {
 * this.srv = new ClasseFornecedorServ();
 * }
 * 
 * public void Imprimir(ClasseFornecedor cf) {
 * System.out.println("Classe de Fornecedor");
 * System.out.println("Código: " + cf.getCodigo());
 * System.out.println("Descrição: " + cf.getDescricao());
 * System.out.println("Endereço: " + cf.getEndereco());
 * System.out.println("Data de Inclusão: " + cf.getDataDeInclusao());
 * System.out.println("-----------------------------------------");
 * }
 * 
 * public void ImprimirPorLinha(ClasseFornecedor cf) {
 * String mensagem = "";
 * mensagem += "Classe de Fornecedor: ";
 * mensagem += "Código: " + cf.getCodigo() + " | ";
 * mensagem += "Descrição: " + cf.getDescricao() + " | ";
 * mensagem += "Data de Inclusão: " + cf.getDataDeInclusao();
 * System.out.println(mensagem);
 * }
 * 
 * public void Exibir() {
 * ArrayList<ClasseFornecedor> lista = this.srv.Navegar();
 * System.out.println("=============================================");
 * for (ClasseFornecedor cf : lista) {
 * this.Imprimir(cf);
 * }
 * }
 * 
 * public void ExibirPorLinha() {
 * ArrayList<ClasseFornecedor> lista = this.srv.Navegar();
 * System.out.println("==============================================");
 * for (ClasseFornecedor cf : lista) {
 * this.ImprimirPorLinha(cf);
 * }
 * }
 * 
 * // ------------------------------------------------------------------------
 * public void ImprimirPorLinha(int chave) {
 * ClasseFornecedor cf = this.srv.Ler(chave);
 * this.ImprimirPorLinha(cf);
 * }
 * 
 * public void Criar(ClasseFornecedor novo) {
 * this.srv.Adicionar(novo);
 * }
 * 
 * public void Editar(int chave, ClasseFornecedor alt) {
 * ClasseFornecedor cf = this.srv.Ler(chave);
 * if (cf != null) {
 * cf.setDescricao(alt.getDescricao());
 * } else {
 * System.out.println("Item não localizado.");
 * }
 * }
 * 
 * public void Remover(int chave) {
 * ClasseFornecedor cf = this.srv.Ler(chave);
 * if (cf != null) {
 * this.srv.Deletar(chave);
 * } else {
 * System.out.println("Item não localizado.");
 * }
 * }
 * }
 */
