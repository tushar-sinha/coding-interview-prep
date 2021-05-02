// function to reverse a string
function reverse(str) {
    const arr = str.split('')
    return arr.reverse().join('')
}

function reverse2(str) {
    //check input
    if(!str || typeof str !== 'string') {
        return "Invalid input!!"
    }
    const backwards = []
    const totalItems = str.length-1
    let index =0
    for(let i=totalItems; i>=0; i--) {
        backwards[index++] = str.charAt(i)
    }

    return backwards.join('')
}

console.log(reverse2("tushar"))