
public abstract class BuilderProdutos {
	public Produto produto;
	public BuilderProdutos(){
		this.produto= new Produto();
	}
	public abstract void nome();
	public abstract void codigoBarra();
	public abstract void categorias();
	public abstract void preco();

}
