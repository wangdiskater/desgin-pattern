package firsttry.visitor.trial.imp.function;

import firsttry.visitor.trial.AbstractRole;
import firsttry.visitor.trial.IFunction;

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
