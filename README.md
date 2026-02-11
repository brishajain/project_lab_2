# Speed Reader

## About

 SpeedReader 
 Displays text from a file one word at a time using RSVP.
 The program reads words using WordGenerator and renders them to a DrawingPanel 
 at a specified words-per-minute speed.

### Authors

*   Brisha Jain
*   Risa Takemoto

### Resources

*   _(TODO: list your resources here!)_
*   ...
*   `DrawingPanel.java` adapted from _[Building Java Programs](https://www.buildingjavaprograms.com/) by Reges and Stepp.
*    Excerpt 1: https://en.wikipedia.org/wiki/Null_Island
*    Excerpt 2: https://en.wikipedia.org/wiki/Eiffel_Tower_replicas_and_derivatives 
*    Excerpt 3: https://en.wikipedia.org/wiki/Gravity_hill
*    Excerpt 4: https://en.wikipedia.org/wiki/Competitive_eating
*    Excerpt 5:  https://en.wikipedia.org/wiki/Chipmunk
*    Excerpt 6: https://en.wikipedia.org/wiki/Omnivore
*    Excerpt 7: https://en.wikipedia.org/wiki/Animal_welfare
*    Excerpt 8: https://en.wikipedia.org/wiki/Economic_vegetarianism 

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

How accurate is the operation counting method of measuring time complexity compared to the wall-clock method for understanding how the time complexity scales with the size of the input?

Operation counting works well because it focuses on how many important steps the algorithm performs as the input gets bigger. In this lab, we counted array accesses. When the input size increased, the number of accesses for compute1 grew extremely fast, compute2 grew moderately fast, and compute3 grew slowly. This matched what we saw with wall-clock time: compute1 became very slow, compute2 slowed down but still ran, and compute3 stayed efficient.

### SpeedReader: Useability test

## Questions
Excerpt 1: Null Island
What are the exact coordinates of Null Island?
Why is Null Island not considered a real island?
How is the name “Null Island” used in mapping software?
Where did the term “Null Island” originally come from?
What recurring issue in geographic information science does Null Island help address?

Excerpt 2: Eiffel Tower Replicas
In what year was the Eiffel Tower completed?
Approximately how many similar towers has the Eiffel Tower inspired worldwide?
Are most of the inspired towers exact replicas of the Eiffel Tower?
What example is given of a tower inspired by the Eiffel Tower that is not listed as a close replica?
Why are some inspired towers not included in lists of replicas?

Excerpt 3: Gravity Hills
What is another name for a gravity hill? (List one.)
What illusion does a gravity hill create?
What happens to a car left out of gear on a gravity hill?
What is the most important factor contributing to the gravity hill illusion?
Why do leaning objects such as trees contribute to the illusion?

Excerpt 4: Competitive Eating
What determines the winner in a competitive eating contest?
How long are most competitive eating contests?
In which three countries is competitive eating most popular?
What type of prize may professional eating contests offer?
Why does each contest typically use only one type of food?

## Participant Info

## Names: 
Karla Lopez [A], Devansh Punjabi [B]

## Emails: 
[lopezkar], [punjabid]

## Results
〇 indicates that they answered it correctly

Excerpt 1: 250 wpm
A〇 B〇
A〇 B
A〇 B〇
A〇 B〇

Excerpt 2: 300 wpm
A〇 B〇 
A〇 B〇
A B〇
A〇 B〇

Excerpt 3: 500 wpm
A〇 B〇
A B〇
A B〇
A〇 B

## Conclusion
Did your participants demonstrate that they were able to comprehend what they were reading with your speed reader?

Based on the results, both participants were generally able to comprehend the material when using the speed reader, particularly at lower speeds. At 250 and 300 wpm, most questions were answered correctly by both participants, which indicates the strong comprehension. However, at 500 wpm, accuracy noticeably decreased, especially for Participant A, suggesting that very high speeds may begin to impact understanding. 
Overall, the findings suggest that speed reading can maintain comprehension at moderate speeds, but comprehension may decline as the wpm rate increases significantly.

