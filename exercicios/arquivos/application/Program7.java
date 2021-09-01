package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Products;

public class Program7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Products> produtos = new ArrayList<>();
		
		System.out.println("Entre com o caminho do arquivo: ");
		String fileSourceStr = sc.nextLine();
		
		File fileSource = new File(fileSourceStr);
		String fileFolderStr = fileSource.getParent();
		
		boolean success = new File(fileFolderStr + "\\out").mkdir();
		
		String targetFileStr = fileFolderStr + "\\out\\summary.csv";
		
		//Faz a leitura das infos do arquivo e a criação do novo arquivo
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileSourceStr))){
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				
				String[] campos = line.split(",");
				
				String nome = campos[0];
				double preco = Double.parseDouble(campos[1]);
				int quantidade = Integer.parseInt(campos[2]);
								
				produtos.add(new Products(nome, preco, quantidade));
				
				
				line = br.readLine();
				
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				
				for (Products products : produtos) {
					
					bw.write(products.getNome()+ ", " + products.total());
					bw.newLine();
				}
				
				System.out.println(targetFileStr + " CREATED!");
				
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			
			
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
		
		
		
		
	}

}

