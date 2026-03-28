<h2><a href="https://www.geeksforgeeks.org/problems/prefix-to-infix-conversion/1">Prefix to Infix Conversion</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p dir="ltr"><span style="font-size: 18px;">You are given a string <strong>S</strong>&nbsp;of size <strong>N</strong> that represents the prefix form of a valid mathematical expression. The string <strong>S</strong> contains only lowercase and uppercase alphabets as operands and the operators are +, -, *, /, %, and ^.Convert it to its infix form.</span></p>
<p dir="ltr"><strong><span style="font-size: 18px;">Example 1:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input: </span></strong>
<span style="font-size: 18px;">*-A/BC-/AKL</span>
<strong><span style="font-size: 18px;">Output: </span></strong>
<span style="font-size: 18px;">((A-(B/C))*((A/K)-L))</span>
<strong><span style="font-size: 18px;">Explanation: </span></strong>
<span style="font-size: 18px;">The above output is its valid infix form.
</span></pre>
<p dir="ltr"><strong><span style="font-size: 18px;">Your Task:</span></strong></p>
<p dir="ltr"><span style="font-size: 18px;">Your task is to complete the function string preToInfix(string pre_exp), which takes a prefix string as input and return its infix form.</span></p>
<p dir="ltr"><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(N).</span></p>
<p dir="ltr"><span style="font-size: 18px;"><strong>Expected Auxiliary Space:</strong> O(N).</span></p>
<p dir="ltr"><strong><span style="font-size: 18px;">Constraints:</span></strong></p>
<p dir="ltr"><span style="font-size: 18px;">3&lt;=|S|&lt;=10<sup>4</sup></span></p></div>