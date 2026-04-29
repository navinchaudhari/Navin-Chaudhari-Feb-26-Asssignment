async function generateJoke() {
  const result = document.getElementById("resultsGrid");
  const heading = document.getElementById("type");
  const question = document.getElementById("setup");
  const answer = document.getElementById("punchLine");

  const response = await fetch(
    "https://official-joke-api.appspot.com/jokes/random",
    { method: "GET" },
  );

  const responseData = await response.json();
  const { type, setup, punchline } = responseData;
//   heading.innerHTML = `Type: ${type}`;
  question.innerHTML = setup;
  answer.innerHTML = punchline;

  //   console.log(type);
  //   console.log(setup);
  //   console.log(punchline);
}
