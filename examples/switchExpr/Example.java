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

}
