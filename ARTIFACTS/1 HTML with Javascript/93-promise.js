// syntax
// var promise = new Promise(function(resolve,reject)){
//    // async logic
// }

var taskPromise = new Promise(function (resolveFunction, rejectFunction) {
  const taskStatus = "completedCleaningRoom";
  if ((taskStatus == "completedCleaningRoom")) {
    resolveFunction;
  } else if (taskStatus != "completedCleaningRoom") {
    rejectFunction;
  }
});

var successFunction = function () {
   console.log("Promise Resloved as Sunny completed Cleaning the room: ", "Go to play");
};

var failedFunction = function () {
  console.log("Promise Rejected as Sunny did not clean the room and instead played mobile games: ", "Do the laundry");
};

taskPromise.then(successFunction,failedFunction);


