package patterns;

public class IfStatements {

    public void before(Object num) {
        if (num instanceof Integer) {
            Integer numAsInt = (Integer) num;
            System.out.println(numAsInt);
        }
        if (num instanceof Double) {
            Double numAsDouble = (Double) num;
            System.out.println(numAsDouble.intValue());
        }

    }

}
