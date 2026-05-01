/**Question: Create a function that takes any number of arguments and returns their sum
using the rest operator */

function sum(...num) {
  let sum = 0;
  for (let i = 0; i < num.length; i++) {
    sum += num[i];
  }
  return sum;
}

console.log(sum(10, 20, 30, 40, 50, 6, 0));
