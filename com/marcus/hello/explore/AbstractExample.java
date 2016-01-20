package com.marcus.hello.explore;

/**
 * @author marcus
 */
public abstract class AbstractExample {

    public void process() {
        stepBefore();
        action();
        stepAfter();
    }

    public void stepBefore() {
        //implementation directly in abstract superclass
    }

    public abstract void action(); // implemented by subclasses

    public void stepAfter() {
        //implementation directly in abstract superclass
    }
}