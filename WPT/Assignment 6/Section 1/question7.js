/**
 * Question: Use the filter method to create a new array containing only the even numbers
from the given array.
 */

const numbers = [2, 8, 6, 9, 3, 4, 5, 18, 62, 91];
const evenNumbers = numbers.filter((element, index) => {
  if (element % 2 == 0) {
    return element;
  }
});

console.log(evenNumbers);
