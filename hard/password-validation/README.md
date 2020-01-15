# Password Validation  

You're interviewing to join a security team. They want to see you build a password evaluator for your technical interview to validate the input.

## Task: 
Write a program that takes in a string as input and evaluates it as a valid password. The password is valid if it has at a minimum 2 numbers, 2 of the following special characters ('!', '@', '#', '$', '%', '&', '*'), and a length of at least 7 characters.
If the password passes the check, output 'Strong', else output 'Weak'.

## Input Format:
A string representing the password to evaluate.

## Output Format:
A string that says 'Strong' if the input meets the requirements, or 'Weak', if not.

## Sample Input: 

```
Hello@$World19
```

## Sample Output: 

```
Strong
```

## Explanation:
The password has 2 numbers, 2 of the defined special characters, and its length is 14, making it valid.
