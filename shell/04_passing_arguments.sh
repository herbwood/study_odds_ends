#! bin/bash

# argument로 받은 값 출력하기
echo $0 $1 $2 $3 '> echo $0 $1 $2 $3'

# argument로 받은 값 인덱스별로 출력하기
args="$@"
echo $1 $3

# argument의 수 출력
echo $#
