function getShortMessages(messages) {
    
    return messages.filter(function(any){
        return any.message.length < 50;
    }).map(function(any){
        return any.message;
    });
  }

  module.exports = getShortMessages;