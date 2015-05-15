package base;

import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by yuchao on 15/4/16.
 */
@RunWith(PowerMockRunner.class)
public interface MockBaseTest {

    /**
     * 准备mock一些依赖的服务，在setup的时候调用
     */
    void prepareMock();
}

