package ru.appline.framework.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.appline.framework.managers.InitManager;
import ru.appline.framework.managers.PageManager;

public class BaseTests {

    protected PageManager app = PageManager.getINSTANCE();

    @BeforeEach
    public void before() {
        InitManager.initFramework();
    }

    @AfterEach
    public void after() {
        InitManager.quitFramework();
    }

}
