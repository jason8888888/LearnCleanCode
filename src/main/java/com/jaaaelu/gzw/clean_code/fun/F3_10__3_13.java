package com.jaaaelu.gzw.clean_code.fun;

public class F3_10__3_13 {
    //  3.10 别重复自己

    //  识别重复不太容易，尤其是重复与其他代码混在一起的时候，重复会使得代码臃肿，我们要尽量对重复进行提取，消除重复也会
    //  提升代码的可读性

    //  面向对象为何要将代码集中到基类，也是为了避免冗余

    //  3.11 结构化编程

    //  函数中的每个函数都应该有一个入口、一个出口

    //  如果遵循结构化编程规则，意味着每个函数只该有一个 return 语句，循环中不能有 break 或 continue 语句

    //  作者赞成结构化编程的目的和规范，但对于小函数，这些规则助益不大，只有大函数这些规则会有明显的好处
    //  所以只要函数保存短小，偶尔出现 return、break 或 continue 语句没有坏处，甚至比单入单出原则更有表达力

    //  3.12 如何写出这样的函数

    //  作者认为写代码和写别的东西很想，在写论文或文章时，你先想到什么就写什么，然后再打磨它，直至达到你心中的样子

    //  作者也是一开始的函数冗长而复杂，有很多缩进和嵌套循环，有很长的参数列表，名称随意，也有重复代码，不过随后作者会打
    //  磨这些代码，分解函数、修改名称、消除重复，有时还拆分类

    //  并不是从一开始就按照规则写函数，因为很少有人做得到（好代码不是一蹴而就的）

    //  3.13 小结

    //  大师级程序员会把系统当做故事来讲，而不是当做程序来写
}
