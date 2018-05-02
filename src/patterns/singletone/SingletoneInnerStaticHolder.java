package patterns.singletone;

// “Initialization on Demand Holder”

/**
 * Cons: Problem of handling exceptional cases in SingletoneInnerStaticHolder constructor
 *
 *
 * !!! of every singleton: inheritance, several class-loaders( exmaple Servlets), 2 of more JVMs
 */

public class SingletoneInnerStaticHolder {

    private SingletoneInnerStaticHolder() {}

    private static class SingletoneValid2Holder {
        private static final SingletoneInnerStaticHolder instance = new SingletoneInnerStaticHolder();
    }

    public static SingletoneInnerStaticHolder getInstance() {
        return SingletoneValid2Holder.instance;
    }
}
