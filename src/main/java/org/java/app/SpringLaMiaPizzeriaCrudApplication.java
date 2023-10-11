package org.java.app;

import org.java.app.db.pojo.Pizza;
import org.java.app.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}
	
	@Autowired
	private PizzaService pizzaService;
	
	@Override
	public void run(String... args) throws Exception {

		Pizza pizza1 = new Pizza("Marghi", "più che buona", "https://external-preview.redd.it/9HVyjqJOCNaSLfTKUkjr2cQYWAQmZ4LMfw4hGl7Qgo0.jpg?auto=webp&s=6a9fdad3e88d93780d3c6cbebb831f270e900c75", 5);
		Pizza pizza2 = new Pizza("Capri", "decisamente bella", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.ORThuqU_NY3VFfE_snFuKAHaE8%26pid%3DApi&f=1&ipt=481f551fae02c74d29ea0e766ac8b3c8e8c1bcc984059d5ed7737e31542fddf0&ipo=images", 8);
		Pizza pizza3 = new Pizza("Diavo", "gustosa", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.vvvx3EtLrcN5fxsfbyQGQgHaEc%26pid%3DApi&f=1&ipt=d6b9e5bfb8f13e0bf7ea1c0b1791879e32d928d767ccf4236b394ef080d8f46d&ipo=images", 9);
		Pizza pizza4 = new Pizza("Tradi", "abbastanza", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Flatteriasorrentina.com%2Fwp-content%2Fuploads%2F2019%2F06%2Fcome-fare-la-vera-pizza-1764x882.jpg&f=1&nofb=1&ipt=9702b09850b619c783f60ed59ae6d86db31f275ca246771fea95be31e6d4b552&ipo=images", 5);
		Pizza pizza5 = new Pizza("Bosca", "molto buona", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.newcroco.ro%2Fimage%2Fcache%2Fcatalog%2FBoscaiola%25200505-1000x700.jpg&f=1&nofb=1&ipt=0f1d97dbd5b8253e701ddddf0f1e6274098c55acf71e6295722c5c8c2acdddf2&ipo=images", 7);
		
		pizzaService.save(pizza1);
		pizzaService.save(pizza2);
		pizzaService.save(pizza3);
		pizzaService.save(pizza4);
		pizzaService.save(pizza5);
	}
}