
public class main {

	public static void main(String[] args) {
		
		IDbConnection dbConnection = new OracleConnection();
		ProductManager productManager = new ProductManager();
		productManager.AddToDB(new Product("Bilgisayar",1000,10), dbConnection);

	}

}
