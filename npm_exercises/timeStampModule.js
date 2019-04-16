const moment = require('moment');

const timestamp = {

    getTime (){
        console.log(new moment().format("h:mm:ss a"));
    }
}
module.exports = timestamp;