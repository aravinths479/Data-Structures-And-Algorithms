// Example array with duplicate words
var words = ["apple", "banana", "apple", "orange", "banana", "grape"];

// Create a Set from the array to automatically remove duplicates
var uniqueWordsSet = new Set(words);

// Convert the Set back to an array using the spread operator
var uniqueWordsArray = [...uniqueWordsSet];

// Display the unique words
console.log(uniqueWordsArray);
