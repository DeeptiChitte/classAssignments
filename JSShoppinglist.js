
var shopping = ['pop tarts',
 'ramen noodles',
 'chips',
 'salsa',
 'coffee'];
 
 shopping.push("fruit loops")
 
 shopping.splice(4, 1, "fair trade coffee")
 console.log(shopping)
 shopping.splice(2, 3 , "rice", "beans")
 console.log(shopping)
 var shoppingcart = []
 console.log(shoppingcart)
shoppingcart.push(shopping.pop () )
console.log(shoppingcart)
console.log(shopping)
shoppingcart.push(shopping.shift ())
console.log(shoppingcart)
while (shopping.length > 0) {
    shoppingcart.push (shopping.shift () )
}
console.log(shoppingcart)
shoppingcart.sort ()
shoppingcart.reverse()
console.log(shoppingcart)
console.log(shoppingcart.toString())

