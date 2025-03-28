package org.example.try_arquivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MenuIOExemplo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int opcao;
        do {
            System.out.println("\n==== Menu interativo para manipular arquivos ===");
            System.out.println("1. Criar arquivo");
            System.out.println("2. Deletar arquivo");
            System.out.println("3. Copiar arquivo");
            System.out.println("4. Mover/renomear arquivo");
            System.out.println("5. Ver informações do arquivo");
            System.out.println("6. Ler arquivo linha por linha");
            System.out.println("7. Escrever dentro de um arquivo");
            System.out.println("0. Sair");
            System.out.print("Escolha a opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> criarArquivo();
                case 2 -> deletarArquivo();
                case 3 -> copiarArquivo();
                case 4 -> moverArquivo();
                case 5 -> informacoesArquivo();
                case 6 -> lerArquivo();
                case 7 -> escreverNoArquivo();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção invalida!");
            }
        } while (opcao != 0);
    }

    private static void escreverNoArquivo() throws IOException {
        System.out.print("Qual arquivo que você quer escrever: ");
        Path arquivo = Path.of(scanner.nextLine());

        System.out.println("Digite o conteúdo e digite 'FIM' para terminar");
        var builder = new StringBuilder();

        while (true) {
            String linha = scanner.nextLine();
            if (linha.equalsIgnoreCase("FIM")) break;
            builder.append(linha).append("\n");
        }

        Files.writeString(arquivo, builder.toString(), StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
        System.out.println("Arquivo salvo em: " + arquivo.toAbsolutePath());
    }

    private static void lerArquivo() throws IOException {
        System.out.print("Qual arquivo que você quer ler: ");
        Path arquivo = Path.of(scanner.nextLine());
        if (Files.exists(arquivo)) {
            List<String> linhas = Files.readAllLines(arquivo, StandardCharsets.UTF_8);
            linhas.forEach(System.out::println);
        } else {
            System.out.println("Arquivo não encontrado!");
        }
    }

    private static void informacoesArquivo() throws IOException {
        System.out.print("Nome do arquivo para pegar informações: ");
        Path arquivo = Path.of(scanner.nextLine());
        if (Files.exists(arquivo)) {
            System.out.println("Tamanho do arquivo: " + Files.size(arquivo));

            FileTime fTime = Files.getLastModifiedTime(arquivo);
            System.out.println("Ultima modificação: " + fTime.to(TimeUnit.SECONDS));

            System.out.println("É um diretório? " + Files.isDirectory(arquivo));

            var attrs = Files.readAttributes(arquivo, "*");
            System.out.println("Atributos completos: " + attrs);
        } else {
            System.out.println("Arquivo não encontrado!");
        }
    }

    private static void moverArquivo() throws IOException {
        System.out.print("Arquivo de origem: ");
        Path origem = Path.of(scanner.nextLine());
        System.out.print("Arquivo destino: ");
        Path destino = Path.of(scanner.nextLine());

        Files.move(origem, destino, StandardCopyOption.ATOMIC_MOVE);
        System.out.println("Arquivo movido/copiado!");
    }

    private static void copiarArquivo() throws IOException {
        System.out.print("Arquivo de origem: ");
        Path origem = Path.of(scanner.nextLine());
        System.out.print("Arquivo destino: ");
        Path destino = Path.of(scanner.nextLine());

        Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Arquivo copiado!");
    }

    private static void deletarArquivo() throws IOException {
        System.out.print("Nome do arquivo a daletar: ");
        Path arquivo = Path.of(scanner.nextLine());
        if (Files.exists(arquivo)) {
            Files.delete(arquivo);
            System.out.println("Arquivo apagado!");
        } else {
            System.out.println("Arquivo não encontrado!");
        }
    }

    private static void criarArquivo() throws IOException {
        System.out.print("Nome do arquivo a criar: ");
        Path arquivo = Path.of(scanner.nextLine());
        Files.createFile(arquivo);
        System.out.println("Arquivo criado: " + arquivo.toAbsolutePath());
    }


}
