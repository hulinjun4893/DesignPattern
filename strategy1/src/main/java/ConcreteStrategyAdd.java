/**
 * <p>
 *
 * </p>
 *
 * @author hulinjun
 * @since 2021/1/13
 */
//具体策略类，封装了具体的算法或行为，继承于Strategy
//用于加法的算法
public class ConcreteStrategyAdd extends Strategy {
    private String type;

    public String getType() {
        this.type = "add";
        return type;
    }

    @Override
    public void algorithmMethod(int numberA, int numberB) {
        System.out.println(numberA + " + " + numberB + " = " + (numberA + numberB) + ";");
    }

}
