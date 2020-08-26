#! bin/bash

# read <변수명> : 변수명에 사용자의 입력을 받는다
echo "Enter names : "
read name1 name2 name3
echo "Entered name : $name1 $name2 $name3"

# read -p <변수명> : 한 줄에 프롬프트로 사용자의 입력을 받음
read -p "username : " user_var
echo "username : $user_var"

# read -sp "password : " pass_var
# echo "password : $pass_var"

# echo : "Enter names : "
# read -a names
# echo "Names : ${names[0]}, ${names[1]}"
