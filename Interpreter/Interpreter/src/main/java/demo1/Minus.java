package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/11  10:26
 *@System Data  2021 08
 *
 */


public class Minus extends  AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context)-right.interpret(context);
    }


    @Override
    public String toString() {
        return "("+left.toString()+"-"+right.toString()+")";
    }
}
