/**
13. Question: Create a function that returns another function, demonstrating closure.
 */

function closure() {
  return () => {
    console.log("Function returning from function");
  };
}

const anotherfun = closure();
anotherfun();
