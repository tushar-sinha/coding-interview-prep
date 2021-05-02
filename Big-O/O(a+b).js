function example(box1, box2) {
    box1.forEach(element => {
        console.log(element);
    });
    box2.forEach(el => {
        console.log(el)
    })
}

example(['a', 'b', 'c'], [1,2])

// Time complexity = O(a+b)

/*
BigO rules :
- worst case
- remove constants
- different terms for inputs
- drop non dominants
*/