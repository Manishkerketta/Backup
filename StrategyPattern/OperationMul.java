package StrategyPattern;

public class OperationMul implements Strategy{

    public int doOperation(int a, int b){
        return a*b;
    }
}
