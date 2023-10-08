const arr= [1, 3, 5, 7, 9];
function arrSort(a1) {
  a1.sort((x1, y1) => x1 - y1);
  a1.reverse();
  return a1;
}
console.log(arrSort(arr));
