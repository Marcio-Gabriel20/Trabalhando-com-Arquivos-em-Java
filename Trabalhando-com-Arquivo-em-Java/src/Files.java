import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

    Scanner sc = new Scanner(System.in);

    File file = new File("listFiles.txt");

    public void fileList() throws IOException {

        System.out.println("\nInsira o caminho:");
        String pathEntrance = sc.nextLine();

        File path = new File(pathEntrance);

        // listar arquivos

        String[] files = path.list();

        // criando arquivo

        createFiles();

        // escreve no arquivo

        FileWriter fw = new FileWriter(file, true);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Os arquivos são:");
        bw.newLine();

        for(int i = 0; i < files.length; i++) {

            // escrevendo no arquivo

            bw.write(files[i]);
            bw.newLine();

        }

        bw.close();
        fw.close();

    }

    public void createFiles() throws IOException {

        // criando o arquivo

        try {
            
            file.createNewFile();
            System.out.println("Arquivo criado com sucesso!");

        } catch (Exception e) {

            e.printStackTrace();
            
        }

    }

}