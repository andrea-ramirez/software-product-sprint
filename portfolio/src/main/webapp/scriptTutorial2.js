/** Fetches the JSON string from the server and adds it to the page. */
async function showHarryPotterQuote() {
  const responseFromServer = await fetch('/randomQuote');
  const randomQuotes = await responseFromServer.json();

  //console.log(randomMessage);

  const stringContainer = document.getElementById('harryPotterQuotes-container');
  const quote = randomQuotes[Math.floor(Math.random() * randomQuotes.length)];
  stringContainer.innerText = quote;

}

/**
 * Adds a random fun fact to the page.
 */
function showRandomFunFact() {
  const funFacts =
      ['I have three nationalities', 'I have never eaten an orange', 'An UX Designer was the first person that encouraged me to study CS', 'I am a Gryffindor! :)'];

  // Pick a random fun fact from the array.
  const fact = funFacts[Math.floor(Math.random() * funFacts.length)];

  // Add it to the page.
  const funFactsContainer = document.getElementById('funFacts-container');
  funFactsContainer.innerText = fact;
}