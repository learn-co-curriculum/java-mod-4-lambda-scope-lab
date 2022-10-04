public class Main {
    String PREFIX = "__prefix__";
    String SUFFIX = "__suffix__";

    // fix the scope error and remove whitespace from str
    public static StringOperator operator = str -> PREFIX + str + SUFFIX;

    public static void main(String[] args) {
        String res = operator.apply("  hello there  ");
        System.out.println(res); // __prefix__hellothere__suffix__
    }

}