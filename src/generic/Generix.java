package generic;


//bound type generic have 3 way
// 1. <?> any class
// 2. <? extends Tea> Tea class or child class of Tea
// 3. <? super Tea> Tea class or super class of Tea
public class Generix<U> {
    public <U extends String> void foo() {
    }
}
