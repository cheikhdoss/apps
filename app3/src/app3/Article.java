package app3;

public class Article {
protected int id;
private String lib;

Article(int id,String lib){
	this.id=id;
	this.lib=lib;
}

public void setLib() {
	this.lib=lib;
}

public int getId() {
	return id;
}

public String getLib() {
	return lib;
}

}



 class Chemise extends Article{
	
	public String couture;
	Chemise(int id,String lib,String couture){
		super(id,lib);
		this.couture=couture;
	}
	public void setLib( String lib)
	{
		super.setLib();
	}

public int getId()
	{
		return super.getId();//// appel de la methode getLib de la classe parent (article)
	}
	public String getLib()
	{
		return super.getLib();
	}
	
	public String getCouture()
	{
		return couture;
	}	
}
	
	class Montre extends Article{
		
		public String nature;
		Montre(int id,String lib,String nature)
		{
			super(id,lib);
			this.nature=nature;
		}
		
		
		public int getId()
		{
			return id;
		}
		public String getLib()
		{
			return super.getLib();//// appel de la methode getLib de la classe parent (article)
		}
		
		
		public String getNature()
		{
			return nature;
		}
		
	}
	
	


