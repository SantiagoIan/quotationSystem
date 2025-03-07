package quotationSystem.Domain.Test;

import quotationSystem.Domain.Products;

import java.util.ArrayList;
import java.util.Scanner;

public class quotationSystemTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teste");
        ArrayList<Products> products = new ArrayList<Products>();
        int opcao;

        do {
            System.out.println("\n--- Sistema de Estoque ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Visualizar Produtos Adicionados");
            System.out.println("3. Remover Produto do Estoque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do produto que você quer adicionar: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade do produto que você quer adicionar: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do fornecedor do produto que você quer adicionar: ");
                    String nomeFornecedor = scanner.nextLine();
                    Products produto = new Products();
                    produto.setNome(nome);
                    produto.setQuantidade(quantidade);
                    produto.setFornecedor(nomeFornecedor);
                    products.add(produto);
                    break;
                case 2:
                    System.out.println();
                    for (int i = 0; i < products.size(); i++){
                        Products p = products.get(i);
                        System.out.println("Produto " + i + ": " + p.getNome() + " - " +" Quantidade: "+ p.getQuantidade() + " - " +" Fornecedor: "+ p.getFornecedor());
                    }
                    break;
                case 3:
                    System.out.println("\n--- Remover Produto ---");
                    if (products.size() > 0){
                        for (int i = 0; i < products.size(); i++){
                            Products p = products.get(i);
                            System.out.println("Produto " + i + ": " + p.getNome() + " - " + p.getQuantidade() + " - " + p.getFornecedor());
                        }
                        System.out.print("Digite o numero do produto para remover: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();
                        products.remove(indice);
                    }else{
                        System.out.println("Nenhum produto para remover.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do Sistema de Estoque");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }while (!(opcao == 4));
        scanner.close();
    }

}
