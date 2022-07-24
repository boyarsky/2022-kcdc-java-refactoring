package textblock;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example {

    public static void main(String[] args) {
        System.out.println(new Example().getJson("test"));
        System.out.println(new Example().getJson3("test"));
    }

    public String getJson(String search) {
        //TODO convert to text block when on Java 17
        String json = "{" +
                "   \"query\": \"%s\"" +
                "   \"start\": \"1\"," +
                "   \"end\": \"10\"" +
                "}";
        return String.format(json, search);
    }

    public String getJson2(String search) {
        Path path = Path.of("src/main/resources/query.json");
        String json = null;
        try {
            json = Files.readString(path);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return String.format(json, search);
    }

    public String getJson3(String search) {
        String json = """
                {
                "query": "%s"
                "start": "1"
                "end": "10"
                }""";
        return String.format(json, search);
    }
}
