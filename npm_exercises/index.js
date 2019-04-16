console.log('my application just ran');
const Moment = require ('moment');
const mocha = require('mocha');
const request = require('request-promise')
const Module = require('./module')

const chai = require('chai');
console.log(Moment.format('h:mm:ss a'));moment


    
    function logResponse(resp) {
        console.log(resp, new Moment().format('h:mm:ss a'));
    
    }
    let id = setInterval(function(){
        request('http://jsonplaceholder.typicode.com/posts/1').then(logResponse)
    },3000)

    setTimeout(function(){
        clearInterval(id)
    }, 9500)

    const mod = new Module("hi");
    mod.sayHi();


const dataMod = require('./dataAccess');
const timeMod = require('./timeStampModule');

timeMod.getTime();
dataMod.getPost(7);