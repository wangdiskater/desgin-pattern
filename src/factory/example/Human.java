package factory.example;

/**
 * @Description 男生女生和人是 is a 的关系所以我觉得应该用继承，而不是接口
 * 我看了那个网站（https://www.programcreek.com/2013/02/java-design-pattern-factory/）上说calendar的 getInstance()也是简单工厂，但是人家就是abstract class ，所以就是使用抽象类而不是接口
 * @ClassName Human
 * @Author wangdi
 * @date 2020-10-15 11:12
 */
public abstract class Human {
    public abstract void talk();
    public abstract void walk();
}
