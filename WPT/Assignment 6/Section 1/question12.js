/*
12. Question: Create a promise that resolves with a message after 3 seconds.
*/

const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Promise Resolved After some delay");
  }, 3000);
});

promise.then((res) => {
  console.log(res);
});

console.log("Execution Completed");
