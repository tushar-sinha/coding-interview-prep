class MyArray {
    constructor() {
        this.length = 0
        this.data = {}
    }
    get(index) {
        return this.data[index]
    }
    push(item) {
        this.data[this.length] = item
        this.length++;
        return this.length;
    }
    pop() {
        const lastItem = this.data[this.length-1]
        delete this.data[this.length-1]
        this.length--;
        return lastItem;
    }
    delete(index) {
        const item = this.data[index]
        this.shiftItems(index)
    }
    shiftItems(index) {
        for(let i=index;i<this.length-1; i++) {
            this.data[i] = this.data[i+1]
        }
        delete this.data[this.length-1]
        this.length--
    }
}

const arr = new MyArray();
arr.push("hi")
arr.push('you')
arr.push("are")
arr.push("nice")
arr.push("!")
console.log(arr)

arr.pop()
console.log(arr)

arr.delete(0)
console.log(arr)