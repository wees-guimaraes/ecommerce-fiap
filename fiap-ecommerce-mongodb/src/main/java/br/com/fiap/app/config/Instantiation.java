package br.com.fiap.app.config;


import br.com.fiap.app.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation  implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {


        categoryRepository.deleteAll();
        productRepository.deleteAll();
        customerRepository.deleteAll();
        addressRepository.deleteAll();
        orderRepository.deleteAll();
        orderItemRepository.deleteAll();


//        Category category1 = new Category("Informática");
//        Category category2 = new Category("Escritório");
//        Category category3 = new Category("Instrumentos Musicais");
//
//        Product product1 = new Product("Computador", 4000.00);
//        Product product2 = new Product("Impressora", 350.00);
//        Product product3 = new Product("Mouse", 50.00);
//        Product product4 = new Product("Violão", 800.00);
//        Product product5 = new Product("Guitarra", 1000.00);
//
//        category1.getProducts().addAll(List.of(product1, product2, product3));
//        category2.getProducts().addAll(List.of(product2));
//        category3.getProducts().addAll(List.of(product4, product5));
//
//        product1.getCategories().addAll(List.of(category1));
//        product2.getCategories().addAll(List.of(category1, category2));
//        product3.getCategories().addAll(List.of(category1));
//        product4.getCategories().addAll(List.of(category3));
//        product5.getCategories().addAll(List.of(category3));
//
//        categoryRepository.saveAll(List.of(category1, category2, category3));
//        productRepository.saveAll(List.of(product1, product2, product3, product4, product5));
//
//
//        Customer customer1 = new Customer("Maria Silva", "maria@gmail.com", "36378912377");
//        Customer customer2 = new Customer("Luan Fernandes", "hello@luanfernandes.dev", "36378912377");
//
//        customer1.getTelefones().addAll(List.of("27363323", "93838393"));
//        customer2.getTelefones().addAll(List.of("32657898", "985257412"));
//
//        Address address1 = new Address("Rua Flores", "300", "Apto 303", "38220834","Uberlandia","Minas Gerais", customer1);
//        Address address2 = new Address("Rua Senador Georgino", "647",  "Itaquera", "08295370","São Paulo","São Paulo", customer2);
//
//        customer1.getAddresses().addAll(List.of(address1));
//
//        customerRepository.saveAll(List.of(customer1, customer2));
//        addressRepository.saveAll(List.of(address1, address2));
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//
//        Ordered order1 = new Ordered(sdf.parse("10/12/2021 13:45"), customer1, address1);
//        Ordered order2 = new Ordered(sdf.parse("10/12/2021 14:10"), customer1, address1);
//        Ordered order3 = new Ordered(sdf.parse("12/12/2021 16:35"), customer2, address2);
//        Ordered order4 = new Ordered(sdf.parse("12/12/2021 20:47"), customer2, address2);
//
//        customer1.getOrdereds().addAll(List.of(order1, order2));
//        customer2.getOrdereds().addAll(List.of(order3, order4));
//
//        orderRepository.saveAll(List.of(order1, order2, order3, order4));
//
//        OrderItem orderItem1 = new OrderItem(order1, product2);
//        OrderItem orderItem2 = new OrderItem(order2, product3);
//        OrderItem orderItem3 = new OrderItem(order3, product1);
//        OrderItem orderItem4 = new OrderItem(order4, product4);
//        OrderItem orderItem5 = new OrderItem(order4, product5);
//
//        order1.getItems().addAll(List.of(orderItem2));
//        order2.getItems().addAll(List.of(orderItem3));
//        order3.getItems().addAll(List.of(orderItem1));
//        order4.getItems().addAll(List.of(orderItem4, orderItem5));
//
//        product1.getItems().addAll(List.of(orderItem1));
//        product2.getItems().addAll(List.of(orderItem2));
//        product3.getItems().addAll(List.of(orderItem3));
//        product4.getItems().addAll(List.of(orderItem4));
//        product5.getItems().addAll(List.of(orderItem5));
//
//        orderItemRepository.saveAll(List.of(orderItem1, orderItem2, orderItem3, orderItem4, orderItem5));
    }
}
