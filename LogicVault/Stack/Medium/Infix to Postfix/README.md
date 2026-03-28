<h2><a href="https://www.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1">Infix to Postfix</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">You are given a string <strong>s</strong> representing an <strong>infix expression</strong></span><span style="font-size: 14pt;">. Convert this infix expression to a postfix expression.</span></p>
<ul>
<li><span style="font-size: 14pt;"><strong>Infix expression:</strong> The expression of the form a <strong>op</strong> b. When an operator is in between every pair of operands.</span></li>
<li><span style="font-size: 14pt;"><strong>Postfix expression:</strong> The expression of the form a b <strong>op</strong>. When an operator is followed for every pair of operands.</span></li>
</ul>
<p><span style="font-size: 14pt;"><strong>Note:</strong>&nbsp;</span><span style="font-size: 18.6667px;">The precedence order is as follows: (^) has the highest precedence and is evaluated from right to left, (* and /) come next with left to right associativity, and (+ and -) have the lowest precedence with left to right associativity.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> s = "a*(b+c)/d"
<strong>Output:</strong> abc+*d/
<strong>Explanation:</strong> The expression is a*(b+c)/d. First, inside the brackets, b+c becomes bc+. Now the expression looks like a*(bc+)/d. Next, multiply a with (bc+), so it becomes abc+* . Finally, divide this result by d, so it becomes abc+*d/.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> s = "a+b*c+d"
<strong>Output:</strong> abc*+d+
<strong>Explanation:</strong> The expression a+b*c+d is converted by first doing b*c -&gt; bc*, then adding a -&gt; abc*+, and finally adding d -&gt; abc*+d+.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> s = "(a+b)*(c+d)"
<strong>Output:</strong> ab+cd+*<br><strong>Explanation:</strong> The expression (a+b)*(c+d) is converted by first doing (a+b) -&gt; ab+, then doing (c+d) -&gt; cd+, and finally the expression ab+*cd+ becomes ab+cd+*. </span></pre>
<p><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Constraints:</strong><br><span style="font-size: 14pt;">1 ≤ s.length ≤ 5*10<sup>3</sup></span><br><span style="font-size: 18.6667px;">s[i] can be </span></span><span style="font-size: 18.6667px;">an operand (a–z, A–Z, 0–9), an operator (+, -, *, /, ^) or a parenthesis ((, ))</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Paytm</code>&nbsp;<code>VMWare</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Stack</code>&nbsp;<code>Data Structures</code>&nbsp;