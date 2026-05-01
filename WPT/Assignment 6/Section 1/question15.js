/**
 * Question: Create a function that takes an array of numbers, applies a filter to keep only
even numbers, then uses map to double those numbers, and finally returns the total
using reduce.
 */

const even = (numbers) => {
  return numbers.filter((num) => {
    if (num % 2 == 0) {
      return num;
    }
  });
};

const nums = [1, 2, 3, 4, 5, 6];
const res = even(nums)
  .map((value, index) => value * 2)
  .reduce((prev, next) => (prev += next));
console.log("Result: ", res);
