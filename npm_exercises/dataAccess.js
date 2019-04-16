const Request = require ('request-promise');
const dataAccess = {
    getPost(postID) {
        Request( `http://jsonplaceholder.typicode.com/posts/${postID}` )
        .then(resp => console.log(resp));
    }
}
module.exports = dataAccess;