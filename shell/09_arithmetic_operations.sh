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


## floating point math operations in bash

num1=20.5
num2=5

echo "20.5 + 5" | bc
echo "20.5 - 5" | bc
echo "20.5 * 5" | bc

# scale을 지정해줘야 함!!
echo "scale=2;20.5 / 5" | bc

# 변수를 사용해야하는 경우!
echo "$num1 + $num2" | bc

# 제곱
# -l : sqrt를 불러오는 라이브러리
num=27

echo "scale=2;sqrt($num)" | bc -l
echo "scale=2;3^3" | bc -l

