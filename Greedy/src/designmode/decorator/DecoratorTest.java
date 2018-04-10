package designmode.decorator;

/**
 * Created by admin on 2018/4/10.
 */
public class DecoratorTest {
    public static void main(String[] args){
        Human person =new Person();
        Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
