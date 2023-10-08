function rev(s) {
  let a = [];
  for (let i = 0; i < s1.length; i++) {
    if (s1[i] != " ") a.unshift(s1[i]);
    else {
      while (a.length != 0) {
        process.stdout.write(a[0]);
        a.shift();
      }
      process.stdout.write(" ");
    }
  }
  while (a.length != 0) {
    process.stdout.write(a[0]);
    a.shift();
  }
}
let s1 = "This is a sunny day";
rev(s1);
