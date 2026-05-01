/**Question: Use the map method to create a new array that contains the lengths of the
names in the following array.
 */

const strings = ["Hello", "World", "Welcome", "to", "CDAC"];
const lengths = strings.map((value) => {
  return value.length;
});
console.log(lengths);
