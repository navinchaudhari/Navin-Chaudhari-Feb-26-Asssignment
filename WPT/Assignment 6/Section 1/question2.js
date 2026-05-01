/*Write a function to calculate the area of a rectangle using both a regular
function and an arrow function.*/

function areaOfRectancle1(l, b) {
  console.log("Area of Rectangle: ", l * b);
}

areaOfRectancle1(10, 20);

const area = (l, b) => {
  console.log("Area of Rectangle:", l * b);
};

area(5, 3);
