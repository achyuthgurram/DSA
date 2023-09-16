n<sub>c<sub>r</sub></sub> = n-1<sub>c<sub>r</sub></sub> + n- 1<sub>c<sub>r-1</sub></sub>

0<sub>c<sub>0</sub></sub> = 1

n<sub>c<sub>r</sub></sub> mod P = (n! mod P) / (r! mod P) * ((n - r)! mod P)

Using inverse modulo we can convert above to 

a<sup>-1</sup> mod P = a ==> a<sup>P - 2</sup> mod P

n<sub>c<sub>r</sub></sub> mod P = ((n! mod P) * (r!)<sup>P - 2</sup> mod P * ((n-r)!)<sup>P - 2</sup> mod P) mod P