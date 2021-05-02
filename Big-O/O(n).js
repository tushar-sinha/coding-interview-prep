const {
    performance
  } = require('perf_hooks');
  
const nemo = ['nemo']

const large = new Array(1000).fill('nemo')

function findNemo (array) {
    var t0 = performance.now()
    //new Date()
    for(var i=0; i<array.length; i++) {
        if(array[i] == 'nemo') {
            console.log("Found Nemo!")
            break
        }
    }
    var t1 = performance.now()//new Date()
    console.log(`Call to nemo funct took: ${t1-t0}ms`)
};

findNemo(large)

// time complexity O(n)

// function printfirsthalf(items) {
//     console.log(items[0])
//     var middleIndex = Math.floor(items.length/2);
//     var index = 0;

//     while(index < middleIndex) {
//         console.log(items[index++]);
//     }

// }
// var i = 0;
// var arr = new Array(100).fill(i++);
// printfirsthalf(arr)