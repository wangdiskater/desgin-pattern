package headfirst.compound.factory;

import headfirst.compound.Goose;
import headfirst.compound.Quackable;
import headfirst.compound.adapter.GooseAdapter;

/**
 * @Description
 * @ClassName GooseFactory
 * @Author wangDi
 * @date 2020-12-10 15:11
 */
public class GooseFactory extends AbstractGooseDuckFactory{

    @Override
    Quackable createGooseDuck() {

        return new GooseAdapter(new Goose());
    }
}
