package switchExpr;

public class Example {

    public static void main(String[] args) {
        System.out.println(new Example().getLocation("Hallmark"));

    }

    public String getLocation(String store) {
        String result = "";
        switch (store) {
            case "Hallmark":
                result = "KC";
                break;
            case "Crayola":
                result = "PA";
                break;
            default:
                result = "anywhere";
        }
        return result;
    }

    public String getLocation2(String store) {
        return switch (store) {
            case "Hallmark" -> "KC";
            case "Crayola" -> "PA";
            default -> "anywhere";
        };
    }

    public int toInt(Object obj) {
       /* return switch (obj) {
            case Integer i -> i;
            case Double d -> d.intValue();
            case String s -> Integer.parseInt(s);

            default -> throw new
                    IllegalArgumentException("unknown type");
        };*/
        return 0;
    }

    sealed interface Season permits Winter, Spring, Summer, Fall{}
    final class Winter implements Season {}
    final class Spring implements Season {}
    final class Summer implements Season {}
    final class Fall implements Season {}
    public String sealed(Season season) {
        /*return switch (season) {
            case null -> "null";
            case Winter w -> "Winter";
            case Spring s -> "Spring";
            case Summer s -> "Summer";
            case Fall f -> "Fall";
        };*/
        return "";

    }

}
