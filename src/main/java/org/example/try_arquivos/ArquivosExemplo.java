package org.example.try_arquivos;

import java.io.File;
import java.io.IOException;

public class ArquivosExemplo {
    public static void main(String[] args) throws IOException {
        var homedir = new File(System.getProperty("user.dir"));

        var f = new File(homedir, "IdeaProjects/MeuProjetoJava2/conf");
        f.createNewFile();

        if (f.exists() && f.isFile() && f.canRead()) {
            var configDir = new File(homedir, "IdeaProjects/MeuProjetoJava2/config");
            configDir.mkdir();

            f.renameTo(new File(configDir, "conf"));
        } else {
            System.out.println("Erro!");
        }
    }
}
