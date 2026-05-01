/**
11. Question: Write a function that accepts a callback and executes it after a delay. */

function delay(callback) {
  setTimeout(() => {
    const product = callback(20, 30);
    console.log(product);
  }, 2000);
}

function product(a, b) {
  return a * b;
}
delay(product);
console.log("Delaying Function");
