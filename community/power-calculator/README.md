# Expression Evaluation

Consider an arithmetic expression: A+B
This is called an infix notation, when the operator (+) is between the operands (A and B).
We, humans, know how to interpret the infix notation, as that's what we are taught in schools. But this form is not very suitable for the computer to read and evaluate the expressions, because each operator has a precedence, which shows the order in which the expression needs to be evaluated. 

For example, A+B*C. We know that the multiplication need to be done first, because it has higher precedence, than the + operator. Parentheses also make a difference, for example: (A+B)*C. Now the addition needs to be done first, as parentheses dictate the precedence.

Now, we need an algorithm to "understand" the expression and calculate the result. This can be achieved using two Stacks - one for the operators, and another for the operands.

Assuming that each operator is a single character and we use only binary operators, the algorithm is:
Until the end of the expression is reached, get one character and perform only one of the steps (a) through (f):
(a) If it's an operand, push it onto the operand stack.
(b) If it's an operator, and the operator stack is empty then push it onto the operator stack.
(c) If it's an operator and the operator stack is not empty, and the character's precedence is greater than the precedence of the stack top operator, then push the character onto the operator stack.
(d) If it's "(", then push it onto operator stack.
(e) If it's ")", then, until "(" is encountered, do the following:
  1) pop operand stack once (value1) 
  2) pop operator stack once (operator) 
  3) pop operand stack again (value2)
  4) compute value1 operator value2 
  5) push the value obtained in operand stack.
  6) pop operator stack to ignore the "("
When there are no more input characters, keep processing the steps in (e), until the operator stack becomes empty. The value left in the operand stack is the final result of the expression.

Let’s consider the expression (5+3)*6.
1) "(" is pushed (=>) onto the operator stack
2) 5 => operand stack
3) + => operator stack
4) 3 => operand stack
5) ")" is encountered. The top operator and operands are popped from the stack, resulting in 5+3 being evaluated and pushed onto the operand stack. Now we have 8 on the operator stack
6) * => operator stack
7) 6 => operand stack
8) The top operator and operands are popped from the stack, resulting in 8*6 being evaluated, and resulting in 48. This is the final value, as the operator stack is empty.

## Task: 

Given an expression as a string, implement the algorithm using your desired programming language and share your creation in the comments section below!
