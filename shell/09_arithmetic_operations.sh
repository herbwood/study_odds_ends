#! /bin/bash

num1=20
num2=5

# 산술 연산을 위해 $, (()), 공백
echo $(( num1 + num2 ))
echo $(( num1 - num2 ))
echo $(( num1 * num2 ))
echo $(( num1 / num2 ))
echo $(( num1 % num2 ))

# expr : * 할 때 주의!
echo $(expr $num1 + $num2)
echo $(expr $num1 \* $num2)
