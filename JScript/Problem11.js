const str = "This is a sunny day"
function reverseAString(str) {
   return str.split("").reverse("").join("");
}
console.log(`Reversed string is: ${reverseAString(str)}`)