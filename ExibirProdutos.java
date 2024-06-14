import java.util.Scanner;    
public class exibirProdutos {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        int codigoProduto = 1; 
        while (codigoProduto != 2) {
            System.out.println(" CONSULTA DE PRODUTOS.");
            System.out.println(" 1 -Consultar produto.");
            System.out.println(" 2 - Sair do programa.");
            System.out.print(" Digite a opcao: ");
            codigoProduto = scanner.nextInt();
                switch (codigoProduto) {
                    case 5478 :
                    System.out.println(" O produto selecionado foi arroz de 5 kg:");
                    System.out.println(" preço unitário: R$ 15,90");
                    break;
                    case 3285 :
                    System.out.println(" O produto selecionado foi feijão de 1 kg:");
                    System.out.println(" preço unitário: R$ 7,50");
                    break;
                    case 8097 :
                    System.out.println(" O produto selecionado foi macarrão de 500 g:");
                    System.out.println(" preço unitário: R$ 4,20");
                    break;
                    case 7314 :
                    System.out.println(" O produto selecionado foi leite de 1L:");
                    System.out.println(" preço unitário: R$ 3,80");
                    break;
                    case 9801 :
                    System.out.println(" O produto selecionado foi pão francês kg:");
                    System.out.println(" preço unitário: R$ 12,00");
                    break;
                    case 8510 :
                    System.out.println(" O produto selecionado foi açúcar de 1kg:");
                    System.out.println(" preço unitário: R$ 2,90");
                    break;
                    case 8503:
                    System.out.println(" O produto selecionado foi café de 500g:");
                    System.out.println(" preço unitário: R$ 8,50");
                    break;
                    case 2985 :
                    System.out.println(" O produto selecionado foi óleo de soja 900ml:");
                    System.out.println(" preço unitário: R$5,60");
                    break;
                    case 6141 :
                    System.out.println(" O produto selecionado foi margarina de 500g:");
                    System.out.println(" preço unitário: R$ 4,50");
                    case 1030 :
                    System.out.println(" O produto selecionado foi sabão em pó de 1kg:");
                    System.out.println(" preço unitário: R$ 10,00");
                    break;
                    case 9001 :
                    System.out.println(" O produto selecionado foi detergente 500ml:");
                    System.out.println(" preço unitário: R$ 2,20");
                    break;
                    case 5002 :
                    System.out.println(" O produto selecionado foi papel higiênico 4un:");
                    System.out.println(" preço unitário: R$ 6,00");
                    break;
                    case 7436 :
                    System.out.println(" O produto selecionado foi shampoo 350ml:");
                    System.out.println(" preço unitário: R$ 9,90");
                    break;
                    case 0274:
                    System.out.println(" O produto selecionado foi condicionador 350ml:");
                    System.out.println(" preço unitário: R$ 9,90");
                    break;
                    case 7456 :
                    System.out.println(" O produto selecionado foi pasta de dente 90g:");
                    System.out.println(" preço unitário: R$ 3,50");
                    break;
                    case 2:
                    System.out.println("Saindo do programa! ");
                    default:
                    if (codigoProduto!=2) {
                    System.out.println (" Opção digitada não existe");
                    }
                    break;
                }
            }
            scanner.close(); 
        }
    }


