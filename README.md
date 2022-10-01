# Lambda Scope Lab

## Instruction

You’re given this starter code:

```java
public interface StringOperator {
  String apply(String s);
}
```

```java
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
```

Your tasks are to:

- Fix the modifiers of the `PREFIX` and `SUFFIX` variables to remove the scope error in the `operator` lambda expression.
- Update the lambda expression to remove all whitespace from `str`.

## Resources

- [java.lang.String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html)

