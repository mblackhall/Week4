package com.marcus.hello.exercises.strategy;

/**
 * @author marcus
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){

        this.strategy = strategy;
    }

    public int executeStrategy(int x,int y){

        return strategy.executeAlgorithm(x,y);

    }

}
