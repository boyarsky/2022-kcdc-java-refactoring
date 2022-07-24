package apis;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToList {

    public List<String> listLonger(Stream<String> stream) {
        return stream.collect(Collectors.toList());
    }

    public List<String> listShorter(Stream<String> stream) {
        return stream.toList();
    }
}
