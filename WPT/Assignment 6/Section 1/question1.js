// 1. var: Globally or function scoped (older style, used here for the item list)
var cartItems = [];

// 2. const: For values that should never change
const TAX_RATE = 0.08; // 8% tax
const currency = "₹";

// 3. let: For values that will be recalculated or updated
let totalPrice = 0;

function addItem(name, price) {
    const newItem = { name, price };
    cartItems.push(newItem);
    console.log(`Added ${name} to cart.`);
    calculateTotal();
}

function calculateTotal() {
    // Reset total and sum up prices
    let subtotal = 0;
    
    for (let i = 0; i < cartItems.length; i++) {
        subtotal += cartItems[i].price;
    }
    
    // Applying tax and updating the 'let' variable
    totalPrice = subtotal + (subtotal * TAX_RATE);
    
    console.log(`Subtotal: ${currency}${subtotal}`);
    console.log(`Total (with tax): ${currency}${totalPrice.toFixed(2)}`);
}

// Example usage:
addItem("Earphones", 1200);
addItem("Phone Case", 500);
