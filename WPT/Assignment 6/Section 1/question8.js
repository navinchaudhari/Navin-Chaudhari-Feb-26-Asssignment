/**8. Question: Use the reduce method to find the total price of items in a shopping cart.
 */

const itemsPrice = [45, 19, 32, 63, 41, 25, 87, 12];
const totalPrice = itemsPrice.reduce((prev, next) => {
  return (prev += next);
});

console.log(totalPrice);
