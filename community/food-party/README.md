# Food party

Rajat has just finished school and decided to go to a party with friends. 
In the party, he declares that he will start eating food items with low-calorie content 
like bread and then will move to items that contain more calories like the burger, until 
there is no food left(he will start eating in such a manner that he will eat high-calorie
content only after finishing low-calorie content). Once Rajat starts to eat the burger he
will not eat a burger again, so the calorie content of the food never decreases with time 
i.e. he can eat any food one time only.
You should help Rajat by indicating an order in which he can eat the foods in the way he wishes.

## Input Format
Each test case starts with N, the number of available food items.

Next N lines follow, mentioning the name of each food, where a name has less than 51 characters and has no white spaces.

Then there is another line with an integer M and M lines in the form F1 F2 will follow, indicating that food F2 has more calorie that food F1, so Rajat should eat food F1 before he starts eating food F2.

Be sure that this relation is transitive.


### Constraints
1 <= N <= 100
0 <= M <= 200


## Output Format
For each test case you must print the order in which Rajat will eat the food items.

### Sample TestCase 1
#### Input
```
3
burger
pizza
noodles
2
pizza burger
noodles pizza
```
#### Output
```
noodles pizza burger
```
