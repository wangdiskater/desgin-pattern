package visitor.trial.imp.role;

import visitor.trial.AbstractRole;
import visitor.trial.imp.function.ActivityList;
import visitor.trial.imp.function.Company;
import visitor.trial.imp.function.DoctorList;
import visitor.trial.imp.function.OrderList;

/**
 * @Description
 * @ClassName DoctorRole
 * @Author wangDi
 * @date 2020-10-22 15:20
 */
public class DoctorRole extends AbstractRole {
    public DoctorRole(String roleName) {
        super(roleName);
    }

    @Override
    public void visit(Company company) {
        System.out.println("进入公司");
    }

    @Override
    public void visit(OrderList orderList) {
        System.out.println("我可以查看我自己的订单");

    }

    @Override
    public void visit(DoctorList doctorList) {
        System.out.println("查看医生列表：无权限");
    }

    @Override
    public void visit(ActivityList activityList) {
        System.out.println("查看活动列表：无权限");

    }
}
