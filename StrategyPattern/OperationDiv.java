package StrategyPattern;

public class OperationDiv implements Strategy{

    public int doOperation(int a, int b){
        return a/b;
    }
}
