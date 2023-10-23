package edu.estu;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import java.util.Locale;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MyOptions bean = new MyOptions();
        CmdLineParser parser = new CmdLineParser(bean);

        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            System.err.println("java -jar myprogram.jar [options...] arguments...");
            parser.printUsage(System.err);
            return;
        }

        String greeting = "";

        if ("en".equals(bean.language)) {
            greeting = "Hello, World!";
        } else if ("es".equals(bean.language)) {
            greeting = "¡Hola, Mundo!";
        } else if ("fr".equals(bean.language)) {
            greeting = "Bonjour, le Monde!";
        } else {
            System.out.println("Invalid choice. Defaulting to Latin.");
            greeting = "Salve Mundo!";
        }

        System.out.println(greeting);

    }
}
