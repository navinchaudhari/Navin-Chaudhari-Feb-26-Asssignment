/**14. Question: Use async/await to fetch data from a public API and log it to the console. */

async function fetchAPT() {
  const response = await fetch(
    "https://official-joke-api.appspot.com/jokes/random",
    { method: "GET" },
  );
  const responseData = await response.json();
  console.log(responseData);
}

fetchAPT();
