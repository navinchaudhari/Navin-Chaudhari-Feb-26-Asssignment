// const currency = "₹";
// let expenseList = [];

// const totalAmount = () => {
//   let amount = 0;
//   return (current) => {
//     amount += current;
//     return amount;
//   };
// };

// const updateTotal = totalAmount();

// function addExpensed(...newItems) {
//   expenseList = [...expenseList, ...newItems];
//   newItems.forEach((item) => updateTotal(item.amount));

// }

// 1. Variables: const for the tracker, let for the list
const CURRENCY = "$";
let expenseList = [];

// 9. Closures: Maintains the state of total expenses
function createTotalTracker() {
  let currentTotal = 0;
  return function (amount) {
    currentTotal += amount;
    return currentTotal;
  };
}
const totalTracker = createTotalTracker();

// 2. Functions & 7. Callback Functions
function addExpensesWithCallback(callback, ...newExpenses) {
  // 6. Rest Operator used above (...newExpenses)
  // 6. Spread Operator to create a new list
  expenseList = [...expenseList, ...newExpenses];

  newExpenses.forEach((exp) => totalTracker(exp.amount));

  callback("Expenses added successfully!");
}

// 2. Arrow Function & 5. Array Methods (Reduce)
const calculateTotal = () => {
  return expenseList.reduce((acc, curr) => acc + curr.amount, 0);
};

// 4. Destructuring & 5. Array Methods (Map, Filter)
function displayExpenses() {
  console.log("--- Expense Descriptions ---");
  const descriptions = expenseList.map((exp) => exp.description);
  console.log(descriptions);

  console.log("\n--- High-Value Expenses (>$20) ---");
  const expensiveOnes = expenseList.filter((exp) => exp.amount > 20);

  expensiveOnes.forEach(({ description, amount, date }) => {
    // 4. Object Destructuring used in parameters above
    console.log(`${date}: ${description} - ${CURRENCY}${amount}`);
  });
}

// 8. Promises: Simulating an API fetch
const fetchInitialExpenses = () => {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve([
        { description: "Coffee", amount: 5, date: "2024-05-01" },
        { description: "Groceries", amount: 50, date: "2024-05-02" },
      ]);
    }, 1000);
  });
};

// 10. Async/Await: Initializing the app
async function initApp() {
  console.log("Loading initial data...");
  try {
    const initialData = await fetchInitialExpenses();
    // 6. Spread again
    expenseList = [...initialData];

    // Add more using the rest operator functionality
    addExpensesWithCallback(
      (msg) => console.log(msg),
      { description: "Netflix", amount: 15, date: "2024-05-03" },
      { description: "Dinner", amount: 45, date: "2024-05-03" },
    );

    displayExpenses();
    console.log(`\nTotal Spent: ${CURRENCY}${calculateTotal()}`);
  } catch (error) {
    console.error("Failed to load expenses", error);
  }
}

// Run the application
initApp();
