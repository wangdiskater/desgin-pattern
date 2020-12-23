package firsttry.visitor.trial.imp.function;

import firsttry.visitor.trial.AbstractRole;
import firsttry.visitor.trial.IFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName Company
 * @Author wangDi
 * @date 2020-10-22 15:06
 */
public class Company implements IFunction {

    List<IFunction> functionList = new ArrayList<>();

    public Company() {
        functionList.add(new OrderList());
        functionList.add(new DoctorList());
        functionList.add(new ActivityList());
    }

    /**
     * 权限管理主要在这里
     * @param abstractRole
     */
    @Override
    public void accept(AbstractRole abstractRole) {

        List<IFunction> canFunction = new ArrayList<>();
        abstractRole.visit(this);

        if ("boss".equals(abstractRole.getRoleName())) {
                canFunction.add(new OrderList());
                canFunction.add(new DoctorList());
                canFunction.add(new ActivityList());
        }
        if ("doctor".equals(abstractRole.getRoleName())) {
            canFunction.add(new OrderList());
        }
        for (IFunction iFunction : canFunction) {
            iFunction.accept(abstractRole);
        }





    }
}
