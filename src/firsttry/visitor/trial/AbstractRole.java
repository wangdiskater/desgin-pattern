package firsttry.visitor.trial;

import firsttry.visitor.trial.imp.function.ActivityList;
import firsttry.visitor.trial.imp.function.Company;
import firsttry.visitor.trial.imp.function.DoctorList;
import firsttry.visitor.trial.imp.function.OrderList;

/**
 * @Description
 * @ClassName AbstractRole
 * @Author wangDi
 * @date 2020-10-22 15:11
 */
public abstract class AbstractRole {
    private String roleName;

    public abstract void visit(Company company);
    public abstract void visit(OrderList orderList);
    public abstract void visit(DoctorList doctorList);
    public abstract void visit(ActivityList activityList);

    public AbstractRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
