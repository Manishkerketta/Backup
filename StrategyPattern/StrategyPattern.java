package StrategyPattern;

public class StrategyPattern {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println( context.executeStrategy(10, 5));

        context = new Context(new OperationSub());
        System.out.println( context.executeStrategy(10, 5));

        context = new Context(new OperationMul());
        System.out.println(context.executeStrategy(10, 5));

        context = new Context(new OperationDiv());
        System.out.println(context.executeStrategy(10, 5));
    }
}
