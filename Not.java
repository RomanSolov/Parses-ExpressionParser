package expression;

import java.math.BigInteger;

public class Not extends AbstractUnary{
    public Not(Expres num1){
        super(num1,"~");

    }
    public String type(){
        return "";
    }
    private int operat=10;
    protected int toDo(int a){
        return ~a;
    }
    protected BigInteger toDo(BigInteger a){
        return a.not();
    }
    public int oper(){
        return 7;
    }

    @Override
    public int countPer() {
        return 0;
    }
}
