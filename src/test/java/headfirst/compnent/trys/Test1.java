package headfirst.compnent.trys;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import headfirst.component.trys.DefaultComponent;
import headfirst.component.trys.NormalMenu;
import headfirst.component.trys.NormalMenuItem;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Description
 * @ClassName Test1
 * @Author wangDi
 * @date 2020-12-23 14:42
 */
public class Test1 {
    @Test
    public void testComponent(){
        NormalMenu masterMenu = new NormalMenu("总菜单", "本店所有菜单");

        NormalMenu eastMenu = new NormalMenu("中餐菜单", "一些中国名菜");
        NormalMenu westMenu = new NormalMenu("西餐菜单", "欧美国家的菜单");
        masterMenu.add(eastMenu);
        masterMenu.add(westMenu);

        NormalMenuItem eastItem1 = new NormalMenuItem("宫保鸡丁", "传统名菜", 66, Boolean.FALSE);
        NormalMenuItem eastItem2 = new NormalMenuItem("北京烤鸭", "传统名菜", 888, Boolean.FALSE);
        eastMenu.add(eastItem1);
        eastMenu.add(eastItem2);

        NormalMenuItem westItem1 = new NormalMenuItem("意大利面", "西方传统美食", 138, Boolean.TRUE);
        NormalMenu snackMenu = new NormalMenu("甜品菜单", "欧美国家的甜品菜单");
        westMenu.add(westItem1);
        westMenu.add(snackMenu);


        NormalMenu drinkMenu = new NormalMenu("饮料菜单", "西方饮品");
        NormalMenuItem westItem2 = new NormalMenuItem("饼干", "西方甜点", 13, Boolean.TRUE);
        snackMenu.add(drinkMenu);
        snackMenu.add(westItem2);
        masterMenu.print();

        List<DefaultComponent> subList = masterMenu.getSubList();
        String s = JSONObject.toJSONString(subList);
        System.out.println(s);

        List<NormalMenu> defaultComponents = JSONObject.parseObject(s, new TypeReference<List<NormalMenu>>() {});
        System.out.println(defaultComponents);

    }
}
