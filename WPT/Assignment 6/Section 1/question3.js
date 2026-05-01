/*Create an object to represent a book with properties such as title, author, and
year published. Add a method to display the book details.
*/

const book = {
  title: "Java with OOPJ",
  author: "James Gasoling",
  year: "2025",
};

const { title, author, year } = book;

function display() {
  console.log(`Book Name: ${title}, Author: ${author}, Published: ${year}`);
}
display();
