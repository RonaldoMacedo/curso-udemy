package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program17 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // arraylist é otimizada
		
		list.add("maria");
		list.add("alex");
		list.add("bob");
		list.add("anna");
		list.add(2, "marco"); // adicionar elementos entre os outros sem prejudicar quem está acima ou abaixo
		
		System.out.println(list.size()); // mostra o tamanho da lista
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------");
		list.remove(1); // remove pela posição do item na lista
		list.removeIf(x -> x.charAt(0) == 'm'); // predicado (FUNÇÃO LAMBDA)
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Index of bob: " + list.indexOf("bob")); // procurar certo elemento na lista
		System.out.println("Index of bob: " + list.indexOf("marco")); // procurar e não encontrar certo elemento na lista
		
		System.out.println("--------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList()); // manter certos elementos na lista que começa com 'a'

		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
