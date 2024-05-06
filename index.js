// // Example array with duplicate words
// var words = ["apple", "banana", "apple", "orange", "banana", "grape"];

// // Create a Set from the array to automatically remove duplicates
// var uniqueWordsSet = new Set(words);

// // Convert the Set back to an array using the spread operator
// var uniqueWordsArray = [...uniqueWordsSet];

// // Display the unique words 
// console.log(uniqueWordsArray);



// const readline = require('readline');

// const rl = readline.createInterface({
//   input: process.stdin,
//   output: process.stdout
// });

// rl.question('Enter variable 1: ', (variable1) => {
//   rl.question('Enter variable 2: ', (variable2) => {
//     // Process the variables here
//     console.log('Variable 1:', variable1);
//     console.log('Variable 2:', variable2);
//     rl.close();
//   });
// });


process.stdin.on('data',(data)=>{

    console.log("output : "+data.toString());
    
})