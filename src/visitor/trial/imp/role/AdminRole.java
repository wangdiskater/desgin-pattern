package visitor.trial.imp.role;

import visitor.trial.AbstractRole;
import visitor.trial.imp.function.ActivityList;
import visitor.trial.imp.function.Company;
import visitor.trial.imp.function.DoctorList;
import visitor.trial.imp.function.OrderList;

/**
 * @Description
 * @ClassName AdminRole
 * @Author wangDi
 * @date 2020-10-22 15:14
 */
public class AdminRole extends AbstractRole {

    public AdminRole(String roleName) {
        super(roleName);
    }

    @Override
    public void visit(Company company) {
        System.out.println("我是公司管理！");
    }

    @Override
    public void visit(OrderList orderList) {
        System.out.println("我当然可以查看订单啊了");
    }

    @Override
    public void visit(DoctorList doctorList) {
        System.out.println("我当然可以看医生列表了");
    }

    @Override
    public void visit(ActivityList activityList) {
        System.out.println("我也可以看活动列表");

    }
}
