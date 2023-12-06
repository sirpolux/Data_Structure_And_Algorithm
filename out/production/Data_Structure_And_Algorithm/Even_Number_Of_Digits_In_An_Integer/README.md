# Even Number of Digits

## Problem definition

Given an array nums of integers, return how many of them contain an even number of digits.

### Concepts used

<ul>
    <li> Math.log10</li>
</ul>

``` java
Math.log10(num) +1;
//A Mathematical function that returns the power to which 10 must be raised
//to obtain the given number. The return value is type casted to Int to return only the interger portion 
//To obtain the actual length of the number we add 1 to whatever is returned
