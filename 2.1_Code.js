// // Without Callbacks
// function square(n) {
//     return n * n;
// }
// function Cube(n) {
//     return n * n * n;
// }

// function calculation(n, fn) {
//     let num1 = fn(n);
//     let num2 = fn(n);
//     let num3 = fn(n);
//     return num1 + num2 + num3;
// }
// console.log(calculation(3,Cube));

// //Creating My own set timeout (Non-Promised)
// function MysetTimout(fun, duration) {
//     setTimeout(fun, duration);
// }

// MysetTimout(function () {
//     console.log("Hello world!");
// }, 3000);

// Promised
// function Promised(duration) {
//     return new Promise(function (resolve) {
//         setTimeout(resolve,duration)
//     })
// }
// Promised(5000).then(function () {
//     console.log("Hello world 2!");
// })


// How to get rid of promise hell: by promise chaining
// kirat().then().then();

//Async Await :

// function Promised(duration) {
//     return new Promise(function (resolve) {
//         setTimeout(resolve, duration)
//     });
// }

// async function main(){ 
//     const val = await Promised(5000);

// }

function promises() { 
    const p1 = new Promise();
    const p2 = new Promise();
    return [p1, p2];
}

const x = promises();
x[0].then(function () { 
    console.log("Hello world 1!");
})
x[1].then(function () { 
    console.log("Hello world 1!");
})

// or
Promise.all;