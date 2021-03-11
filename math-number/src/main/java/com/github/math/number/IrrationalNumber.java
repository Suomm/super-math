/*
 * Copyright 2015-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Super Math 是一款功能强大的数学软件，可以通过计算机来将生活中复杂的数学运算或问题变得异常轻松，
 * 上手容易，简单便捷。通过在键盘上来敲一些所需要的式子（或是数字），便能灵活的做出一些运算。
 * 
 * 您可以登录以下网址获取所需要的资源，包括测试文件以及说明（或者联系作者QQ:1474983351）：
 * 
 * 				http://www.mixed.com/Super-Math
 * 
 * Super Math 作为学生必备的学习神器，专为广大学生量身定做，它综合了每个学年段的所有数学知识，无需
 * 过多时间，便可得到简洁、准确的答案。是学霸和学渣的一大福音，同样也可是数学老师的教学利器。让学习变得
 * 不再艰难，解题更加轻松，考试高分不再是梦想。
 */
package com.github.math.number;

import com.github.math.number.decimal.Decimal;

/**
 * <p>
 * 无理数，也称为无限不循环小数，不能写作两整数之比。若将它写成小数形式，小数点之后的数字有无限多个，
 * 并且不会循环。常见的无理数有非完全平方数的平方根、π和e（其中后两者均为超越数）等。无理数的另一特
 * 征是无限的连分数表达式。无理数最早由毕达哥拉斯学派弟子希伯索斯发现。
 * <p>
 * 在数学中，无理数是所有不是有理数字的实数，后者是由整数的比率（或分数）构成的数字。当两个线段的长度
 * 比是无理数时，线段也被描述为不可比较的，这意味着它们不能“测量”，即没有长度（“度量”）。常见的无理
 * 数有：圆周长与其直径的比值，欧拉数e，黄金比例φ等等。
 * <p>
 * 可以看出，无理数在位置数字系统中表示（例如，以十进制数字或任何其他自然基础表示）不会终止，也不会重
 * 复，即不包含数字的子序列。例如，数字π的十进制表示从3.14159265358979开始，但没有有限数字的数
 * 字可以精确地表示π，也不重复。必须终止或重复的有理数字的十进制扩展的证据不同于终止或重复的十进制扩展
 * 必须是有理数的证据，尽管基本而不冗长，但两种证明都需要一些工作。数学家通常不会把“终止或重复”作为有
 * 理数概念的定义。无理数也可以通过非终止的连续分数来处理。
 * <p>
 * 无理数是指实数范围内不能表示成两个整数之比的数。简单的说，无理数就是10进制下的无限不循环小数，如圆
 * 周率、 等。而有理数由所有分数，整数组成，总能写成整数、有限小数或无限循环小数，并且总能写成两整数之
 * 比，如21/7等
 * <p>
 * 毕达哥拉斯（Pythagoras，约公元前580年至公元前500年间）是古希腊的大数学家。他证明许多重要的定
 * 理，包括后来以他的名字命名的毕达哥拉斯定理（勾股定理），即直角三角形两直角边为边长的正方形的面积之和
 * 等于以斜边为边长的正方形的面积。毕达哥拉斯将数学知识运用得纯熟之后，觉得不能只满足于用来算题解题，于
 * 是他试着从数学领域扩大到哲学，用数的观点去解释一下世界。经过一番刻苦实践，他提出“万物皆为数”的观点：
 * 数的元素就是万物的元素，世界是由数组成的，世界上的一切没有不可以用数来表示的，数本身就是世界的秩序。
 * <p>
 * 公元前500年，毕达哥拉斯学派的弟子希伯索斯（Hippasus）发现了一个惊人的事实，一个正方形的对角线与
 * 其一边的长度是不可公度的（若正方形的边长为1，则对角线的长不是一个有理数），这一不可公度性与毕氏学派的
 * “万物皆为数”（指有理数）的哲理大相径庭。这一发现使该学派领导人惶恐，认为这将动摇他们在学术界的统治地
 * 位，于是极力封锁该真理的流传，希伯索斯被迫流亡他乡，不幸的是，在一条海船上还是遇到毕氏门徒。被毕氏门徒
 * 残忍地投入了水中杀害。科学史就这样拉开了序幕，却是一场悲剧。
 * <p>
 * 希伯索斯的发现，第一次向人们揭示了有理数系的缺陷，证明了它不能同连续的无限直线等同看待，有理数并没有布
 * 满数轴上的点，在数轴上存在着不能用有理数表示的“孔隙”。而这种“孔隙”经后人证明简直多得“不可胜数”。于
 * 是，古希腊人把有理数视为连续衔接的那种算术连续统的设想彻底地破灭了。不可公度量的发现连同芝诺悖论一同被
 * 称为数学史上的第一次数学危机，对以后2000多年数学的发展产生了深远的影响，促使人们从依靠直觉、经验而转
 * 向依靠证明，推动了公理几何学和逻辑学的发展，并且孕育了微积分思想萌芽。
 * <p>
 * 不可约的本质是什么？长期以来众说纷纭，得不到正确的解释，两个不可通约的比值也一直认为是不可理喻的数。
 * 15世纪意大利著名画家达.芬奇称之为“无理的数”，17世纪德国天文学家开普勒称之为“不可名状”的数。
 * <p>
 * 然而真理毕竟是淹没不了的，毕氏学派抹杀真理才是“无理”。人们为了纪念希伯索斯这位为真理而献身的可敬学者，
 * 就把不可通约的量取名“无理数”——这就是无理数的由来。
 * <p>
 * 由无理数引发的数学危机一直延续到19世纪下半叶。1872年，德国数学家戴德金从连续性的要求出发，用有理数的
 * “分割”来定义无理数，并把实数理论建立在严格的科学基础上，从而结束了无理数被认为“无理”的时代，也结束了持
 * 续2000多年的数学史上的第一次大危机。
 * <p>
 * <strong>以上内容摘自百度百科</strong>
 * 
 * @author    王帅
 * @param <T> 无理数类型
 */
public abstract class IrrationalNumber<T> 
	extends RealNumber<T> implements Decimal {
	// The serialVersionUID of the class IrrationalNumber.
	private static final long serialVersionUID = 8247199626219604762L;
}
