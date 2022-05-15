
// global scope
var globalScopeVar = 10;
console.log('global scope ' , globalScopeVar);
function test() {
   // function scope
   var functionScopeVar = 100;
}
function testLetConst() {
   if(true) {
      var var1 = "Jsvar";
      //block scope
      let let1 = "csslet";
      let1 = "cssletchanged";
      const const1 = 'bootstrapconst';
      // const1 = "bootstrapconstchanged";
      console.log(var1);
      console.log(let1);
      console.log(const1);
   }
   console.log(var1);
   // console.log(let1);
   //  console.log(const1);
}

testLetConst();

console.clear();

var square = function(x) {
   return x*x;
}

console.log(square(3));

const squareFun =(x) => {  return x * x  };
console.log(squareFun(4));

squareFun1 = x => x*x;
console.log(squareFun1(5));

restParamFunc = function (...nums) {
   let result = 1;
   for(let num of nums) result *= num;
   return result; 
}
console.clear();
console.log(restParamFunc(1));
console.log(restParamFunc(1,2));
console.log(restParamFunc(1,2,3));

console.clear();

numArr = [22,4,8,10,12];

function testFunct(value, index, sourceArray) {
return value < 8;
}
let result = numArr.find(testFunct);
console.log(result);
console.clear();
console.log("welcome".endsWith("come"));
let message = "hope everybody had a great learning";
let learningResult = message.startsWith("hope");
console.log(learningResult);
console.clear();
console.log(isNaN("welcome"));
console.log(isNaN("1234"));

console.clear();

function calculateSalaryWithIncrement(salary, increment = 50000) {
   return salary + increment;
}

console.log(calculateSalaryWithIncrement(100000))
console.log(calculateSalaryWithIncrement(100000, 100000))

technologies = ["java","c#","angular","react"];
entries = technologies.entries();
for(let entry of entries)
console.log(entry)
