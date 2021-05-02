//log all pairs of an array

const arr = [1,2,3,4,5]

function logPair(arr) {
    for(var i=0; i<arr.length; i++) {
        for(var j=i; j<arr.length; j++) {
            console.log('[' + arr[i] + ', ' + arr[j] + ']');
        }
    }
}

logPair(arr)

// Time complexity = n^2