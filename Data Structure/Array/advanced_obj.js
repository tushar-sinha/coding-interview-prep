// reference type

var obj1 = { val: 10}
var obj2 = obj1
var obj3 = {val : 10}

console.log(obj1 === obj2)
console.log(obj1 === obj3)


// context
const obj4 = {
    a: function() {
        console.log(this)
    }
}
obj4.a()

// instantiation

class Player {
    constructor(name, type) {
        this.name = name;
        this.type = type;
    }
    introduce() {
        console.log(`Hi I am ${this.name}, I am a ${this.type} Wizard!!`)
    }
}

class Wizard extends Player {
    constructor(name, type) {
        super(name, type)
    }
    play() {
        console.log(`Weeeeeee I am a ${this.type} Wizard!!`)
    }
}

const wiz1 = new Wizard('Alpha', 'Fire')
const wiz2 = new Wizard('Beta', 'Dark')
wiz2.introduce()
wiz2.play()

