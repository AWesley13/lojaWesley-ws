package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//product em minusculo é o objeto instaciado
		Product product = new Product(); 
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
		//System.out.println(product.name + "," + product.price + "," + product.quantity );
		System.out.println();//serviu para pular a linha
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();// no outro ta int pois ela foi criada
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		sc.close();
	}

}
