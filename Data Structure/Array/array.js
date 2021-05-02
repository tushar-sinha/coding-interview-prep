const arr = [1,2,3]

arr.push(4)// O(1)

console.log("push : ", arr)

arr.pop()
console.log("pop: ", arr)
arr.pop()//O(1)
console.log("pop: ", arr)

arr.unshift(0) //O(n)
console.log("unshift", arr)

arr.splice(1, 0, 5)//O(n) -- splice is for insertion in middle, also removing element at that position

console.log("splice : ", arr)