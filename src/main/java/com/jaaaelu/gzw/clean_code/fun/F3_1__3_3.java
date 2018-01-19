package com.jaaaelu.gzw.clean_code.fun;

public class F3_1__3_3 {
    //  3.1 短小

    //  函数的第一规则就是要短小，第二条规则是还要更短小（作者认为 20 行封顶最佳）
    //  作者曾经看到过一个程序的代码，每个函数都只有两行、三行或四行长，每个函数都一目了然，每个函数都只说一件事，而且，
    //  每个函数都依序把你带到下一个函数，这就是函数应该达到的短小程度

    //  作者认为 if 语句、else 语句、while 语句等，其中的代码块应该只有一行，该行大抵应该是一个函数调用语句
    //  这样做既保持了函数短小，又拥有较据说名性的名称

    //  3.2 只做一件事

    //  函数应该做一件事。做好这件事。只做这一件事

    //  书中有一个例子，这个方法（3-1）显然想做好几件事，它创建缓冲区、获取页面、搜索继承下来的页面、渲染路径、添加神秘的字符串、
    //  生成 HTML 等等，而作者简化后，将其拆分为多段函数，而主函数现在就只做一件事，如下：
    //  (1).判断是否为测试页面
    //  (2).如果是，这容纳近设置和分拆步骤
    //  (3).渲染成 HTML
    //  然后这里看上去是做了三件事，一步步一二三走下来，但这三个步骤均在该函数名下的同一个抽象层上（？？？这里不太容易理解）
    //  作者说，如果函数只做了该函数名下同一抽象层的步骤，则函数只做了一件事（所以这里的关键是抽象层级）

    //  所以，要判断函数是否不止做了一件事，还有一个办法，就是看是否能在拆出一个函数（并不是硬拆）

    //  只做一件事的函数无法被合理地切分为多个区段

    //  3.3 每个函数一个抽象层级

    //  作者这里提到书中 3-1 代码中，getHtml() 等位与较高抽象层的概念，String pagePathName = PathParser.render(pagePath)
    //  等位于中间抽象层次的概念，以及 .append("\n") 等位于相当低的抽象层级

    //  函数中混杂不同抽象层级，往往让人迷惑，这样读者可能无法判断某个表达式是基础概念还是细节
    //  这里也由破窗效应，一旦细节与基础概念混杂，更多的细节就会在函数中纠结起来

    //  自顶向下读代码：向下规则
    //  作者认为最佳的阅读顺序是自顶向下的，，我们想要让每个函数后面都跟着位于下一抽象层级的函数
    //  这里有一个例子：
    //  要容乃设置和分拆步骤，就先容纳设置步骤，然后纳入测试页面内容，再纳入拆分步骤
    //  要纳入设置步骤，如果是套件，就纳入套件设置步骤，然后再纳入普通设置步骤
    //  要纳入套件设置步骤，先搜索"SuitSetUp"页面的上级继承，在添加一个包含该页面路径的语句
    //  要搜索.....
}
