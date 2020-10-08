//variables should be written in camel cas
//thisIsCamelCase

// var x = 1;
// var y = 2;
// var z = true;
// console.log(x);



//String - character and numbers in quotes

//"Hello, World"

//Number - Actual numbers

// 1 
// 10
//1000

//boolean - true or false

/* 
multi 
line 
comment
*/


// var z = 1;
// console.log(typeof z);
// z = "abc"; //changes value to 'abc
// console.log(typeof z);

//new convention for declaring variables
//let z = 1;
//const z = 1; sets a value and it can't change

/*coercion

implicit - implied type change by the computer

explicit - type change determined by the programmer
*/

/*
implicit

7 + 7 + 7; // = 21

// First two 7's are calculated... then concatened into a string. 
// returning a string value
7 + 7 + "7"; // = "147"

// The entire expression is implicitly converted into a string and concatenated 
"7" + 7 + 7; // = "777"
*/

Explicit Coercion
// perform in browser console
var amountRaisedSoFar = 1000;

var newDonation = prompt("How much would you like to donate?"); 

amountRaisedSoFar = Number(newDonation) + amountRaisedSoFar;

console.log("We have now raised: " + amountRaisedSoFar + "!");

Null - assignment value, it is a representation of "nothing"

var a = null;

Undefined - variable hasn't been assigned a value. "its of no use to you"

var b;

// foo does not exist, it is not defined and has never been initialized:
foo; // "ReferenceError: foo is not defined"

// foo is known to exist now but it has no type or value:
var foo = null; 
foo// "null"

FLOW CONTROL

IF STATEMENTS - 
Run off boolean

if(true){
	run this code
}

if(false){
	dont run this code
}

if(x > 5){
	console.log("x>5")
}

COMPARISON OPERATORS
< - less than
> - greater than
<= - less than OR equal to
>= - greater than OR equal to
== - equal to no type checking
=== - equal to including type
!= - not equal to no type checking
!== - not equal to including type
!! - 






Truthy and Falsey- 

Everything is true, except for Only falsey values: false, 0, null or undefined evaluate to false

true && true // true
true && false // false
false && true // false
false && false // false

true || true // true
true || false // true
false || true // true
false || false // false

Short-circuit Evaluation
 

As soon as the interpreter knows that a statement will evaluate to true or false, the rest of the statement is not executed.



var temp = 85;
var precipitation = false;
var indoors = true;

console.log("The temperature is " + temp + " degrees");

if (temp > 80 && precipitation === false) {
  console.log("time to swim!");
} else if (indoors) {
  console.log("time to swim!");
}

Challenge 3 Answer
var bottle = 99;

for (bottle; bottle >= 0; bottle --){

  if (bottle === 0) {
    console.log("Hey! Go buy more beer!");
  } else {
      console.log(bottle + " bottles of beer on the wall");
  }
}