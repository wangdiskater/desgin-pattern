package visitor.trial;

import visitor.trial.imp.role.AdminRole;
import visitor.trial.imp.function.Company;
import visitor.trial.imp.role.DoctorRole;

/**
 * @Description 感觉访问者有点像鉴权的机制：每一个visitor像每一个role。然后function就是是否可以accept
 *
 * 比如说我是管理员，我可以访问医生列表，订单列表，活动列表，
 * 医生只能访问订单列表
 * 运营只能访问活动列表
 *
 *
 * @ClassName MyVisitorTest
 * @Author wangDi
 * @date 2020-10-22 14:58
 */

public class MyVisitorTest {

    public static void main(String[] args) {
        AbstractRole adminRole = new AdminRole("boss");
        AbstractRole doctorRole = new DoctorRole("doctor");

        Company company = new Company();
        company.accept(adminRole);
        System.out.println("----");
        company.accept(doctorRole);


    }
}
