// function to merge two sorted arrays

function mergeSorted(arr1, arr2) {
    let result = []
    let index = 0;
    for(let i=0; i < arr1.length; i++) {
        result[index++] = arr1[i]
    }
    for(let i=0;i<arr2.length; i++) {
        result[index++] = arr2[i]
    }
    
    return result.sort((a,b) => a-b)

}

function mergeSorted2(arr1, arr2) {
    let res = []
    if(arr1.length == 0) {
        return arr2
    } else if(arr1.length == 0) {
        return arr1
    }
    let arr1Item = arr1[0]
    let arr2Item = arr2[0]

    let idx1 = 0
    let idx2 = 0

    while(arr1Item || arr2Item) {
        if(!arr2Item || arr1Item < arr2Item) {
            res.push(arr1Item)
            arr1Item = arr1[++idx1]
        } else {
            res.push(arr2Item)
            arr2Item = arr2[++idx2]
        }
        if(!arr1Item && !arr2Item) {
            break
        }
    }
    return res
}

let arr1 = [0,3,4,31]
let arr2 = [4,6,30]

console.log(mergeSorted2(arr1, arr2))