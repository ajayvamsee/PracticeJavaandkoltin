package java;

public class AbstractSample extends Abs {
    @Override
    public void sub() {

    }

    @Override
    public int sumOfTwo(int a, int b) {
        return super.sumOfTwo(a, b);
    }

    @Override
    public void sum() {
        super.sum();
    }
}


abstract class Abs{

    public void sum(){}

    public abstract void sub();

    public int sumOfTwo(int a, int b){
        return a+b;
    }
}
