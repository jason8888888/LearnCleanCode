package com.jaaaelu.gzw.clean_code.border;

public class B8_1__8_3 {
    //  8.1 使用第三方代码

    //  第三方程序包和框架提供者追求普适性，这样就能在多个环境中工作，吸引广泛的用户。而使用者则想要集中满足特定需求的接
    //  口。这种张力会导致系统便捷撒谎能够出现问题

    //  作者以 Map 为例，应用程序在使用 Map 的时候，初衷可能是希望所有接收者都不要删除 Map 的任何东西，然后 Java 中的 Map
    //  提供了 clear() 方法使得任何人都有权利清空 Map，这可能就不是程序设计者想要的了

    //  8.2 浏览和学习边界

    //  学习第三方代码很难。整合第三方代码也很难。同时做这两件事难上加难。如果我们采用不同的做法呢？不要在生产代码中实验
    //  新东西，而是编写测试来遍览和理解第三方代码，这也叫做学习性测试

    //  8.3 学习 log4j

    //  这里例子我就不写出来了，作者通过快速集成 log4j 在测试中添加代码，尝试使用，通过查看反馈的信息，一步步完善自己的代
    //  码，直到可以正常使用

    //  8.4 学习性测试的好处不只是免费

    //  学习性测试是一种精确实验，帮助我们增进对 API 的理解，编写测试是获得这些知识的容易而不会影响其他工作的途径

    //  学习性测试确保第三方程序包按照我们想要的方式工作。如果第三方程序包的修改与测试不兼容，我们也能马上发现

    //  8.5 使用尚不存在的代码

    //  还有另一种便捷，那种将已知和未知分隔开的边界

    //  8.6 整洁的边界

    //  边界上会发生有趣的事。改动是其中之一，又来能更好的软件设计，无需巨大投入和重写即可进行修改。在使用我们控制不了的
    //  代码时，必须加倍小心保护投资，确保未来的修改不至于代价太大

    //  应该避免我们的代码过多的了解第三方代码中的特定信息。依靠你能控制的东西，好过依赖你控制不了的东西，免得日后受它控
    //  制

    //  作者采取两种方式，一种是将其包装起来，另一种则是使用适配器模式将我们的接口转换为第三方提供的接口
}
