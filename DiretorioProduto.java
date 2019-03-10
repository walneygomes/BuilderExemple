
public class DiretorioProduto {
	BuilderProdutos produto;
	
	public DiretorioProduto(BuilderProdutos p){
		this.produto= p;
	}
	public void criar(){
		produto.categorias();
		produto.codigoBarra();
		produto.nome();
		produto.preco();
	}
	
	
	
	public BuilderProdutos getProduto(){
		return produto;
	}
	
}
