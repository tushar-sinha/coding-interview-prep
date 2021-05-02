// Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
//For Example:
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'i'];
//should return false.
//-----------
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'x'];
//should return true.

// 2 parameters - arrays - no size limit
// return true or false

const {
    performance
  } = require('perf_hooks');

var ar1 = ['a', 'b', 'c', 'x']
var ar2 = ['z', 'y', 'x']

function findCommon(ar1,ar2) {
    var t0 = performance.now()
    for(var i=0; i<ar1.length; i++) {
        for(var j=0; j<ar2.length; j++) {
            if(ar1[i] == ar2[j]) {
                var t1 = performance.now()
                console.log(`Perfomance when found: ${t1 - t0}ms`)
                return true;
            }
        }
    }
    var t1 = performance.now()
    console.log(`Perfomance when NOT found: ${t1 - t0}ms`)
    return false
}

console.log(findCommon(ar1, ar2))
// Time complexity: O(n^2)


function findCommonFast(ar1, ar2) {
    var t0 = performance.now()
    var mapper = {}
    for(var i=0;i<ar1.length; i++) {
        if(!mapper[ar1[i]]) {
            mapper[ar1[i]] = true;
        }
    }
    for(var i=0; i<ar2.length; i++) {
        if(mapper[ar2[i]]) {
            var t1 = performance.now()
            console.log(`Perfomance when found: ${t1 - t0}ms`)
            return true;
        }
    }
    var t1 = performance.now()
    console.log(`Perfomance when found: ${t1 - t0}ms`)
    return false;
}

console.log("fast result check: ", findCommonFast(ar1, ar2))