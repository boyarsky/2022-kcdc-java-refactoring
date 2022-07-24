package module1;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reading {

    public static void main(String[] args) {
        System.out.println(embedded());
        var xml = sampleXml();
        System.out.println("*" + xml + "*");
    }

    private static String embedded() {
        return "public static void main(String[] args) {\n" +
                "        var xml = sampleXml();\n" +
                "        System.out.println(\"*\" + xml + \"*\");\n" +
                "    }";
    }

    private static String sampleXml() {
        var path = Paths.get("lab", "module1", "text.xml");
        try {
            return Files.readString(path);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
