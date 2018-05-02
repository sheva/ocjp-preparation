package concurrency;

/**
 * Q: Which three will compile without exception? (Choose three)
 * A: 3, 5, 6
 */
public class Synchronized_Test {
    class SomeClass {}
    /*
    private synchronized SomeClass a;  //1
    void book1() { synchronized () {} }   //2
    public synchronized void book2() {}     //3
    public synchronized(this) void book() {}    //4
    public void book3() { synchronized(SomeClass.class) {} }    //5
    public void book4() {synchronized(a){}}     //6
    */
}
