package visitor.trial.imp.function;

import visitor.trial.AbstractRole;
import visitor.trial.IFunction;

/**
 * @Description
 * @ClassName OrderList
 * @Author wangDi
 * @date 2020-10-22 15:08
 */
public class OrderList implements IFunction {
    @Override
    public void accept(AbstractRole abstractRole) {
        abstractRole.visit(this);

    }
}
