// syntax
// var promise = new Promise(function(resolve,reject)){
//    // async logic
// }


// DETAILED IMPLEMENTATION
var taskPromise = new Promise(function (resolveFunction, rejectFunction) {
//   const taskStatus = "completedCleaningRoom";
const taskStatus = "playedGames";
  if ((taskStatus == "completedCleaningRoom")) {
    resolveFunction();
  } else if (taskStatus != "completedCleaningRoom") {
    rejectFunction();
  }
});

var successFunction = function () {
   // console.log("Promise Resloved as Sunny completed Cleaning the room: ", "Go to play");
   console.log("Go to Play!")
};

var failedFunction = function () {
//   console.log("Promise Rejected as Sunny did not clean the room and instead played mobile games: ", "Do the laundry");
console.log("Do the Laundry!");
};

taskPromise.then(successFunction).catch(failedFunction);
// for(var i = 0; i< 10000; i++) {
//    for(var j = 0; j< 1000000; j++) {}  
// }
console.log("sync operation complete")
// SHORT HAND
// var taskPromise = new Promise(function (resolveFunction, rejectFunction) {
//   const taskStatus = "completedCleaningRoom";
//   if ((taskStatus == "completedCleaningRoom")) {
//     resolveFunction();
//   } else if (taskStatus != "completedCleaningRoom") {
//     rejectFunction();
//   }
// });



//SHORT HAND IMPLEMENTATION
var taskPromise1 = new Promise(function (resolveFunction, rejectFunction) {
   //   const taskStatus = "completedCleaningRoom";
   const taskStatus = "completedCleaningRoom";
     if ((taskStatus == "completedCleaningRoom")) {
       resolveFunction();
     } else if (taskStatus != "completedCleaningRoom") {
       rejectFunction();
     }
   });

   taskPromise1.then(()=> console.log("Go to Play!!")).catch(() => console.log("Do the Laundry!!"));

   // SHORTEST
   new Promise((resolveFunction, rejectFunction) => {
      //   const taskStatus = "completedCleaningRoom";
      const taskStatus = "completedCleaningRoom";
     taskStatus == "completedCleaningRoom"?resolveFunction():rejectFunction()})
     .then(()=> console.log("Go to Play!!!")).catch(() => console.log("Do the Laundry!!!"));