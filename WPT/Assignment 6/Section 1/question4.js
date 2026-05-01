/**Question: Given an object representing a car, use object destructuring to extract its
properties.
*/

const car = {
  model: "Thar",
  company: "Mahindra",
  color: "Black",
  launch: "2026",
  engine: "8 Stroke",
};

const { model, company, color, launch, engine } = car;

console.log(model);
console.log(company);
console.log(color);
console.log(launch);
console.log(engine);
