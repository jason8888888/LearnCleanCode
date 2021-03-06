package com.jaaaelu.gzw.clean_code.format;

public class F5_2 {
    //  5.2 垂直格式

    //  段文件比长文件易于理解，作者举了几个开源项目的代码量，很多项目都是由相对较小的唔见组成的，没有一个超过 500 行，多
    //  数都小于 200 行

    //  5.2.1 向报纸学习

    //  想想看写的很好的报纸文章。你从上到下阅读。从顶部，你期望有个头条，告诉你故事的主题，好让你决定是否要读下去。第一
    //  段是整个故事的大纲，给出粗线条概括，但隐藏了故事细节。接着读下去，细节逐渐增加，直至你了解所有的日期、名字、引语、
    //  说话及其他细节

    //  源文件也要像报纸文章那样。名称应当简单且一目了然。名称本身应该足够告诉我们是否在正确的模块中。源文件最顶部应该给
    //  出高层次概念和算法。细节应该往下逐渐展开，直至找到源文件中最底层的函数和细节

    //  报纸有许多篇文章组成；多数短小精悍，源文件也应如此

    //  5.2.2 概念间垂直方向上的隔离

    //  几乎所有的代码都是从上往下读，从左往右读。每行展现一个表达式或一个子句，每组代码行展示一条完整的思路，这些思路用
    //  空白行区隔离出来

    //  5.2.3 垂直方向上的靠近

    //  如果说空白行隔开了概念，靠近的代码行则暗示了他们之间的紧密关系

    //  5.2.4 垂直距离

    //  关系密切的概念应该互相靠近。显然，这条规则并不适用与分布在不同文件中的概念。除非有很好的理由，否则就不要把这些关
    //  系密切的概念放在不同文件中。实际上，这也是避免使用 protected 变量的理由之一

    //  1.变量声明。变量声明应该尽可能靠近其使用位置。因为函数很短，本地变量应该在函数的顶部出现
    //  2.实体变量。应该在类的顶部声明
    //  3.相关函数。若某个函数调用了另外一个，就应该把它们放到一起，而且调用者应该尽可能放在被调用者上面。这样，程序就有
    //  个自然的顺序
    //  4.概念相关。概念相关的代码应该放到一起。相关性越强，彼此之间的距离就该越短

    //  5.2.5 垂直顺序

    //  一般而言，我们想自上向下展示函数调用顺序。也就是说，被调用的函数应该放在执行调用的函数下面
}
