package ma.mundia.productapp;

import ma.mundia.productapp.Entities.Product;
import ma.mundia.productapp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductAppApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProductAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product(null, "Computer", 3400, 2));
		productRepository.save(new Product(null, "USB", 20, 1));
		productRepository.save(new Product(null, "Printer", 16400, 1));

		List<Product> productList = productRepository.findAll();
		productList.forEach( p -> {
			System.out.println(p.toString());
		});

		Product product = productRepository.findById(Long.valueOf(1)).get();
		System.out.println("**********************Affichage*************************");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getQuantity());

		System.out.println("************************Par mot cle********************************");
		List<Product> productList1 = productRepository.findByNameContains("c");
		productList1.forEach(p -> {
			System.out.println(p);
		});

		System.out.println("************************Search********************************");
		List<Product> productList2 = productRepository.search("%U%");
		productList2.forEach(p -> {
			System.out.println(p);
		});


		System.out.println("************************Prix > 4000********************************");
		List<Product> productList3 = productRepository.searchByPrice(4000);
		productList3.forEach(p -> {
			System.out.println(p);
		});

		System.out.println("****************************Suppression****************************");
		List<Product> productList4 = productRepository.deleteAllById(3);

	}
}
