import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Files files = new Files();
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Listar arquivos");
        System.out.println("\nInsira a ação que deseja executar: ");
        int action = sc.nextInt();

        switch(action) {
            case 1:
                files.fileList();
                break;
        }

        sc.close();

    }
}
