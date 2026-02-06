# Speed Reader

## About

_(TODO: insert a description of the project here!)_

### Authors

*   Brisha Jain
*   Risa Takemoto

### Resources

*   _(TODO: list your resources here!)_
*   ...
*   `DrawingPanel.java` adapted from _[Building Java Programs](https://www.buildingjavaprograms.com/) by Reges and Stepp.

## Write-up

### Semantic Mysteries

#### Problem 1.1

change1 passes the parameter x by value creating a local copy of x in change1.

change2 takes the object referenced by c and changes its field x to 5. this is passed by reference.

change3 changes the field x to 5 for both the parameter c and the local c in the function. However, the local copy of c 
in the function points at the new box which contains 0 while the parameter c still points to 5.

#### Problem 1.2

What we understood from the 4 snippets of code is that using 'this' means we are referencing the
object. Thus, 
- in counter1 value refers to the instance variable, and since there is no local variable or 
parameter with the same name,  it is incremented by 1.
- in counter2 we add value (the parameter) to value itself (in other words double it) but 
it's scope ends after the method so nothing happens.
- in counter3 since we have this.value we add the parameter value to the instance variable's value.
- in counter4 we do the opposite. we add the instance variable's value to the parameter's value and then it's
scope ends.

Thus, we see that local variables and parameters take precedence over instance variables, and using this allows 
us to explicitly reference the object’s fields when names are shadowed.

#### Problem 1.3

The first snippet of code does not work as expected because value is declared static, so all Counter objects 
share the same value. Every time a new Counter object is created, the constructor resets this 
shared value to 0.

we can fix it by
- making value non-static so each object has its own counter, or
- making the entire counter static and removing object usage.

The second snippet of code does not work because main is static and tries to call a non-static method. S
ince no object exists inside main, the method cannot be called.

we can fix it by 
- making the method static, or
- creating an object and calling the method on that object.


#### Problem 1.4

1st snippet of code:
Prints false because c1 and c2 are two different objects, and == checks whether they refer to the same object in memory, 
not whether their content is equal.

2nd snippet of code:
Prints true because both variables point to the same stored "hello" string.

3rd snippet of code:
Prints false because each input line is stored as a separate String in memory, even if the text is the same.

#### Problem 2.1

(always: ✓, sometimes: ?, never: ✗)

*   Point A:
    + `x1 == 0`: ?
    + `x2 < 0`: ?
*   Point B:
    + `x1 == 0`: ?
    + `x2 < 0`: ✗
*   Point C:
    + `y1 < 5`: ?
    + `y2 > 0`: ?
*   Point D:
    + `z > y1`: ?
    + `z < 0`: ?

#### Problem 2.2

(always: ✓, sometimes: ?, never: ✗)

|         | `s.length >= 2` | `ret.length() > 0` | `ret.length() % 2 == 0`
| ------- | --------------- | ------------------ | -----------------------
| Point A |        ?        |         ✗          |           ✓
| Point B |        ✓        |         ✗          |           ✓
| Point C |        ✓        |         ?          |           ✓
| Point D |        ✓        |         ✓          |           ✓
| Point E |        ✓        |         ✓          |           ✓

### Empirical Complexity Analysis

_(TODO: fill me in!)_
