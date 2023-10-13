function sortArr(arr) {
    return arr.sort(function(a, b) {
        return b - a;
    });
}

const originalArr= [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5];
const sortedArr = sortArr(originalArr);
console.log("Original Array:", originalArr);
console.log("Sorted Array (Descending):", sortedArr);